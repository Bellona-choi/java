package choi;

import java.util.Scanner;

public class A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int i, j = 0, p = 0, n = 0, o = 0, e = 0;
		System.out.println("0입력시 종료");
		while (true) {
			i = scanner.nextInt();
			if (i > 0) {
				p++;
			} else if (i < 0) {
				n++;
			}
			if (i % 2 == 0) {
				e++;
			} else if (i % 2 != 0) {
				o++;
			}
			if (i == 0) {
				break;
			}
			System.out.println("P" + " - " + p + ", N" + " - " + n + ", O" + " - " + o + ", E" + " - " + e);
		}
	}
}