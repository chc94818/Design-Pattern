//折價策略的抽象類
public abstract class IDiscountStrategy {
	double discount;

    private IDiscountStrategy(){}

    public IDiscountStrategy(double discount){
        this.discount = discount;
    }

    abstract public double getValue(double value);
}
