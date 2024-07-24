package Strategy;

public class StockTradingManager {

    private TradingIndicatorStrategy strategy;
    private TradingStrategyType type;

    public StockTradingManager(TradingIndicatorStrategy strategy, TradingStrategyType type) {
        this.strategy = strategy;
        this.type = type;
    }
    public Double calculateIndicator(Stock stock){
        return strategy.Calculate(stock);
    }
}
