package DESIGN_PATTERN.NOTIFICATION_ENGINE.NotifiactionStrategy;

public class EmailStrategy implements INotificationStrategy {

    private String emailID;

    public EmailStrategy(String emailID){
        this.emailID = emailID;
    }

    @Override
    public void sendNotification(String content) {
        System.out.println("Sending email Notification" + emailID + "\n" + content);
    }
}
