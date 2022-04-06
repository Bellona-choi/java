package choi;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		Queue<String> number = new LinkedList<String>();
		Scanner sc = new Scanner(System.in);
		String Fnum = sc.nextLine();
		String[] wordarr = Fnum.split(" ");
		String Snum = sc.nextLine();
		int count = 0;
		if (Fnum.contains(Snum)) {
			for (int i = 0; i < wordarr.length; i++) {
				number.add(wordarr[i]);
			}
			for (int i = 0; i < wordarr.length; i++) {
				if (number.poll().equals(Snum)) {
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
