package java4;

public class A10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] k43_iLMD = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };// k43_iLMD란 정수 배열 선언

		for (int k43_i = 1; k43_i < 13; k43_i++) {// k43_i가 1부터 12까지 1씩 추가하기
			System.out.printf(" %d월 =>", k43_i);// k43_i 월 출력하기
			for (int k43_j = 1; k43_j < 32; k43_j++) {// k43_j가 1부터 32까지 1씩 추가하기
				System.out.printf("%d", k43_j);// k43_j 출력하기

				if (k43_iLMD[k43_i - 1] == k43_j)// 만약 k43_iLMD[k43_i-1]이 k43_j라면(k43_i - 1은 k43_iLMD가 0부터 시작해서 이다.)
					break;// for문 빠져나가기
				System.out.printf(",");// , 추가하기
			}
			System.out.println();// 줄바꿈
		}

	}

}
