package choi;

import java.util.Scanner;

public class A6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문장을 입력하세요.");
		String arr = sc.nextLine();
		String[] cutarr = arr.split("");
		System.out.println("찾고싶은 단어를 입력하세요.");
		String n = sc.nextLine();
		for (int i = 0; i < cutarr.length; i++) {
			if (cutarr[i].equals(n)) {
				System.out.println(i + 1);
				break;
			}
		}
	}

}