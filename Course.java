package por;

import java.util.Scanner;

public class Course {
	private static final int Main = 0;
	Scanner sc = new Scanner(System.in);
	int menu, a, count = 0;
	String Subject[] = {};

	public Course() {

	}

	public void Menu() {
		Course Main = new Course();

		System.out.println("Menu");

		System.out.println("1. Course List");
		System.out.println("2. My Course");
		menu = sc.nextInt();
		this.menu = menu;
	}

	public int Menu_print() {
		if (menu == 1) {
			System.out.println("-> " + menu);
			System.out.println("Course List");
			System.out.println("1. Korean");
			System.out.println("2. Math");
			System.out.println("3. English");
			System.out.println("4. Science");
			System.out.println("0. Back to Main");
		} else if (menu == 2) {
			System.out.println("-> " + menu);
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
		a = sc.nextInt();
		this.a = a;
		for(int j =0;j<=4;j++) {
			if (menu == 1 && a == 1) {
				System.out.println("\"Korean\" is registered.");
				Subject[] += "Korean";
				count++;
				Menu_print();
			} else if (menu == 1 && a == 2) {
				System.out.println("\"Math\" is registered.");
				Subject += "Math";
				count++;
				Menu_print();
			} else if (menu == 1 && a == 3) {
				System.out.println("\"English\" is registered.");
				Subject += "English";
				count++;
				Menu_print();
			} else if (menu == 1 && a == 4) {
				System.out.println("\"Science\" is registered.");
				Subject += "Science";
				count++;
				Menu_print();
			} else if (menu == 1 && a == 0) {
				System.out.println("Back to Main");
				Menu();
			} else {
				System.out.println("잘못 입력하셨습니다.");
				Menu();
			}
			if (menu == 2) {
				System.out.println(count + ". " + Subject);
			}
	
			System.out.println("-> " + a);
			return Main;
		}
	}

}