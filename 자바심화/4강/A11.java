package java4;

public class A11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] k43_units = { "영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구" };//// k43_units란 정수 배열 선언
		for (int k43_i = 0; k43_i < 101; k43_i++) {// k43_i는 0부터 100까지 k43_i를 1씩 더해주기

			if (k43_i >= 0 && k43_i < 10) {// k43_i가 0보다 크거나 같고 10보타 작으면
				System.out.printf("일의자리 : %s\n", k43_units[k43_i]);// 일의자리 : k43_i 출력
			} else if (k43_i >= 10 && k43_i < 100) {// k43_i가 10보다 크거나 같고 100보타 작으면
				int k43_i10, k43_i0;// k43_i10, k43_i0란 변수 선언
				k43_i10 = k43_i / 10;// 십의자리 구하기
				k43_i0 = k43_i % 10;// 일의자리 구하기
				if (k43_i0 == 0) {// k43_i0 (일의자리)가 0이면
					System.out.printf("십의자리 : %s십\n", k43_units[k43_i10]);// 십의자리 k43_units[k43_i10(십의자리)] 출력
				} else {// k43_i0 (일의자리)가 0이 아니라면
					System.out.printf("십의자리 : %s십%s\n", k43_units[k43_i10], k43_units[k43_i0]);// 십의자리
																								// k43_units[k43_i10(십의자리)],k43_units[k43_i0(일의자리)]
																								// 출력
				}
			} else {// k43_i가 100이라면
				System.out.printf("==> %d\n", k43_i);// ==> 100 출력
			}
		}
	}

}
