
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 責任鍊模式
		// 將問題區分出等級
		// 避免單一類別需要處理過多層級的狀況
		// 而造成維護上的困難
		Handler manager = new Manager();
		// 小問題
		Trouble smallTrouble = new Trouble("想加薪500", 500);
		manager.handleRequest(smallTrouble);

		// 大問題
		Trouble bigTrouble = new Trouble("搞壞五十萬的機器",500000);
		manager.handleRequest(bigTrouble);

	}

}
