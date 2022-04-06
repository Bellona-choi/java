package choi;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class A2 {

	public static void main(String[] args) {
		Practice();

	}

	public static void Practice() {

		ArrayList<String> Fword = new ArrayList<String>();
		ArrayList<String> Lword = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 단어를 입력하세요.");
		String word_F = sc.nextLine();
		System.out.println("두번째 단어를 입력하세요.");
		String word_L = sc.nextLine();
		String[] Fwordarr = word_F.split("");
		String[] Lwordarr = word_L.split("");
		int count = 0;

		System.out.println("1 : " + Fwordarr.length);
		System.out.println("1 : " + Lwordarr.length);

		for (String num_list : Fwordarr) {
			if (!Fword.contains(num_list)) {
				Fword.add(num_list);
			}
		}

		for (String num_list1 : Lwordarr) {
			if (!Lword.contains(num_list1)) {
				Lword.add(num_list1);
			}
		}

		for (int i = 0; i < Fword.size(); i++) {
			for (int j = 0; j < Lword.size(); j++) {
				if (Fword.get(i).equals(Lword.get(j))) {
					count++;
				}
			}
		}

		System.out.println("3 : " + count);
	}
}