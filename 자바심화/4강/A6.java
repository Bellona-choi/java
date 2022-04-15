package java4;

public class A6 {

	public static void main(String[] args) {
		int k43_iVal;// k43_iVal변수 생성
		for (int k43_i = 0; k43_i < 300; k43_i++) {// k43_i이 0~300까지 반복문 돌리기
			k43_iVal = 5 * k43_i;// k43_iVal의 값을 5 * k43_i로 대입
			if (k43_iVal >= 0 && k43_iVal < 10) {// 만약 k43_iVal가 0보다 크거나 같고 10보다 작으면
				System.out.printf("일 %d\n", k43_iVal);// 일 , k43_iVal 출력
			} else if (k43_iVal >= 10 && k43_iVal < 100) {// 만약 k43_iVal가 10보다 크거나 같고 100보다 작으면
				System.out.printf("십 %d\n", k43_iVal);// 십 , k43_iVal 출력
			} else if (k43_iVal >= 100 && k43_iVal < 1000) {// 만약 k43_iVal가 100보다 크거나 같고 1000보다 작으면
				System.out.printf("백 %d\n", k43_iVal);// 백 , k43_iVal 출력
			} else {// 위에 if문에 포함되지 않으면
				System.out.printf("천 %d\n", k43_iVal);// 천 , k43_iVal 출력
			}
		}

	}

}
