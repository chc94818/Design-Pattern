public class PriceCalculator {
    PriceStrategy strategy;

    private PriceCalculator(){};

    public PriceCalculator(PriceStrategy strategy){
        this.strategy = strategy;
    }

    public void setStrategy(PriceStrategy strategy) {
        this.strategy = strategy;
    }

    public int calculate(int km){
        return this.calculate(km,strategy);
    }

    public int calculate(int km , PriceStrategy strategy){
        this.strategy = strategy;
        return strategy.calculate(km);
    }
}