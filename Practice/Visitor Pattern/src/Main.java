
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 訪問者模式
		// 在不改變某物件類別的情況下，定義其不同的操作方式
		
		Temperture temperture = new Temperture();

        AirQuality airQuality = new AirQuality();

        Visit man = new Man();
        Visit woman = new Woman();

        System.out.println("----- 男生 -----");
        man.visit(temperture);
        man.visit(airQuality);

        System.out.println("----- 女生 -----");
        woman.visit(temperture);
        woman.visit(airQuality);
	}

}
