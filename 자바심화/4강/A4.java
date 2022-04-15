package java4;

public class A4 {

	public static void main(String[] args) {
		int k43_iA, k43_iB; // k43_iA, k43_iB 생성
		k43_iA = 0; // k43_iA 값을 0으로 초기화

		while (true) {// 반복문 시작
			k43_iB = 0; // k43_iB 값을 0으로 초기화

			while (true) {// 반복문 시작
				System.out.printf("*");// *출력

				if (k43_iA == k43_iB)// 만약 k43_iA 와 k43_iB 가 같다면
					break;// while문을 종료한다
				k43_iB++;//k43_iA가 30개라면 (0부터 시작이니 31개)

			}
			System.out.printf("\n");// 줄을 바꿔준다
			k43_iA++;// k43_iA를 하나 추가해준다(*을 추가)
			if (k43_iA == 30) {// k43_iA의 줄이 30개라면 (0부터 시작이니 31개)
				break;// while문을 종료한다
			}
		}

	}

}
