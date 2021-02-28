package LiveStudy._15Week;

import java.util.function.Consumer;

public class ConsumerSample {
	public static void main(String[] args) {
		Consumer<String> print = str -> System.out.println("this is " + str + " Interface");
		Consumer<String> print1 = str -> System.out.println("ok");
		print.andThen(print1).accept("Consumer");
	}
}
