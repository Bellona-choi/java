package Pra;

import java.util.Scanner;

public class A2_1 {
	public static int input = 0;

	public static void main(String[] args) {
		inputNumber();
		reverseNumber();
	}

	public static void inputNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		input = sc.nextInt();
	}

	public static void reverseNumber() {
		int result = 0;
		while (input > 0) {
			int remain = input % 10;
			result = result * 10 + remain;
			input /= 10;
		}
		System.out.println(result);
	}
}
