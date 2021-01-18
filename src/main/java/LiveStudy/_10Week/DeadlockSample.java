package LiveStudy._10Week;

public class DeadlockSample {
	public static final Object LOCK_1 = new Object();
	public static final Object LOCK_2 = new Object();

	public static void main(String args[]) {
		ThreadSample1 thread1 = new ThreadSample1();
		ThreadSample2 thread2 = new ThreadSample2();
		thread1.start();
		thread2.start();
	}

	private static class ThreadSample1 extends Thread {
		public void run() {
			synchronized (LOCK_1) {
				System.out.println("Thread 1: Holding lock 1...");
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {

				}
				System.out.println("Thread 1: Waiting for lock 2...");
				synchronized (LOCK_2) {
					System.out.println("Thread 1: Holding lock 1 & 2...");
				}
			}
		}
	}
	private static class ThreadSample2 extends Thread {
		public void run() {
			synchronized (LOCK_2) {
				System.out.println("Thread 2: Holding lock 2...");
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {

				}
				System.out.println("Thread 2: Waiting for lock 1...");
				synchronized (LOCK_1) {
					System.out.println("Thread 2: Holding lock 1 & 2...");
				}
			}
		}
	}

}
