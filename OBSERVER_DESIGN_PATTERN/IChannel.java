package DESIGN_PATTERN.OBSERVER_DESIGN_PATTERN;

public interface IChannel {
    void subscribe(ISubscriber subscriber);
    void unSubscribe(ISubscriber subscriber);
    void notifiy();
}
