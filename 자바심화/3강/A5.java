
public class A5 {

	public static void main(String[] args) {
		int k43_MyVal = 14 / 5; //k43_MyVal 함수 선언 및 값 넣기, 소수점 이하는 버려진다
		System.out.println("#5-1 : " + k43_MyVal);//k43_MyVal 출력하기

		double k43_MyValF;//k43_MyValF 함수 선언

		k43_MyValF = 14 / 5;//k43_MyValF에 14/5 대입 소수점 버림
		System.out.println("#5-2 : " + k43_MyValF);//k43_MyValF 출력하기

		k43_MyValF = 14.0 / 5;//k43_MyValF에14.0/5 대입 한개라도 실수 형태어야 실수형태로 나온다
		System.out.println("#5-3 : " + k43_MyValF);//k43_MyValF 출력하기

		k43_MyValF = (14.0) / 5 + 0.5;// 나누기가 먼저 하기 때문에 2.8+0.5가 된다
		System.out.println("#5-4 : " + k43_MyValF);//k43_MyValF 출력하기

		k43_MyValF = (int) ((14.0) / 5 + 0.5); //실수형으로 계산을 하고 정수형으로 바꿔준다(이떄 소수점은 버려진다)
		System.out.println("#5-5 : " + k43_MyValF);//k43_MyValF 출력하기
	}

}
