package choi;

import java.util.Scanner;

public class A9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int s;

		s = scanner.nextInt();
		for (int i = 2; i <= s; i++) {
			boolean is = true;
			for (int j = 2; j * j <= i; j++) {
				if (i % j == 0) {
					is = false;
					break;
				}
			}
			if (is) {
				System.out.println(i + "");
			}
		}

	}

}
