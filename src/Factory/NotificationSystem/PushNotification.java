package Factory.NotificationSystem;

public class PushNotification extends Notification{

    public PushNotification(String recipient,String message){
        super(recipient,message);
    }

    @Override
    public NotificationType notificationType() {
        return null;
    }
    @Override
    public void sendNotification() {
        // Logic to send a push notification
        System.out.println("Push notification sent to device " + getRecipient());
        System.out.println("Message: " + getMessage());
    }
}
