
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//枚舉單例
		SingletonEnum instance1 = SingletonEnum.INSTANCE;
		SingletonEnum instance2 = SingletonEnum.INSTANCE;
		System.out.println("Enum instance is same : " + (instance1==instance2));
		
		
		//靜態內部類單例
		Factory colaFactory = new SingletonFactory().getColaFactory();
		Factory colaFactorySyn = new SingletonFactory().getColaFactory();
		Factory colaFactoryAsyn = new SingletonFactory().getColaFactoryAsynchronize();
		Factory HBGFactory = new SingletonFactory().getHamburgerFactory();
		Factory HBGFactorySyn = new SingletonFactory().getHamburgerFactory();
		Factory HBGFactoryAsyn = new SingletonFactory().getHamburgerFactoryAsynchronize();
		
		Product colaProduct = colaFactory.getProduct();
		Product colaProductSyn = colaFactorySyn.getProduct();
		Product colaProductAsyn = colaFactoryAsyn.getProduct();
		
		Product HBGProduct = HBGFactory.getProduct();
		Product HBGProductSyn = HBGFactorySyn.getProduct();
		Product HBGProductAsyn = HBGFactoryAsyn.getProduct();
		
		System.out.println("Cola Product is : " + colaProduct.getName());
		System.out.println("Cola Product Syn is : " + colaProductSyn.getName());
		System.out.println("Cola Product Asyn is : " + colaProductAsyn.getName());
		System.out.println("Cola Factory Syn is same: " + (colaFactory== colaFactorySyn));
		System.out.println("Cola Factory Asyn is same: " + (colaFactory== colaFactoryAsyn));
		System.out.println("Hamburger Product is : " + HBGProduct.getName());
		System.out.println("Hamburger Syn Product is : " + HBGProductSyn.getName());
		System.out.println("Hamburger Asyn Product is : " + HBGProductAsyn.getName());
		System.out.println("Hamburger Factory Syn is same: " + (HBGFactory== HBGFactorySyn));
		System.out.println("Hamburger Factory Asyn is same: " + (HBGFactory== HBGFactoryAsyn));
	}

}
