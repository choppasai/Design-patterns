package Strategy;

public class MovingAverageStrategy implements TradingIndicatorStrategy{
    @Override
    public TradingStrategyType getStrategyType() {
        return TradingStrategyType.MOVING_AVERAGES;
    }

    @Override
    public Double Calculate(Stock stock) {
        return (stock.getPrice() + stock.getPreviousPrice()) / 2;
    }
}
