
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Factory friesFac = new FrenchFriesFactory();
	     Product fries = friesFac.getProduct();
	     Product myfries = ((FrenchFriesFactory) friesFac).getProduct("�L�Q��");

	     fries.describe();//�ڬO���Q������
	     myfries.describe();//�ڬO�L�Q������
	}

}
