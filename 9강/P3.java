package choi;

import java.util.Scanner;
import java.util.Stack;

public class P3 {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		Scanner sc = new Scanner(System.in);
		String Fnum = sc.nextLine();
		String[] wordarr = Fnum.split(" ");
		String Snum = sc.nextLine();
		int count = 0;
		if (Fnum.contains(Snum)) {
			for (int i = 0; i < wordarr.length; i++) {
				stack.add(wordarr[i]);
			}
			for (int i = 0; i < wordarr.length; i++) {
				if (stack.pop().equals(Snum)) {
					System.out.println(i + 1);
					count++;
					break;
				}
			}
		}
		if (count == 0) {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
}