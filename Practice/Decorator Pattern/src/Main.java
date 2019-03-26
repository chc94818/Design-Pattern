
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Restaurant restaurant = new Restaurant();

	    SimpleCombo simpleCombo = new SimpleCombo(restaurant);

	    System.out.println("簡餐：");
	    simpleCombo.order();

	    BusinessLunch businessLunch = new BusinessLunch(restaurant);
	    System.out.println("商業午餐：");
     	businessLunch.order();

	    FullCombo fullCombo = new FullCombo(restaurant);
	    System.out.println("全餐：");
	    fullCombo.order();
	    */ 
	     
	     
	    Order order = new Order();

	    Drink drink = new Drink();
     	MainMeal mainMealPre = new MainMeal();
     	MainMeal mainMealPost = new MainMeal();
        Soup soupPre = new Soup();
        Soup soupPost = new Soup();
        SimpleSet simpleSet = new SimpleSet();
	    //drink.decorate(order);
	    //mainMeal.decorate(drink);
	    
        mainMealPost.decorate(soupPre);
        soupPost.decorate(mainMealPre);
        
        //湯品加點主餐
        System.out.println("湯品加點主餐 : ");
        mainMealPost.show();
        //主餐加點湯品
        System.out.println("主餐加點湯品 : ");
        soupPost.show();
        
        //簡單主餐
        System.out.println("簡單主餐 : ");
        simpleSet.show();
        //湯品加點主餐
        System.out.println("湯品加點主餐 : ");
        simpleSet.decorate(soupPre);
        simpleSet.show();
	}

}
