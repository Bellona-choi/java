package choi;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> num = new ArrayList<Integer>();
		System.out.println("���ڸ� �Է��ϼ���.");
		int number = sc.nextInt();
		if (number < 1) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		} else {
			num.add(0);
			if (number >= 2) {
				num.add(1);
				for (int i = 0; i < number - 2; i++) {
					num.add(num.get(i) + num.get(i + 1));
				}
			}
			System.out.println(num);
		}
	}
}
