package generating_patterns.factory.factories;

import generating_patterns.factory.model.SmsNotification;

public class SmsNotificationFactory implements Factory<SmsNotification>{
    @Override
    public SmsNotification createObject() {
        return new SmsNotification();
    }

    @Override
    public void sendNotification() {
        System.out.println("Notification send via email");
    }
}
