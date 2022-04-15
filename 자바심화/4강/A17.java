package java4;

public class A17 {

	public static void main(String[] args) {
		for (int k43_i = 1; k43_i < 13; k43_i++) {// k43_i는 1부터 12까지 반복문 돌리기(할때마다 1씩 추가)월계산
			System.out.printf("%d월 =>", k43_i);// k43_i + 월 출력
			for (int k43_j = 1; k43_j < 32; k43_j++) {// k43_j 1부터 32까지 반복문 돌리기(할떄마다 1씩 추가)일계산
				System.out.printf("%d,", k43_j);// k43_j 출력(일)
				if ((k43_i == 4 || k43_i == 6 || k43_i == 9 || k43_i == 11) && (k43_j == 30))
					break;// k43_i(월)이 4,6,9,11 이면 k43_j(일)이 30까지만 하고 for문을 나간다
				if (k43_i == 2 && k43_j == 28)
					break;// k43_i(월)이 2 이면 k43_j(일)이 28까지만 하고 for문을 나간다
			}
			System.out.printf("\n");// 줄바꿈
		}

	}

}
