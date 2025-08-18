package DESIGN_PATTERN.NOTIFICATION_ENGINE.NotificationObserver;

public class Logger implements IObserver {

    private NotificationObservable notificationObservable;

    public Logger(NotificationObservable noti){
        this.notificationObservable = noti;
    }

    @Override
    public void update() {
        System.out.println("Logging New Notification : \n" + notificationObservable.getNotification());
    }
}
