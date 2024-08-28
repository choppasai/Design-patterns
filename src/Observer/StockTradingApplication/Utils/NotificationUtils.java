package Observer.StockTradingApplication.Utils;

public class NotificationUtils {
    public static void sendEmail(String subject, String content) {
        System.out.println(" Alert "+ subject+" "+ content);
    }

    public static void sendSms(String subject, String content) {
        System.out.println(" Alert "+ subject+" "+ content);
    }

    public static void sendPush(String subject, String content) {
        System.out.println(" Alert "+ subject+" "+ content);
    }
}
