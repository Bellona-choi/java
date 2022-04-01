package choi;

import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;

public class P12 {
//P11
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		int input = 0;
		Double exchange = (double) 0;
		input = sc.nextInt();
		System.out.println("#Current Converter");
		System.out.println("1. Celsius -> Fahrenheit");
		System.out.println("2. Fahrenheit -> Celsius");
		menu = sc.nextInt();
		if (menu == 1) {
			exchange = (Double) ((input * 1.8) + 32);
		} else if (menu == 2) {
			exchange = (Double) ((input - 32) / 1.8);
		} else {
			System.out.println("잘못 선택하셨습니다.");
		}
		System.out.println(exchange);
	}
}
