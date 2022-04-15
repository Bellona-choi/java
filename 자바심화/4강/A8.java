package java4;

public class A8 {

	public static void main(String[] args) {
		for (int k43_i = 1; k43_i < 13; k43_i++) {// k43_i로 월 구하기
			System.out.printf("%d월", k43_i);// k43_i 출력
			for (int k43_j = 1; k43_j < 32; k43_j++) {// k43_j란 변수로 월별 일 구하기
				System.out.printf("%d", k43_j);// k43_j 출력(아래 조건에 없는1,3,5,8,12) 는 31까지 돌아간다
				if (k43_i == 4 || k43_i == 6 || k43_i == 9 || k43_i == 11) {// 만약 k43_i(월)이 4,6,7,9,11 이라면
					if (k43_j == 30)// k43_j(일)은 30 까지
						break;// 일일 별 for문 종료
				}
				if (k43_i == 2) {// k43_i(월)이 2이면
					if (k43_j == 28)// k43_j(일)은 28까지
						break;// 일일 별 for문 종료
				}
			}
			System.out.println();// 줄바꿈
		}

	}

}
