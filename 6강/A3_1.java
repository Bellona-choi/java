package Pra;

import java.util.Scanner;

public class A3_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("단어를 입력하세요");
		String num = sc.nextLine();
		String renum = "";
		for (int i = (num.length() - 1); i >= 0; i--) {
			renum = renum + num.charAt(i);
		}
		System.out.println(renum);

	}

}
