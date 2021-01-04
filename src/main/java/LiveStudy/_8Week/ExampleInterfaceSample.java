package LiveStudy._8Week;

public class ExampleInterfaceSample implements ExampleInterface{
	@Override
	public void method1() {
		System.out.println("abstract method");
	}

	public static void main(String[] args) {
		ExampleInterface exampleInterface = new ExampleInterfaceSample();
		exampleInterface.method1();
		exampleInterface.method2();
		ExampleInterface.method3();
	}
}
