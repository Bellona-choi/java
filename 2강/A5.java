package choi;

import java.util.Scanner;

public class A5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i, j, k;
		k = scanner.nextInt();
		for (i = k; i > 0; i--) {
			for (j = k - i; j > 0; j--) {
				System.out.print(" ");
			}

			for (int y = 2 * i - 1; y > 0; y--) {
				System.out.print("*");

			}
			System.out.println();
		}
	}

}