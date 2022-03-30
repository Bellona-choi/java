package choi;

import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;

public class P5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num;
		String a = "QWERTYUIOPASDFGHJKLZXCVBNM";
		String[] A = a.split("");
		System.out.println("The string length should be over 8");
		System.out.println("The string should contains the character 'a'");
		System.out.println("The string should contains the character '!'");
		System.out.println("The string should contains the character '@'");
		System.out.println("The string should contains the character 'b'");

		System.out.println("Plase input you ID");
		num = sc.nextLine();
		if (num.length() < 8) {
			System.out.println("FAIL");

		} else if (num.contains("a") == false) {
			System.out.println("FAIL");
		} else if (num.contains("!") == false) {
			System.out.println("FAIL");
		} else if (num.contains("@") == false) {
			System.out.println("FAIL");
		} else if (num.contains("b") == false) {
			System.out.println("FAIL");
		} else {
			System.out.println("PASS");
		}
	}
}
