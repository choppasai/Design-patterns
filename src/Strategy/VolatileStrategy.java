package Strategy;

public class VolatileStrategy implements TradingIndicatorStrategy {

    @Override
    public TradingStrategyType getStrategyType() {
        return TradingStrategyType.VOLATILITY;
    }

    @Override
    public Double Calculate(Stock stock) {
        return Math.abs(stock.getPrice() - stock.getPreviousPrice());
    }
}
