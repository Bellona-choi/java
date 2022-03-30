package choi;

import java.util.Scanner;

public class A6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int k;
		k = scanner.nextInt();
		for (int i = 1; i < k; i++) {
			if(k%i==0)
				System.out.println(i);
			}

			
		}
	}

