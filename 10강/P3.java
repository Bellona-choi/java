
/*/public class P3 {

	public static void main(String[] args) {
		Thread thread1 = new MutiThreadTest("[Thread" + 1 + "]");
		thread1.start();
		Thread thread2 = new MutiThreadTest("[Thread" + 2 + "]");
		thread2.start();

	}

}

class MutiThreadTest extends Thread {
	public MutiThreadTest(String threadName) {
		this.setName(threadName);
	}

	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(this.getName() + " Thread_start");
	}
}/*/
