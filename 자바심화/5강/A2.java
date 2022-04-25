package java5;

public class A2 {

	public static void main(String[] args) {
		int k43_gogodan = 0;
		for (int k43_i = 1; k43_i < 4; k43_i++) {//for문으로 구구단 1~3단까지 만들기
			

			System.out.printf("  ************  ************  ************\n");
			System.out.printf("  구구단 %d 단   구구단 %d 단    구구단 %d 단\n", k43_i, k43_i + 3, k43_i + 6);//옆으로는 시작단에 +3단, +6단 출력
			System.out.printf("  ************  ************  ************\n");
			for (int k43_j = 1; k43_j < 10; k43_j++) {//각 단마다 1~9까지 곱하여 구구단 완선시키기

				System.out.printf("  %d * %d = %2d  %3d * %1d = %3d  %3d * %1d = %3d\n", k43_i, k43_j, k43_i * k43_j,
						k43_i + 3, k43_j, (k43_i + 3) * k43_j, k43_i + 6, k43_j, (k43_i + 6) * k43_j);
			}
		}
	}

}