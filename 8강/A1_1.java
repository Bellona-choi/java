package choi;

import java.awt.im.spi.InputMethod;
import java.util.Scanner;

public class A1_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("단어를 입력하세요.");
		String arr = sc.nextLine();
		char[] cutarr = arr.toCharArray();
		if (cutarr.length % 2 == 0) {
			System.out.print(cutarr[cutarr.length / 2 - 1]);
			System.out.println(cutarr[cutarr.length / 2]);
		} else if (cutarr.length % 2 == 1) {
			System.out.println(cutarr[cutarr.length] / 2);
		}
	}
}
