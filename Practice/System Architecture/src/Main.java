
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DrinkShop drinkShop = new DrinkShop();
        
        //�I�@�M�Q�s��
        Tea tea = (Tea)drinkShop.order("Tea", Drink.SugarType.FREE, Drink.IceType.EASY);
        tea.setTeaType(Tea.TeaType.OOLONG);
        

        //�I�@�M����
        Coffee coffee = (Coffee)drinkShop.order("coffee", Drink.SugarType.QUARTER,Drink.IceType.HOT);
        coffee.setCoffeeType(Coffee.CoffeeType.AMERICANO);
	}

}
