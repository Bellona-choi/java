package choi;

import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum = 0, number = 0, number1 = 0, number2 = 0;
		number = sc.nextInt();
		number1 = sc.nextInt();
		number2 = number / number1;
		for (int i = 1; i <= number2; i++) {
			sum = sum + i * number1;

		}
		System.out.print("SUM : " + sum + "(" );
		for (int i = 1; i < number2; i++) {
			System.out.print(i*number1 + ",");
		}
		System.out.println(number1*number2 + ")");
	}

}

