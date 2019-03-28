
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//外觀模式讓使用者有一個統一清楚的介面來使用內部的方法
		Facade facade = new Facade();

        System.out.println("MethodA : ");
        facade.MethodA();

        System.out.println("MethodB : ");
        facade.MethodB();
	}

}
