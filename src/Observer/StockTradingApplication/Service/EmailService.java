package Observer.StockTradingApplication.Service;

import Observer.StockTradingApplication.Observer;
import Observer.StockTradingApplication.Utils.NotificationUtils;

public class EmailService implements Observer {
    public void sendEmail(String stockName, double currentPrice) {
        String subject = "Price update for " + stockName;
        String message = "New price is " + currentPrice;
        NotificationUtils.sendEmail(subject, message);
    }

    @Override
    public void update(String stockName, Double currentPrice) {
        sendEmail(stockName,currentPrice);
    }
}
