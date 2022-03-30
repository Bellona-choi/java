package choi;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class P4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("\nMenu");
			System.out.println("1. Encryption");
			System.out.println("2. Decryption");
			int num = sc.nextInt();
			System.out.println("input word");
			String i = sc.next();
			System.out.println("-> " + i);
			char[] a = i.toCharArray();
			
			
			if (num == 1) {
				for(int j=0; j<i.length();j++) {
					a[j] += 3;
				}
			} else if (num == 2) {
				for(int j=0; j<i.length();j++) {
					a[j] -= 3;
				}
			}else {
				System.out.print("OUT");
			}
			System.out.print("Result : ");
			for(int j=0;j<i.length();j++) {
				System.out.print(a[j]);
			}
		
		}
	}

}