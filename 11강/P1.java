import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Num1 �� ���ϴ� ���ڸ� �Է��ϼ���.");
		int Num1 = sc.nextInt();
		System.out.println("num2 �� ���ϴ� ���ڸ� �Է��ϼ���.");
		int num2 = sc.nextInt();
		int Bigger = Num1;
		if (Num1 < num2) {
			Bigger = num2;
		}
		System.out.println(Bigger);
	}
}
