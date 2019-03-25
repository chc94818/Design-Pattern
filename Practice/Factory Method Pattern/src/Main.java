
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Factory friesFac = new FrenchFriesFactory();
	     Product fries = friesFac.getProduct();
	     Product myfries = ((FrenchFriesFactory) friesFac).getProduct("無鹽的");

	     fries.describe();//我是有鹽的薯條
	     myfries.describe();//我是無鹽的薯條
	}

}
