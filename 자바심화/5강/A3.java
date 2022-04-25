package java5;

public class A3 {

	public static void main(String[] args) {
		int k43_iWeekday = 5;
		int[] k43_iEnd = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		for (int k43_iMon = 0; k43_iMon < 12; k43_iMon++) {
			System.out.printf("\n\n        %d월\n", k43_iMon + 1);
			System.out.printf("=====================\n");
			System.out.println(" 일 월 화 수 목 금 토 \n");

			for (int k43_j = k43_iWeekday; k43_j > 0; k43_j--) {
				System.out.printf("   "); // 시작날만큼 빈칸설정
			}
			for (int k43_i = 1; k43_i <= k43_iEnd[k43_iMon]; k43_i++) {
				k43_iWeekday++;
				if (k43_iWeekday % 7 == 0) { // k27_iWeekday를 7로 나누어 나머지가 6 일 때 한 줄 띄우기
					System.out.printf("%3d\n", k43_i);
					k43_iWeekday = k43_iWeekday - 7; // 다시 -1~6 (7일)을 계산하기 위해 -7
				} else { // 나머지가 6이 아니라면 날짜 출력
					System.out.printf("%3d", k43_i);
				}

			}
		}

	}

}
