package Strategy;

public interface TradingIndicatorStrategy {
    TradingStrategyType getStrategyType();
    Double Calculate(Stock stock);

}
