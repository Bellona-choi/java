package review2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class A2 {

	public static void main(String[] args) {
		SimpleDateFormat today = new SimpleDateFormat("yyyyMMdd");
		Scanner sc = new Scanner(System.in);
		Date time = new Date(); // Date 함수를 time으로 쓰겠다고 선언

		String taday1 = today.format(time);
		System.out.println("Current Date :");
		System.out.println(taday1);
		System.out.println("Birthday :");
		String Birthday = sc.nextLine();

		String num = taday1.substring(0, 4);
		String num1 = Birthday.substring(0, 4);
		int day = Integer.parseInt(num);
		int day1 = Integer.parseInt(num1);
		System.out.println((day - day1 + 1) + "years old in Korean age");
		System.out.println((day - day1) + "years old in international age");
	}

}
