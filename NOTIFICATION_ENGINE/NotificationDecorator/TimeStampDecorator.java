package DESIGN_PATTERN.NOTIFICATION_ENGINE.NotificationDecorator;

public class TimeStampDecorator extends INotificationDecorator {

    public TimeStampDecorator(INotification notification){
        super(notification);
    }

    @Override
    public String getContent() {
        return "[2025-04-13 14:22:00] " + notification.getContent();
    }
}
