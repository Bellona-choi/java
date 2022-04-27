package review3;

import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("input double digits");
		System.out.println("input First number");
		int num1 = sc.nextInt();
		System.out.println("input Second number");
		int num2 = sc.nextInt();
		int Result = num1 * num2;

		int First = (100 - num1) + (100 - num2);
		int Second = (100 - num1) * (100 - num2);

		System.out.println("First two digits : " + (100 - First));
		System.out.println("Last two digits : " + Second);
		System.out.println(Result);
	}

}
