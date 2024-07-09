package Factory.NotificationSystem;

import static Factory.NotificationSystem.NotificationType.*;

public class NotificationFactory {

//    public NotificationType type;
//    public NotificationFactory(String recipient, String message){
//        super();
//
//    }
    public Notification getNotificationFactory(NotificationType type,String
                                               recipient,String message,String sender){
        return NotificationFactoryFactory.getRespectiveFactory(type,recipient,message,sender);
    }

    public void createNotification(NotificationType type, String recipient, String message, String sender){

        NotificationFactoryFactory.notificationCreation(type,recipient,message,sender);

    }
//    @Override
//    public NotificationType notificationType() {
//        return NotificationFactoryFactory.typeNotification(type);
//    }
//

//    @Override
//    public void sendNotification() {
//        System.out.println(type);
//        switch (type){
//            case SMS -> {
//                System.out.println("SMS sent to "+recipient);
//                System.out.println("Message "+ message );
//            }
//            case PUSH -> {
//                System.out.println("Push notification sent to device  "+recipient);
//                System.out.println("Message "+ message );
//            }
////            case EMAIL -> {
////                System.out.println("Email sent to "+ recipient+ " from "+sender);
////            }
//            default -> throw new IllegalStateException("Unexpected value: " + type);
//        }
//    }
}
