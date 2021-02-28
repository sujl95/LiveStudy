package LiveStudy._15Week;

public class FunctionalInterfaceSample {
	public static void main(String[] args) {
		Functional sub = (int a, int b) -> a - b;
		Functional add = (int a, int b) -> {return a + b; };
		Functional add1 = (int a, int b) -> a + b;
		Functional add2 = Integer::sum;

		int result = add.calc(1, 1) + add1.calc(2, 2) + add2.calc(3, 3);
		System.out.println("result = " + result);

		Functional func = (a, b) -> { return  a + b;};
		System.out.println("func.calc(1,2) = " + func.calc(1,2));
	}
}
