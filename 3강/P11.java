package choi;

import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;

public class P11{
//P11
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		int inputmoney = 0;
		Double exchange = (double) 0;
		inputmoney = sc.nextInt();
		System.out.println("#Current Converter");
		System.out.println("1. South Korea won -> United States Dollar");
		System.out.println("2. United States Dollar -> South Korea won");
		menu = sc.nextInt();
		if (menu == 1) {
			exchange = (Double) (inputmoney * 0.00082);
		} else if (menu == 2) {
			exchange = (Double) (inputmoney * 1220.78);
		} else {
			System.out.println("�߸� �����ϼ̽��ϴ�.");
		}
		System.out.println("ȯ�� �ݾ��� : " + exchange);
	}
}