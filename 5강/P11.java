package choi;

import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;

public class P11 {
//A3

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 단을 원하십니까?");
		int N = sc.nextInt();
		gugudan(N, 1);
	}

	public static void gugudan(int N, int i) {
		if (i > 9) {
			return;
		} else {
			System.out.println(N + "X" + i + "=" + N * i);
			gugudan(N, ++i);
		}
	}
}