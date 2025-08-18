package DESIGN_PATTERN.NOTIFICATION_ENGINE.NotifiactionStrategy;

import DESIGN_PATTERN.NOTIFICATION_ENGINE.NotificationObserver.IObserver;
import DESIGN_PATTERN.NOTIFICATION_ENGINE.NotificationObserver.NotificationObservable;

import java.util.ArrayList;
import java.util.List;

public class NotificationEngine implements IObserver {

    private NotificationObservable notificationObservable;

    private List<INotificationStrategy> notificationStrategies = new ArrayList<>();

    public NotificationEngine(NotificationObservable ns){
        this.notificationObservable = ns;
    }

    @Override
    public void update() {
        String notificationContent = notificationObservable.getNotification();
        for (INotificationStrategy start : notificationStrategies){
            start.sendNotification(notificationContent);
        }
    }
    public void addNotificationStrategy(INotificationStrategy ns) {
        this.notificationStrategies.add(ns);
    }
}
