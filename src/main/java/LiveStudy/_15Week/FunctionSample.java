package LiveStudy._15Week;

import java.util.function.Function;

public class FunctionSample {
	public static void main(String[] args) {
		Function<Integer, Integer> add = (value) -> value + value;

		Integer result = add.apply(5);
		System.out.println("result = " + result);
	}
}
