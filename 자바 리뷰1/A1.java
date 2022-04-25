package reviews;

import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입금 금액을 입력하세요.");
		double pmt = sc.nextDouble();
		System.out.println("입금 후 몇년 후에 찾으시겠습니다.");
		double nper = sc.nextDouble();
		double rate = 0.05;
		double sum = 0;

		for (double i = nper; nper > 0; nper--) {
			sum += Math.pow((1 + rate), nper) * pmt;

		}
		System.out.println("총 상환 액은 : " + sum + "원");
	}

}
