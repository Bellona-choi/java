package choi;

import java.util.Scanner;

public class A4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i, j, k;
		k = scanner.nextInt();
		for (i = 0; i < k; i++) {
			for(j=1;j<k-i;j++) {
				System.out.print(" ");
			}
		
			for (int y = 0; y < 2*i+1; y++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
	}

}