
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DrinkShop drinkShop = new DrinkShop();
        
        //點一杯烏龍茶
        Tea tea = (Tea)drinkShop.order("Tea", Drink.SugarType.FREE, Drink.IceType.EASY);
        tea.setTeaType(Tea.TeaType.OOLONG);
        

        //點一杯美式
        Coffee coffee = (Coffee)drinkShop.order("coffee", Drink.SugarType.QUARTER,Drink.IceType.HOT);
        coffee.setCoffeeType(Coffee.CoffeeType.AMERICANO);
	}

}
