package DESIGN_PATTERN.NOTIFICATION_ENGINE.NotifiactionStrategy;

public class PopStrategy implements INotificationStrategy {

    @Override
    public void sendNotification(String content) {
        System.out.println("Sending POP UP Notification \n" + content);
    }
}
