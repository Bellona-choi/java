package reviews;

import java.util.Arrays;
import java.util.Scanner;

public class A2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ù ��° ������ �Է��ϼ���.");
		String intput = sc.nextLine();
		System.out.println("�� ��° ������ �Է��ϼ���.");
		String intput1 = sc.nextLine();

		char[] array = intput.toCharArray();
		Arrays.sort(array);
		String sorted = String.valueOf(array);

		char[] array1 = intput1.toCharArray();
		Arrays.sort(array1);
		String sorted1 = String.valueOf(array1);

		if (sorted.equals(sorted1)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}

}
