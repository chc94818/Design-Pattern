
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//橋接模式 : 利用繼承可以加強程式碼的重複使用，但卻降低了類別的靈活性
		//透過組合不同類別來形成集合，將繼承的關係細分拆開，加強靈活性
		FewView fewView = new FewView();
        System.out.println("---- 簡單包包說明 ----");
        fewView.setResources(new Bag());
        fewView.show();
        System.out.println("---- 簡單書本說明 ----");
        fewView.setResources(new Book());
        fewView.show();

        FullView fullView = new FullView();
        System.out.println("---- 詳細包包說明 ----");
        fullView.setResources(new Bag());
        fullView.show();
        System.out.println("---- 詳細書本說明 ----");
        fullView.setResources(new Book());
        fullView.show();
	}

}
