
public class A3 {

	public static void main(String[] args) {
		int k43_ii = 1000 / 3; //k43_ii 함수선언 및 값 넣어주기
		System.out.printf("#3-1 : %d\n",  k43_ii);//k43_ii 출력하기
		k43_ii = 1000 % 3; //k43_ii 값 넣어주기,나머지 계산할때
		System.out.printf("#3-2 : %d\n" , k43_ii);//k43_ii 출력하기

		for (int k43_i = 0; k43_i < 20; k43_i++) {//for문으로 0~19까지 함수 돌리기
			System.out.printf("#3-3 : %d  " , k43_i);//k43_i 출력하기
			if (((k43_i + 1) % 5) == 0) {//k43_i + 1 가 5로 나머지를  구할때 나머지가 0이면
				System.out.printf("\n");//아래로 한칸 비워주기
			}
		}
	}
}
