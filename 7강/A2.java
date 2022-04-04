package choi;

import java.util.Arrays;
import java.util.Scanner;

public class A2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numbers = { 123, 32, 356, 53, 2, 67, 31, 78, 41, 9, 29 };
		int number10, number1, numlength;
		System.out.println("input number");
		int num = sc.nextInt();
		for (int i = 0; i < numbers.length; i++) {
			number10 = numbers[i];
			numlength = (int) (Math.log10(numbers[i]) + 1);
			for (int j = 0; j < numlength; j++) {
				number1 = number10 % 10;
				number10 /= 10;
				if (number1 == num) {
					System.out.print(numbers[i] + " ");
				}
			}
		}
	}
}