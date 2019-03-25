public class SingletonFactory {

    public static Factory getColaFactory(){
        return ColaFactory.colaFactory;
    }

    public static Factory getHamburgerFactory(){
        return HamburgerFactory.humbergerFactory;
    }
    
    //�D�P�B���
    public ColaFactory getColaFactoryAsynchronize() {
    	return new ColaFactory();
    }
    
    public HamburgerFactory getHamburgerFactoryAsynchronize() {
    	return new HamburgerFactory();
    }
    
    
    //�����R�A����{�P�B���
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