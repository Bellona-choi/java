import java.text.SimpleDateFormat;
import java.util.Date;

import com.sun.tools.javac.Main;

public class P2 extends Thread {

	public static void main(String[] args) throws InterruptedException {
		P2 thread = new P2();
		thread.start();
		System.out.println("Check 1 : " + getCurrentTime() + "-" + thread.isAlive());
		
		System.out.println("Check 2 : " + getCurrentTime() + "-" + thread.isAlive());
	}

	public static String getCurrentTime() {
		SimpleDateFormat format = new SimpleDateFormat();
		Date time = new Date();
		String dateAndTime = format.format(time);
		return dateAndTime;
	}

	public void run() {
	ArrayList<String> 	
	}
}
