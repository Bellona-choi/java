package choi;

import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0, sum = 0, money = 0;

		while (true) {
			System.out.println("Menu");
			System.out.println("1. Deposit");
			System.out.println("2. Withdrawal");
			System.out.println("Balance : " + sum);
			System.out.print("-> ");
			i = sc.nextInt();
			money = sc.nextInt();
			if (i == 1) {
				sum += money;
			} else if (i == 2) {
				sum -= money;
			} else if (i == 0) {
				break;
			}
		}
	}

}