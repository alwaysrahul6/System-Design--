package DESIGN_PATTERN.OBSERVER_DESIGN_PATTERN;

import java.util.ArrayList;
import java.util.List;

public class Channel implements IChannel{
    private final String name ;
    private String latestVideo;
    private final List<ISubscriber>subscribers;

    public Channel(String name){
        this.name = name;
        this.subscribers = new ArrayList<>();
    }

    @Override
    public void subscribe(ISubscriber subscriber) {
        if (!subscribers.contains(subscriber)){
            subscribers.add(subscriber);
        }
    }

    @Override
    public void unSubscribe(ISubscriber subscriber) {
        if (subscribers.contains(subscriber)){
            subscribers.remove(subscriber);
        }
    }

    public void uploadVideo(String title){
        latestVideo = title;
        System.out.println("\n[" + name + " uploaded \"" + title + "\"]");
        notifiy();
    }


    @Override
    public void notifiy() {
        for (ISubscriber subscribe : subscribers) {
            subscribe.update();
        }
    }


    public String  getVideoData(){
        return "This is My Latest Video : " + latestVideo + "\n";
    }
}
