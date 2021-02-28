package LiveStudy._15Week;

import java.util.function.Predicate;

public class PredicateSample {

	public static void main(String[] args) {
		Predicate<Integer> isSmallerThan = num -> num < 10;
		System.out.println("5는 10보다 작은지? -> "+ isSmallerThan.test(5));
	}
}
