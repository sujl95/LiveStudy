package LiveStudy._14Week;

public class BoundTypeSample <T extends Number>{
	public void set(T value) {}

	public static void main(String[] args) {
		BoundTypeSample<Integer> boundTypeSample = new BoundTypeSample<>();
		boundTypeSample.set(1);
	}
}


