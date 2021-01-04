package LiveStudy._8Week;

public interface ExampleInterface {
	public abstract void method1();

	public default void method2() {
		method4();  //private method 안의 default method
		method5();  //static method 안의 다른  non-static method
		System.out.println("default method");
	}

	public static void method3() {
		method5(); //static method 안의 다른 static method
		System.out.println("static method");
	}

	private void method4(){
		System.out.println("private method");
	}

	private static void method5(){
		System.out.println("private static method");
	}
}
