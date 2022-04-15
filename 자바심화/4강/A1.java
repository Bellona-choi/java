package java4;

import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
		Scanner k43_sc = new Scanner(System.in);// scnner클래스 k43_sc 객체생성
		System.out.println("점수를 입력하세요.");// 점수를 입력하세요 출력
		int k43_score = k43_sc.nextInt();// 원하는 점수를 입력 받는다

		if (k43_score >= 60) {// 입력한 점수가 60점 이상이면
			System.out.println("합격입니다.");// 합격입니다 출력
		} else {// 입력한 점수가 60점 미만이면
			System.out.println("불합격입니다.");// 불합격 입니다.
		}

		if (k43_score >= 90) {// 입력한 점수가 90이상이면
			System.out.println("등급은 :A등급 입니다");// A등급 입니다 출력
		} else if (k43_score >= 80) {// 입력한 점수가 80이상 90미만이면
			System.out.println("등급은 :B등급 입니다");// B등급 입니다 출력
		} else if (k43_score >= 70) {// 입력한 점수가 70이상 80미만이면
			System.out.println("등급은 :C등급 입니다");// C등급 입니다 출력
		} else {// 입력한 점수가 70미만이면
			System.out.println("등급은 :D등급 입니다");// D등급 입니다 출력
		}
		System.out.println("숫자를 입력하세요.");// 숫자를 입력하세요 출력
		int k43_num = k43_sc.nextInt();// 원하는 숫자를 입력 받는다
		if (k43_num > 0) {// 입력한 숫자가 0보다 크면
			System.out.println("양수입니다.");// 양수입니다. 출력
		} else if (k43_num < 0) {// 입력한 숫자가 0보다 작으면
			System.out.println("음수입니다");// 음수입니다. 출력
		} else {// 입력한 숫자가 0이면
			System.out.println("0입니다");// 0입니다 출력
		}
	}

}
