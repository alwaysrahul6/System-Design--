package DESIGN_PATTERN.NOTIFICATION_ENGINE.NotificationDecorator;

public class SimpleNotification implements INotification {

    private String text;

    public SimpleNotification(String msg){
        this.text = msg;
    }

    @Override
    public String getContent() {
        return text;
    }
}
