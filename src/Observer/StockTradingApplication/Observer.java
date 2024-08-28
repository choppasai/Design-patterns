package Observer.StockTradingApplication;

public interface Observer {
    public void update(String stockName,Double currentPrice);
}
