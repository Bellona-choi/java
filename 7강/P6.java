package choi;

import java.util.Scanner;

public class A6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���.");
		String arr = sc.nextLine();
		String[] cutarr = arr.split("");
		System.out.println("ã����� �ܾ �Է��ϼ���.");
		String n = sc.nextLine();
		for (int i = 0; i < cutarr.length; i++) {
			if (cutarr[i].equals(n)) {
				System.out.println(i + 1);
				break;
			}
		}
	}

}