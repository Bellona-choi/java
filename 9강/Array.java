package choi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> num = new ArrayList<String>();
		for (int i = 0; i < 5; i++) {
			String n = sc.nextLine();
			num.add(n);
			Collections.sort(num);
			System.out.println(num);
		}
	}
}
