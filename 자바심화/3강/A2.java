
public class A2 {

	public static void main(String[] args) {
		int k43_sum;//k43_sum 정수형 함수 선언
		k43_sum = 0;//k43_sum 만든 함수 초기화 하기
		for (int k43_i= 0; k43_i < 101; k43_i++) {// for문을 사용하여 0~100까지 돌리기
			k43_sum = k43_sum + k43_i; // 1~100까지의 k43_i 값을 모두 더해서 k43_sum에 넣기
		}
		System.out.printf("#2-1 : %d\n" , k43_sum);// 0~100까지 합을 구한 k43_sum 출력하기

		System.out.printf("#2-2 : %d\n" , k43_sum / 100);// k43_sum을 100으로 나눠서 평균구하기

		int[] k43_v = { 1, 2, 3, 4, 5 };//k43_v배열 선언
		int k43_vSum;//k43_vSum 함수 선언
		k43_vSum = 0;//k43_vSum 함수값을 초기화하기 

		for (int k43_i = 4; k43_i >= 0; k43_i--) {//for문으로 배열 돌리기
			k43_vSum += k43_v[k43_i];//k43_i값을 k43_vSum에 더해주기
		}
		System.out.printf("#2-3 : %d\n" , k43_vSum);//k43_vSum을 출력해주기
	}
}
