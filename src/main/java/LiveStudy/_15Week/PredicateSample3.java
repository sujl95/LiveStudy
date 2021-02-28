package LiveStudy._15Week;

import java.util.function.Predicate;

public class PredicateSample3 {

	public static void main(String[] args) {
		Predicate<String> isEqual = Predicate.isEqual("TheWing");
		System.out.println("isEqual.test(\"TheWing\") = " + isEqual.test("TheWing"));
	}

}
