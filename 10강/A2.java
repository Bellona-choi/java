import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class A2 extends Thread {

	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i < 3; i++) {
			A2 thread = new A2();
			thread.start();
		}
	}

	public void run() {
		ArrayList<String> Racer = new ArrayList<String>();
		ArrayList<String> Racer1 = new ArrayList<String>();
		ArrayList<ArrayList<String>> All_Racer = new ArrayList<ArrayList<String>>();
		double re, re1;
		double Fin = 0;
		double Fin1 = 0;
		while (Fin < 50) {
			re = Math.random() * 10;
			Fin += re;
			try {
				if (Fin >= 50) {
					Thread.sleep(1000);
					Racer.add("Finished");

				} else {
					Thread.sleep(1000);
					Racer.add(String.valueOf(Math.round(re * 10) / 10.0) + "m");
				}

			} catch (InterruptedException e) {

			}
			while (Fin1 < 50) {
				re1 = Math.random() * 10;
				Fin1 += re1;
				try {
					if (Fin1 >= 50) {

						Racer1.add("Finished");

					} else {

						Racer1.add(String.valueOf(Math.round(re * 10) / 10.0) + "m");
						Thread.sleep(1000);
					}

				} catch (InterruptedException e) {

				}

				System.out.print(All_Racer);

			}
		}
	}
}
