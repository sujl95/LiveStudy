package LiveStudy._10Week;

public class EndlessThread extends Thread{

	public static void main(String[] args) {
		EndlessThread thread = new EndlessThread();
		thread.run();
	}


	public void run() {
		while (true) {
			try {
				System.out.println(System.currentTimeMillis());
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
