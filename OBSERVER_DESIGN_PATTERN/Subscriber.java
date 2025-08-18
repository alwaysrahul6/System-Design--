package DESIGN_PATTERN.OBSERVER_DESIGN_PATTERN;

public class Subscriber implements ISubscriber{
    String name;

    Channel channel;

    public Subscriber(String name,Channel channel){
        this.name = name;
        this.channel = channel;
    }

    @Override
    public void update() {
        System.out.println(" Hey " + name + " latest Video " + channel.getVideoData());
    }
}
