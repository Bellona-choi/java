package choi;

import java.util.Scanner;

public class A3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i, j, k;
		k = scanner.nextInt();
		for (i = 1; i <= k; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
