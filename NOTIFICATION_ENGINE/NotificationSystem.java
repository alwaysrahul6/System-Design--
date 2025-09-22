package DESIGN_PATTERN.NOTIFICATION_ENGINE;

import.   DESIGN_PATTERN.NOTIFICATION_ENGINE.NotifiactionStrategy.EmailStrategy;
import DESIGN_PATTERN.NOTIFICATION_ENGINE.NotifiactionStrategy.NotificationEngine;
import DESIGN_PATTERN.NOTIFICATION_ENGINE.NotifiactionStrategy.PopStrategy;
import DESIGN_PATTERN.NOTIFICATION_ENGINE.NotifiactionStrategy.SMSStrategy;
import DESIGN_PATTERN.NOTIFICATION_ENGINE.NotificationDecorator.INotification;
import DESIGN_PATTERN.NOTIFICATION_ENGINE.NotificationDecorator.SignatureDecorator;
import DESIGN_PATTERN.NOTIFICATION_ENGINE.NotificationDecorator.SimpleNotification;
import DESIGN_PATTERN.NOTIFICATION_ENGINE.NotificationDecorator.TimeStampDecorator;
import DESIGN_PATTERN.NOTIFICATION_ENGINE.NotificationObserver.Logger;
import DESIGN_PATTERN.NOTIFICATION_ENGINE.NotificationObserver.NotificationObservable;
import DESIGN_PATTERN.NOTIFICATION_ENGINE.NotificationService.NotificationService;

public class NotificationSystem {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();

        NotificationObservable notificationObservable = notificationService.observable();

        Logger logger = new Logger(notificationObservable);

        NotificationEngine notificationEngine = new NotificationEngine(notificationObservable);

        notificationEngine.addNotificationStrategy(new EmailStrategy("  meetrahulsharma478@gmail.com "));

        notificationEngine.addNotificationStrategy(new SMSStrategy("6209639833"));

        notificationEngine.addNotificationStrategy(new PopStrategy());

        notificationObservable.addObserver(logger);

        notificationObservable.addObserver(notificationEngine);

        ///  Using Decorator

        INotification notification = new SimpleNotification("Your order Has Been Procced:");

        notification = new TimeStampDecorator(notification);

        notification = new SignatureDecorator(notification , "Customber Care");

        notificationService.sendNotification(notification);
    }
}
