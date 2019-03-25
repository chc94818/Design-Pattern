
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calculator = new Calculator();
		
		int a = 50, b=10;
		calculator.setStrategy(Calculator.DoType.ADD);
		System.out.println(calculator.execute(a, b));
		calculator.setStrategy(Calculator.DoType.MINUS);
		System.out.println(calculator.execute(a, b));
		calculator.setStrategy(Calculator.DoType.MULTYPLY);
		System.out.println(calculator.execute(a, b));
		calculator.setStrategy(Calculator.DoType.DIVIDE);
		System.out.println(calculator.execute(a, b));
		
		PriceCalculator busCalculator = new PriceCalculator(new BusStrategy());
		PriceCalculator MRTCalculator = new PriceCalculator(new MRTStrategy());
		System.out.printf("Bus distance : %d km, price : %d\n", a,busCalculator.calculate(a));
		System.out.printf("Bus distance : %d km, price : %d\n", b,busCalculator.calculate(b));
		System.out.printf("MRT distance : %d km, price : %d\n", a,MRTCalculator.calculate(a));
		System.out.printf("MRT distance : %d km, price : %d\n", b,MRTCalculator.calculate(b));
		
		
	}

}
