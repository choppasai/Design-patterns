package Strategy;

public class MomentumStrategy implements TradingIndicatorStrategy{
    @Override
    public TradingStrategyType getStrategyType() {
        return TradingStrategyType.MOMENTUM;
    }

    @Override
    public Double Calculate(Stock stock) {
        return stock.getPrice() - stock.getPreviousPrice();
    }
}
