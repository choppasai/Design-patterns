package Factory.NotificationSystem;

public class smsNotification extends Notification{

    public smsNotification(String recipient,String message){
        super(recipient,message);
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.SMS;
    }

    @Override
    public void sendNotification() {
        System.out.println("SMS sent to " + getRecipient());
        System.out.println("Message: " + getMessage());
    }
}
