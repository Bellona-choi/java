package java5;

public class A1 {

	public static void main(String[] args) {
		int k43_gogodan = 0;//gogodan 생성
		for (int k43_i = -1; k43_i < 8; k43_i++) {//for문으로 구구단 3단씩 출력
			k43_i+= 2;//아래칸은 시작단의 +2단부터 시작
			
			System.out.printf("  ************  ************   ************\n");
			System.out.printf("  구구단 %d 단   구구단 %d 단    구구단 %d 단\n", k43_i, k43_i + 1, k43_i + 2);
			System.out.printf("  ************  ************   ************\n");
			for (int k43_j = 1; k43_j < 10; k43_j++) {//단마다 1~9까지 곱해준다

				System.out.printf("  %d * %d = %2d  %3d * %1d = %3d  %3d * %1d = %3d\n", k43_i, k43_j, k43_i * k43_j,
						k43_i + 1, k43_j, (k43_i + 1) * k43_j, k43_i + 2, k43_j, (k43_i + 2) * k43_j);
			}
		}
	}

}
