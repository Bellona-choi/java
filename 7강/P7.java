package choi;

import java.util.Scanner;

public class A7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ĺ��� �Է��ϼ���.");
		String st = sc.nextLine();
		String[] stArr = st.split("");

		for (int i = 0; i < stArr.length; i++) {
			char n = (char) (219- stArr[i].charAt(0)); 
			System.out.print(n);
		}

	}

}