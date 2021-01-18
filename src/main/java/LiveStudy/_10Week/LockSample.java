package LiveStudy._10Week;

public class LockSample {
	public static void main(String[] args) {
		final SharedData sharedData = new SharedData();

		for (int i = 0; i < 10; i++) {
			new Thread(new LockRunnableSample(sharedData)).start();
		}
	}
}

class LockRunnableSample implements Runnable {
	private final SharedData sharedData;

	public LockRunnableSample(SharedData sharedData) {
		this.sharedData = sharedData;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			sharedData.increase();
		}
		sharedData.print();
	}
}



