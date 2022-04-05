package choi;

import java.util.Arrays;
import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("\n숫자 6개를 입렵하세요.");
			System.out.println("ex) 2 -1 3 12 12.0 4.1");
			String num = sc.nextLine();
			System.out.println("비교할 숫자 6개를 입렵하세요.");
			String number = sc.nextLine();
			String[] numarr = num.split(" ");
			String[] numberarr = number.split(" ");

			for (int i = 0; i < numarr.length; i++) {
				for (int j = 0; j < numberarr.length; j++) {
					if (Float.parseFloat(numarr[i]) == Float.parseFloat(numberarr[j])) {
						System.out.print(Float.parseFloat(numarr[i]) + " ");
					}
				}
			}
		}
	}
}