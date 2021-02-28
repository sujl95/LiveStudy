package LiveStudy._15Week;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplierSample {
	public static void main(String[] args) {
		Supplier<String> supplier = () -> "Supplier Sample";
		String getSupplier = supplier.get();
		System.out.println("getSupplier = " + getSupplier);
	}
}
