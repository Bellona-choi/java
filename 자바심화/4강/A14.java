package java4;

public class A14 {

	public static void main(String[] args) {
		double k43_fSin;// k43_fSin변수 선언
		for (int k43_i = 0; k43_i < 360; k43_i++) {// 0~359까지 반복문 시작 1씩 추가하기
			k43_fSin = Math.sin(k43_i * 3.141592 / 180);// k43_fSin에 k43_i*3.141592/180 값 대입하기(1라디안 =180/파이)
			System.out.printf("%d sin ==>%f\n", k43_i, k43_fSin);// k43_i + sin + k43_fSin값 출력하기
		}

		for (int k43_i = 0; k43_i < 360; k43_i++) {// 0~359까지 반복문 시작 1씩 추가하기
			k43_fSin = Math.sin(k43_i * 3.141592 / 180);// k43_fSin에 k43_i*3.141592/180 값 대입하기(1라디안 =180/파이
			int k43_iSpace = (int) ((1.0 - k43_fSin) * 50);//k43_iSpace변수 선언, sin 함수는-1~1까지나온다 이를 양수화 하고 50을 곱하여 값이 0~100나오게 식을 대입한다 
			for (int k43_j = 0; k43_j < k43_iSpace; k43_j++) {//360도까지 그리기
				System.out.printf(" ");//빈칸 출력하기
			}
			System.out.printf("*[%f][%d]\n", k43_fSin, k43_iSpace);//k43_fSin,k43_iSpace값 출력하기
		}

	}

}
