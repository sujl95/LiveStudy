package LiveStudy._15Week;

public class FunctionRunnableSample {
	public static void main(String[] args) {
		Runnable runnable = () -> System.out.println("runnable run");
		runnable.run();
	}
}
