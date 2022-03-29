package choi;

import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String line = "Iamaboy";
		char[] chars = line.toCharArray();

		for (int i = 0; i < chars.length; i++) {

			if (chars[i] > 96) {
				chars[i] -= 32;
			} else {
				chars[i] += 32;
			}
			System.out.print(chars[i]);
		}

	}

}
