
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DrinkOrder drinkOrder = new DrinkOrder();
        drinkOrder.addDrink(new Coffee(165));
        drinkOrder.addDrink(new MilkTea(55,new MinusDiscount(20)));
        double price = drinkOrder.getTotalPrice(new NoneDiscount(1));
        //200
        System.out.println(price);
        price = drinkOrder.getTotalPrice(new MultiplyStrategy(0.9));
        //打九折
        System.out.println(price);
	}

}
