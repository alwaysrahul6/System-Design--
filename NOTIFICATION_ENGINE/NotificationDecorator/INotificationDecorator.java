package DESIGN_PATTERN.NOTIFICATION_ENGINE.NotificationDecorator;

abstract class INotificationDecorator implements INotification {
    protected INotification  notification;

    public INotificationDecorator(INotification n){
        this.notification = n;
    }
}
