package choi;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class P6달력 {
//P6
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int Y, M;
		Scanner scanner = new Scanner(System.in);
		Y = scanner.nextInt();
		M = scanner.nextInt();
		cal.set(Calendar.YEAR, Y);
		cal.set(Calendar.MONTH, M);
		System.out.println("---------[" + Y + "년 " + M + "월]---------");
		System.out.println(" 일   월  화   수  목   금   토");
		cal.set(Y, M - 1, 1);
		int end = cal.getActualMaximum(Calendar.DATE);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		for (int i = 1; i <= end; i++) {
			if (i == 1) {
				for (int j = 1; j < dayOfWeek; j++) {
					System.out.print("    ");
				}
			}

			if (i < 10) {
				System.out.print(" ");
			}
			System.out.print(" " + i + " ");
			if (dayOfWeek % 7 == 0) {
				System.out.println();
			}
			dayOfWeek++;
		}

	}
}
