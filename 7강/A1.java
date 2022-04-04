package choi;

import java.util.Scanner;

public class A1_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String arr = sc.nextLine();
		String[] cutarr = arr.split("");
		String n = sc.nextLine();
		for (int i = 0; i < cutarr.length; i++) {
			if (cutarr[i].equals(n)) {
				System.out.println(i + 1);
				break;
			}
		}
	}

}