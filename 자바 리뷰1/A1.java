package reviews;

import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�Ա� �ݾ��� �Է��ϼ���.");
		double pmt = sc.nextDouble();
		System.out.println("�Ա� �� ��� �Ŀ� ã���ðڽ��ϴ�.");
		double nper = sc.nextDouble();
		double rate = 0.05;
		double sum = 0;

		for (double i = nper; nper > 0; nper--) {
			sum += Math.pow((1 + rate), nper) * pmt;

		}
		System.out.println("�� ��ȯ ���� : " + sum + "��");
	}

}
