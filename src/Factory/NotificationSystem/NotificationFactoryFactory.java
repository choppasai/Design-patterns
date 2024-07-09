package Factory.NotificationSystem;

//import static Factory.NotificationSystem.NotificationType.*;
//import static Factory.NotificationSystem.NotificationType.PUSH;

public class NotificationFactoryFactory {
    public static void notificationCreation(NotificationType type,String recipient,String message,String sender){
        switch (type){
            case NotificationType.EMAIL -> System.out.println( "email notification: "+message + "Recipient: "+recipient+" Sender: "+ sender );
            case NotificationType.PUSH -> System.out.println("Push notification: "+message + "Recipient: "+recipient);
            case NotificationType.SMS -> System.out.println("sms notification: "+message + "Recipient: "+recipient);
            default -> throw new IllegalStateException("Unexpected value: " + type);
        }
    }
    public static NotificationType typeNotification(NotificationType type){
        switch(type){
            case SMS -> {
                return NotificationType.SMS;
            }
            case EMAIL-> {
                return NotificationType.EMAIL;
            }
            case PUSH -> {
                return NotificationType.PUSH;
            }
            default -> throw new IllegalStateException("Unexpected value: " + type);
        }
    }
    public static Notification getRespectiveFactory(NotificationType type,String recipient,
    String message,
    String sender){

        switch (type){
            case SMS -> {
                return new smsNotification(recipient,message);
            }
            case EMAIL -> {
                return new EmailNotification(recipient,message,sender);
            }
            case PUSH -> {
                return new PushNotification(recipient,message);
            }
            default -> throw new IllegalArgumentException("illegal type");
        }
    }
}
