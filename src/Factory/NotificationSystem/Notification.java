package Factory.NotificationSystem;

public abstract class Notification {
    private String recipient;
    private String message;

    public Notification(String recipient, String message) {
    }

    public String getRecipient() {
        return recipient;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public abstract NotificationType notificationType();
    public abstract void sendNotification();
}
