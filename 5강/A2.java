package choi;

import java.util.Scanner;

public class A2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("n���� ��������.");
		int n = sc.nextInt();
		System.out.println("r���� ��������.");
		int r = sc.nextInt();
		int c = N(r);
		int d = N(n - r);
		System.out.println(N(n) / (d * c));
	}

	public static int N(int num) {
		if (num == 1) {
			return 1;
		} else {
			return num * N(--num);
		}
	}
}
