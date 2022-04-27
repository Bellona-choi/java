package review3;

import java.util.Scanner;

public class A2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("input double digits");
		System.out.println("input First number");
		String num1 = sc.nextLine();
		System.out.println("input Second number");
		String num2 = sc.nextLine();

		int Result = Integer.parseInt(num1) * Integer.parseInt(num2);

		int First = (100 - Integer.parseInt(num1)) + (100 - Integer.parseInt(num2));
		int Second = (100 - Integer.parseInt(num1)) * (100 - Integer.parseInt(num2));

		System.out.println("First two digits : " + (100 - First));
		System.out.println("Last two digits : " + Second);
		System.out.println(Result);

	}

}
