package Factory.NotificationSystem;

public class Client {
    public static void main(String[] args) {
    NotificationFactory notificationFactory = new NotificationFactory();
    notificationFactory.createNotification(NotificationType.EMAIL,"myRecipent","myMessage","Mysender");
    Notification notification = notificationFactory.getNotificationFactory(NotificationType.SMS,"sai","hello","praveen");
    notification.sendNotification();

    }
}
