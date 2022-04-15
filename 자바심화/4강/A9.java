package java4;

public class A9 {

	public static void main(String[] args) {
		for (int k43_i = 1; k43_i < 13; k43_i++) {//k43_i로 1~12까지 월 구하기 
			System.out.printf(" %d월 =>", k43_i);//k43_i 월 출력하기
			LOOP: for (int k43_j = 1; k43_j < 32; k43_j++) {//k43_j로 1~31까지 일 구하기
				System.out.printf("%d,", k43_j);//k43_j 출력하기

				switch (k43_i) {//k43_i별로 k43_j일 한계지정하기
				case 4://k43_i이 4월 이라면
				case 6://k43_i이 6월 이라면
				case 9://k43_i이 9월 이라면
				case 11://k43_i이 11월 이라면
					if (k43_j == 30)//k43_j 가 30이라면
						break LOOP;//강제로 LOOP로 이동(k43_j 반복문으로)
					break;//반목분 빠져나가기
				case 2://k43_i이 2월 이라면
					if (k43_j == 28)//k43_j 가 28이라면
						break LOOP;//강제로 LOOP로 이동(k43_j 반복문으로)
					break;//반목분 빠져나가기
				}
			}
			System.out.println();//줄바꿈
		}
	}

}
