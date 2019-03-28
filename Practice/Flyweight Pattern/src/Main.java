
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//享元模式:將可能重複使用到的物件實例後儲存，避免重複實例浪費
		MacbookFactory factory = new MacbookFactory();

        Macbook goodbook = factory.getMacbook(Macbook.Spec.HIGH);

        System.out.println(goodbook.toString());

        CustomSetting superSetting = new CustomSetting();

        superSetting.setCpu("i9");
        superSetting.setMemory(32);
        superSetting.setStorage(1024);

        Macbook superMacbook = factory.getCustomMacbook(superSetting);

        System.out.println(superMacbook.toString());
	}

}
