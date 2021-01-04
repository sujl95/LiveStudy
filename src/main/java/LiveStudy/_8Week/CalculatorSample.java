package LiveStudy._8Week;

public class CalculatorSample {
	public static void main(String[] args) {
		Calculator cal = new CalculatorImpl();
		int value = cal.exec(1,2);
		System.out.println(value);

		int value2 = Calculator.exec2(1, 2);
		System.out.println(value2);
	}
}
