public class FrenchFriesFactory implements Factory {

    //��^�@�몺����
    @Override
    public Product getProduct() {
        return new FrenchFries();
    }

    //��^�ڭ̷Q�n�����A������..
    public Product getProduct(String state) {
        return new FrenchFries(state);
    }
}