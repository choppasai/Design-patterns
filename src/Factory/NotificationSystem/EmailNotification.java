package Factory.NotificationSystem;

public class EmailNotification extends Notification{
    private String sender;

    public String getSender() {
        return sender;
    }


    public void setSender(String sender) {
        this.sender = sender;
    }
    public EmailNotification(String recipient, String message, String sender) {
        super(recipient,message);
        this.sender = sender;
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.EMAIL;
    }

    @Override
    public void sendNotification() {
        System.out.println("Email sent to " + this.getRecipient() + " from " + sender);
        System.out.println("Message: " + this.getMessage());
    }
}
