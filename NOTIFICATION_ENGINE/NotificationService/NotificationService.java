package DESIGN_PATTERN.NOTIFICATION_ENGINE.NotificationService;

import DESIGN_PATTERN.NOTIFICATION_ENGINE.NotificationDecorator.INotification;
import DESIGN_PATTERN.NOTIFICATION_ENGINE.NotificationObserver.NotificationObservable;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {
    private final NotificationObservable observable;

    private static NotificationService instance;

    private final List<INotification> notificationStrategies = new ArrayList<>();

    public NotificationService(){
        observable = new NotificationObservable();
    }

    private static NotificationService getInstance(){
        if (instance == null){
            instance = new NotificationService();
        }
        return instance;
    }

    public NotificationObservable observable(){
        return observable;
    }

    public void sendNotification(INotification notification){
        notificationStrategies.add(notification);
        observable.setNotification(notification);
    }
}
