package review2;

import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("0s or 1s");
		System.out.println("size is 4");
		System.out.println("First");
		String First_input = sc.nextLine();
		System.out.println("Second");
		String Second_input = sc.nextLine();
		System.out.println("Third");
		String Third_input = sc.nextLine();

		char[] First_array = First_input.toCharArray();
		char[] Second_array = Second_input.toCharArray();
		char[] Third_array = Third_input.toCharArray();

		if (First_array[0] == '0' && Second_array[0] == '0' && Third_array[0] == '0') {
			System.out.println("Pass");
		} else if (First_array[1] == '0' && Second_array[1] == '0' && Third_array[1] == '0') {
			System.out.println("Pass");
		} else if (First_array[2] == '0' && Second_array[2] == '0' && Third_array[2] == '0') {
			System.out.println("Pass");
		} else if (First_array[3] == '0' && Second_array[3] == '0' && Third_array[3] == '0') {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

	}

}
