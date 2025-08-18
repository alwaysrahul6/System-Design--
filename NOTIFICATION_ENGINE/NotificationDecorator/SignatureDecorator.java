package DESIGN_PATTERN.NOTIFICATION_ENGINE.NotificationDecorator;

public class SignatureDecorator extends INotificationDecorator {

    private String signature;

    public SignatureDecorator(INotification n , String sign){
        super(n);
        this.signature = sign;
    }

    @Override
    public String getContent() {
        return notification.getContent() + signature;
    }
}
