package Observer.StockTradingApplication;

import java.util.HashSet;

public class StockTradingManager extends Publisher {
    private final String stockName;
    private double currentPrice;
    private final double notificationThreshold;
    HashSet<Observer> observerList = new HashSet<>();

    public StockTradingManager(String stockName, double initialPrice, double notificationThreshold) {
        this.stockName = stockName;
        this.currentPrice = initialPrice;
        this.notificationThreshold = notificationThreshold;
    }

    public void updateStockPrice(double newPrice) {
        currentPrice = newPrice;
        if (currentPrice > notificationThreshold) {
            notifyObservers(stockName,currentPrice);
        }
    }

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers(String stockName, double currentPrice) {
        for (Observer observer : observerList) {
            observer.update(stockName, currentPrice);
        }
    }
}
