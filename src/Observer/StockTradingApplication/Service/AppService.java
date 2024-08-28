package Observer.StockTradingApplication.Service;

import Observer.StockTradingApplication.Observer;
import Observer.StockTradingApplication.Utils.NotificationUtils;

public class AppService implements Observer {
    public void sendPush(String stockName, double currentPrice) {
        String subject = "Price update for " + stockName;
        String message = "New price is " + currentPrice;
        NotificationUtils.sendPush(subject, message);
    }

    @Override
    public void update(String stockName,Double currentPrice) {
        sendPush(stockName,currentPrice);
    }
}
