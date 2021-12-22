package generating_patterns.factory.factories;

import generating_patterns.factory.model.EmailNotification;

public class EmailNotificationFactory implements Factory<EmailNotification>{
    @Override
    public EmailNotification createObject() {
        return new EmailNotification();
    }

    @Override
    public void sendNotification() {
        System.out.println("Notification send via Email");
    }
}
