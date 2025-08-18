package DESIGN_PATTERN.NOTIFICATION_ENGINE.NotifiactionStrategy;

public class SMSStrategy implements INotificationStrategy {
    private String mobileNumber;

    public SMSStrategy(String mobileNumber){
        this.mobileNumber = mobileNumber;
    }

    @Override
    public void sendNotification(String content) {
        System.out.println("Sending Notifiaction Through Mobile:" + mobileNumber + "\n"+ content);
    }
}
