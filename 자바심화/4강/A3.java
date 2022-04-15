package java4;

public class A3 {

	public static void main(String[] args) {
		int k43_sum = 0;// k43_sum 함수 만들기
		for (int k43_i = 0; k43_i < 10; k43_i++) {// k43_i이 0부터 시작해서 10보다 작을때까지 k43_i을 1씩 더하고 반복해서 돌리기
			k43_sum = k43_sum + k43_i;// 0~9까지 의 값을 더해서 k43_sum에 넣어주기
		}
		System.out.printf("sum %d\n", k43_sum);// k43_sum을 출력하기

		for (int k43_i = 1; k43_i < 10; k43_i++) {// k43_i이 1부터 시작해서 10보다 작을때까지 k43_i을 1씩 더하고 반복해서 돌리기
			System.out.printf("***********************\n");
			System.out.printf("      구구단 %d 단\n", k43_i);// k43_i 출력해서 몇단인지 확인
			System.out.printf("***********************\n");
			for (int k43_j = 1; k43_j < 10; k43_j++) {// k43_j이 1부터 시작해서 10보다 작을때까지 k43_i을 1씩 더하고 반복해서 돌리기
				System.out.printf("%d * %d = %d\n", k43_i, k43_j, k43_i * k43_j);// 구구단 출력
			}
		}

	}

}
