package LiveStudy._15Week;

import java.util.function.Function;

public class FunctionSample2 {
	public static void main(String[] args) {
		Function<Integer, Integer> add = (value) -> value + 2;
		Function<Integer, Integer> sub = (value) -> value - 2;

		Function<Integer, Integer> addAndSub = add.compose(sub);
		Integer result = addAndSub.apply(10);
		System.out.println("result = " + result);
	}
}
