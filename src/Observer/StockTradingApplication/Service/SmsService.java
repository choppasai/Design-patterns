package Observer.StockTradingApplication.Service;

import Observer.StockTradingApplication.Observer;
import Observer.StockTradingApplication.Utils.NotificationUtils;

public class SmsService implements Observer {
    public void sendSMS(String stockName, double currentPrice) {
        String subject = "Price update for " + stockName;
        String message = "New price is " + currentPrice;
        NotificationUtils.sendSms(subject, message);
    }

    @Override
    public void update(String stockName, Double currentPrice) {
        sendSMS(stockName,currentPrice);
    }
}
