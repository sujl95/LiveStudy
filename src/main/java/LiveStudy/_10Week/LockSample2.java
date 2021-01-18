package LiveStudy._10Week;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockSample2 {
	public static void main(String[] args) {
		final SharedData sharedData = new SharedData();
		final Lock lock = new ReentrantLock();

		for (int i = 0; i < 10; i++) {
			new Thread(new LockRunnableSample2(sharedData, lock)).start();
		}
	}
}
class LockRunnableSample2 implements Runnable {
	private final SharedData sharedData;
	private final Lock lock;

	public LockRunnableSample2(SharedData mySharedData, Lock lock) {
		this.sharedData = mySharedData;
		this.lock = lock;
	}

	@Override
	public void run() {
		lock.lock();
		try {
			for (int i = 0; i < 100; i++) {
				sharedData.increase();
			}
			sharedData.print();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
}