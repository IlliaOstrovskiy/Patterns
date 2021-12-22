package generating_patterns.factory;

import generating_patterns.factory.factories.EmailNotificationFactory;
import generating_patterns.factory.factories.Factory;
import generating_patterns.factory.factories.SmsNotificationFactory;
import generating_patterns.factory.model.EmailNotification;
import generating_patterns.factory.model.SmsNotification;

public class DemoFactory {
    public static void main(String[] args) {
        Factory<EmailNotification> factory = new EmailNotificationFactory();
        System.out.println(factory.createObject().getClass());
        factory.sendNotification();
        Factory<SmsNotification> factory1 = new SmsNotificationFactory();
        System.out.println(factory1.createObject().getClass());
        factory1.sendNotification();
    }
}
