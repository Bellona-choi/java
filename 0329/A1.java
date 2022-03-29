package choi;

import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int Mean = 0, Max = 0, Min = 0, Count = 0;
		
		while (true) {
			int number = scanner.nextInt();
			Count++;
			Mean += number;
			if(Count == 1) {
				
				Max = number;
				Min = number;
			}else {
				if(number > Max) {
					Max = number;
					
				}else if(number < Min) {
					Min = number;
				}
			}
			System.out.println("Result : " + Count + " -" + " Mean " + Mean/Count + 
					", " + "Max " + Max + ", " + "Min " + Min);
		}
	}
}