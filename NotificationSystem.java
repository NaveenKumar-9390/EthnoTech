// Create a notification system using Interfaces

interface Notifications {
    void sendMessages(String message);
}

// Mobile Notification
class MobileNotification implements Notifications {

    public void sendMessages(String message) {
        System.out.println("Sending Mobile Notification: " + message);
    }
}

// Email Notification
class EmailNotification implements Notifications {

    public void sendMessages(String message) {
        System.out.println("Sending Email Notification: " + message);
    }
}

// Job Notification
class JobNotification implements Notifications {

    public void sendMessages(String message) {
        System.out.println("Sending Job Notification: " + message);
    }
}

// WhatsApp Notification
class WhatsAppNotification implements Notifications {

    public void sendMessages(String message) {
        System.out.println("Sending WhatsApp Notification: " + message);
    }
}

// Instagram Notification
class InstagramNotification implements Notifications {

    public void sendMessages(String message) {
        System.out.println("Sending Instagram Notification: " + message);
    }
}
public class NotificationSystem {

    public static void main(String[] args) {

        MobileNotification mobile = new MobileNotification();
        EmailNotification email = new EmailNotification();
        JobNotification job = new JobNotification();
        WhatsAppNotification whatsapp = new WhatsAppNotification();
        InstagramNotification instagram = new InstagramNotification();

        mobile.sendMessages("You have a new message!");
        email.sendMessages("Your email has arrived!");
        job.sendMessages("New Java Developer Job Available!");
        whatsapp.sendMessages("You received a WhatsApp message!");
        instagram.sendMessages("Someone liked your post!");
    }
}