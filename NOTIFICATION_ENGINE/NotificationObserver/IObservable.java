package DESIGN_PATTERN.NOTIFICATION_ENGINE.NotificationObserver;

public interface IObservable {
     void addObserver(IObserver observer);

     void removeObserver(IObserver observer);

     void notifiyObserver();
}
