package DESIGN_PATTERN.NOTIFICATION_ENGINE.NotificationObserver;

import DESIGN_PATTERN.NOTIFICATION_ENGINE.NotificationDecorator.INotification;

import java.util.ArrayList;
import java.util.List;

public class NotificationObservable implements IObservable {

    private List<IObserver>observers = new ArrayList<>();

    private INotification currentnotification;

    @Override
    public void addObserver(IObserver obs) {
       observers.add(obs);
    }

    @Override
    public void removeObserver(IObserver obs) {
        observers.remove(obs);
    }

    @Override
    public void notifiyObserver() {
        for (IObserver obser : observers){
            obser.update();
        }
    }

    public void setNotification(INotification notification){
        this.currentnotification = notification;
        notifiyObserver();
    }

    public INotification getCurrentnotification(){
        return currentnotification;
    }

    public String getNotification(){
        return currentnotification.getContent();
    }
}
