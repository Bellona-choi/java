package java4;

public class A15 {

	public static void main(String[] args) {
		int k43_m = 20, k43_n = 1;// k43_m, k43_n 변수선언

		while (true) {// while문 시작
			for (int k43_i = 0; k43_i < k43_m; k43_i++) {// k43_i가 k43_m과 같아질떄까지 k43_i+1
				System.out.printf(" ");// 빈칸을 출력한다
			}
			for (int k43_i = 0; k43_i < k43_n; k43_i++) {// k43_i가 k43_n 과 같아질떄까지 k43_i+1
				System.out.printf("*");// *을 출력한다
			}
			System.out.printf("\n");// 줄바꿈
			k43_m = k43_m - 1;// 빈칸을 하나씩 제거한다
			k43_n = k43_n + 2;// *을 2개씩 추가한다
			if (k43_m < 0) {// 만약 빈칸이 0보다 작을떄
				break;// while반복문을 나간다.
			}
		}

	}

}
