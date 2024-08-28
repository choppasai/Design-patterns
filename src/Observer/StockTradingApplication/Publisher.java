package Observer.StockTradingApplication;

public abstract class Publisher implements ObserverRegistry{
    public abstract void  addObserver(Observer observer);

    public abstract void removeObserver(Observer observer);

    public abstract void notifyObservers(String stockName, double currentPrice);
}
