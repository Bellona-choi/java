package Pra;

import java.util.Scanner;

public class A5O_1 {
	public static float inputNum = 0, result = 0;
	public static int Unit1 = 0, Unit2 = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(result);
	}

	public static void Menu() {
		System.out.println("# Unit");
		System.out.println("1. cm\n2. m\n3. mm\n4. km\n5. mile");
		System.out.println("Input two unit");
	}

	public static void Unit() {
		Scanner sc = new Scanner(System.in);
		Unit1 = sc.nextInt();
		Unit2 = sc.nextInt();
	}

	public static void Number() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number");
		inputNum = sc.nextInt();
	}

	public static void calUnit() {
		if (Unit1 == 1) {
			cmUnit(Unit2);
		} else if (Unit1 == 2) {
			mUnit(Unit2);
		} else if (Unit1 == 3) {
			mmUnit(Unit2);
		} else if (Unit1 == 4) {
			kmUnit(Unit2);
		} else if (Unit1 == 5) {
			mileUnit(Unit2);
		} else {
			System.out.println("잘못 입력 하셨습니다.");
		}
	}

	public static void cmUnit(int afterUnit) {
		if (afterUnit == 1) {
			result = inputNum;
		} else if (afterUnit == 2) {
			result = inputNum / 100;
		} else if (afterUnit == 3) {
			result = inputNum * 10;
		} else if (afterUnit == 4) {
			result = inputNum / 100000;
		} else if (afterUnit == 5) {
			result = (float) (inputNum * 6.2137e-6);
		} else {
			System.out.println("잘못 입력 하셨습니다.");
		}
	}

	public static void mUnit(int afterUnit) {
		if (afterUnit == 1) {
			result = inputNum * 100;
		} else if (afterUnit == 2) {
			result = inputNum;
		} else if (afterUnit == 3) {
			result = inputNum * 1000;
		} else if (afterUnit == 4) {
			result = inputNum / 1000;
		} else if (afterUnit == 5) {
			result = (float) (inputNum * 0.000621);
		} else {
			System.out.println("잘못 입력 하셨습니다.");
		}
	}

	public static void mmUnit(int afterUnit) {
		if (afterUnit == 1) {
			result = inputNum / 10;
		} else if (afterUnit == 2) {
			result = inputNum / 1000;
		} else if (afterUnit == 3) {
			result = inputNum;
		} else if (afterUnit == 4) {
			result = (float) (inputNum * 1e-6);
		} else if (afterUnit == 5) {
			result = (float) (inputNum * 6.2137e-7);
		} else {
			System.out.println("잘못 입력 하셨습니다.");
		}
	}

	public static void kmUnit(int afterUnit) {
		if (afterUnit == 1) {
			result = inputNum * 100000;
		} else if (afterUnit == 2) {
			result = inputNum * 1000;
		} else if (afterUnit == 3) {
			result = inputNum * 1000000;
		} else if (afterUnit == 4) {
			result = inputNum;
		} else if (afterUnit == 5) {
			result = (float) (inputNum * 0.621371);
		} else {
			System.out.println("잘못 입력 하셨습니다.");
		}
	}

	public static void mileUnit(int afterUnit) {
		if (afterUnit == 1) {
			result = (float) (inputNum * 1690934.4);
		} else if (afterUnit == 2) {
			result = (float) (inputNum * 1609.344);
		} else if (afterUnit == 3) {
			result = inputNum * 1609344;
		} else if (afterUnit == 4) {
			result = (float) (inputNum * 1.609344);
		} else if (afterUnit == 5) {
			result = inputNum;
		} else {
			System.out.println("잘못 입력 하셨습니다.");
		}
	}

	public static void Last() {
		System.out.println(result);
	}
}
