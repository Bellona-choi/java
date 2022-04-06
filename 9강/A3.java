package choi;

import java.util.ArrayList;
import java.util.Scanner;

public class A3 {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		int Mean = 0, Max = Integer.MAX_VALUE, Min = Integer.MIN_VALUE, Count = 0;

		while (true) {
			int number = sc.nextInt();
			numbers.add(number);
			Count++;
			Mean += number;
			if (Count == 1) {
				Max = number;
				Min = number;
			} else {
				if (number > Max) {
					Max = number;

				} else if (number < Min) {
					Min = number;
				}
			}
			System.out.println(
					"Result : " + Count + " -" + " Mean " + Mean / Count + ", " + "Max " + Max + ", " + "Min " + Min);
		}
	}
}
