package choi;

import java.util.Scanner;

public class A4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int number = sc.nextInt();
		
		for (int i = 0; i <= number; i++) {
			System.out.println("피보나치 수열 : " + fibo(i));
		}

	}

	public static int fibo(int number) {
		if (number == 0) {
			return 0;
		} else if (number == 1) {
			return 1;
		} else {
			return fibo(number - 1) + fibo(number - 2);
		}
	}

}