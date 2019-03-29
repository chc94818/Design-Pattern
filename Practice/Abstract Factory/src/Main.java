
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 抽象工廠模式
		// 適用於多個產品系列時
		// 方便未來抽換產品類型
		
		AbstractFactory factorySUV = new SUVFactory();
        System.out.println("----- SUV Factory -----");

        Audi suvAudi = factorySUV.createAudi();
        System.out.println(suvAudi.getBrand() + "的" + suvAudi.getType());

        BMW suvBMW = factorySUV.createBMW();
        System.out.println(suvBMW.getBrand() + "的" + suvBMW.getType());



        AbstractFactory factoryJeep = new JeepFactory();
        System.out.println("----- Jeep Factory -----");

        Audi jeepAudi = factoryJeep.createAudi();
        System.out.println(jeepAudi.getBrand() + "的" + jeepAudi.getType());

        BMW jeepBMW = factoryJeep.createBMW();
        System.out.println(jeepBMW.getBrand() + "的" + jeepBMW.getType());
	}

}
