public class SingletonFactory {

    public static Factory getColaFactory(){
        return ColaFactory.colaFactory;
    }

    public static Factory getHamburgerFactory(){
        return HamburgerFactory.humbergerFactory;
    }
    
    //非同步單例
    public ColaFactory getColaFactoryAsynchronize() {
    	return new ColaFactory();
    }
    
    public HamburgerFactory getHamburgerFactoryAsynchronize() {
    	return new HamburgerFactory();
    }
    
    
    //內部靜態類實現同步單例
    private static class ColaFactory implements Factory{

        private static ColaFactory colaFactory = new ColaFactory();

        private ColaFactory(){}

        @Override
        public Product getProduct() {
            return new Cola();
        }
    }

    private static class HamburgerFactory implements Factory{

        private static HamburgerFactory humbergerFactory = new HamburgerFactory();

        private HamburgerFactory(){}

        @Override
        public Product getProduct() {
            return new Hamburger();
        }
    }
    
}