package LiveStudy._15Week;

import java.util.function.Predicate;

public class PredicateSample2 {
	public static void main(String[] args) {
		Predicate<Integer> isBiggerThan = num -> num > 20;
		Predicate<Integer> isSmallerThan = num -> num < 10;
		System.out.println(isBiggerThan.and(isSmallerThan).test(15));
		System.out.println(isBiggerThan.or(isSmallerThan).test(5));
	}
}
