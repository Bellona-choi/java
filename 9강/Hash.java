package choi;

import java.awt.im.spi.InputMethod;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Hash {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<String> num = new HashSet<String>();
		for (int i = 0; i < 5; i++) {
			String n = sc.nextLine();
			num.add(n);
			TreeSet myTreeSet = new TreeSet();
			myTreeSet.addAll(num);
			System.out.println(myTreeSet);
		}
	}
}
