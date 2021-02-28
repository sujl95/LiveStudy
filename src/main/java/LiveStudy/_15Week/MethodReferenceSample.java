package LiveStudy._15Week;

@FunctionalInterface
interface ConverterInterface {
	String convert(Integer number);
}

public class MethodReferenceSample {
	public static void main(String[] args) {

		convert(100, (number) -> String.valueOf(number));

		convert(100, String::valueOf);
		new String();
	}

	public static String convert(Integer number, ConverterInterface converterInterface) {
		return converterInterface.convert(number);
	}

}
