package Observer.StockTradingApplication;

import Observer.StockTradingApplication.Service.AppService;
import Observer.StockTradingApplication.Service.EmailService;
import Observer.StockTradingApplication.Service.SmsService;

public class Client {
    public static void main(String[] args){
        StockTradingManager manage = new StockTradingManager("Google",166.38,170.00);
        Observer emailObserver = new EmailService();
        Observer smsObserver = new SmsService();
        Observer appService = new AppService();
        manage.addObserver(emailObserver);
        manage.addObserver(appService);
        manage.addObserver(smsObserver);
        manage.updateStockPrice(171.90);
    }
}
