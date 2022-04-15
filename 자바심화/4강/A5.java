package java4;

public class A5 {

	public static void main(String[] args) {
		int k43_il;//k43_il을 int로 함수선언
		double k43_iD;//k43_iD을 double로 함수선언
		k43_il = 10 / 3;//k43_il값을 10/3으로 넣어주기
		k43_iD = 10 / 3.0;//k43_iD값을 10/3.0으로 넣어주기

		if (k43_il == k43_iD) {//만약 k43_il와 k43_iD가 같다면
			System.out.printf("equal\n");//equal 출력
		} else {//k43_il와 k43_iD가 같지 않다면
			System.out.printf("Not equal[%f][%f]\n", (double) k43_il, k43_iD);//Not equal과 double형태의 k43_il, k43_iD 출력
		}

		if (k43_iD == 3.333333) {//k43_iD 가 3.333333 이라면
			System.out.printf("equal\n");//equal 출력
		} else {//k43_iD 가 3.333333이 아니라면
			System.out.printf("Not equal[3.333333][%f]\n", k43_iD);//Not equal과 k43_iD 출력
		}

		k43_iD = (int) k43_iD;//double 인 k43_iD를 int로 바꾸기
		if (k43_il == k43_iD) {//만약 k43_il와 k43_iD가 같다면
			System.out.printf("equal\n");//equal 출력
		} else {//k43_il와 k43_iD가 같지 않다면
			System.out.printf("Not equal[%f][%f]\n", (double) k43_il, k43_iD);//Not equal과 double형태의 k43_il, k43_iD 출력
		}
		System.out.printf("int로 인쇄[%d][%f]\n", k43_il, k43_iD);// k43_il, k43_iD 값을 인티저 형태로 출력
		System.out.printf("double로 인쇄[%f][%f]\n", (double) k43_il, k43_iD);// k43_il, k43_iD 값을 더블 형태로 출력

		char k43_a = 'c';//k43_a이란 변수에 c를 대입
		if (k43_a == 'b') {//k43_a이란 변수가 b라면
			System.out.printf("a는 b이다\n");//a는 b이다 출력
		}
		if (k43_a == 'c') {//k43_a이란 변수가 c라면
			System.out.printf("a는 c이다\n");//a는 c이다 출력
		}
		if (k43_a == 'd') {//k43_a이란 변수가 d라면
			System.out.printf("a는 d이다\n");//a는 d이다 출력
		}
		String k43_aa = "abcd";//k43_aa이란 변수에 abcd 를 대입
		if (k43_aa.equals("abcd")) {//k43_aa이란 변수가 abcd랑 같다면
			System.out.printf("k43_aa는 abcd이다\n");//k43_aa는 abcd이다 출력
		} else {////k43_aa이란 변수가 abcd랑 다르다면
			System.out.printf("k43_aa는 abcd가 아니다\n");//k43_aa는 abcd가 아니다 출력
		}
		boolean k43_bb = true;//k43_bb이란 변수를 boolean으로 선언 및 true(참)이라고 선언

		if (!!k43_bb) {//k43_bb가 같다면
			System.out.printf("bb가 아니고 아니면 참이다\n");//bb가 아니고 아니면 참이다 출력
		} else {//k43_bb가 다르다면 
			System.out.println("bb가 아니고 아니면 거짓이다\n");//bb가 아니고 아니면 거짓이다 출력
		}
	}

}
