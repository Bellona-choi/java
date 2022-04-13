import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Num1 에 원하는 숫자를 입력하세요.");
		int Num1 = sc.nextInt();
		System.out.println("num2 에 원하는 숫자를 입력하세요.");
		int num2 = sc.nextInt();
		int Bigger = Num1;
		if (Num1 < num2) {
			Bigger = num2;
		}
		System.out.println(Bigger);
	}
}
