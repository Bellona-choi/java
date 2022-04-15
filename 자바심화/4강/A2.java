package java4;

public class A2 {

	public static void main(String[] args) {
		String k43_jumin = "123456-4234567";//k43_jumin 만들기

		switch (k43_jumin.charAt(7)) {//k43_jumin에 있는 8번째 숫자(0부터 시작해서)
		case '1'://k43_jumin에 있는 7번째 숫자가 1이면
			System.out.println("20세기전 태어난 남자 사람");//20세기전 태어난 남자 사람 출력
			break;//조건이 맞다면 switch를 나간다
		case '2'://k43_jumin에 있는 7번째 숫자가 2이면
			System.out.println("20세기전 태어난 여자 사람");//20세기전 태어난 여자 사람 출력
			break;//조건이 맞다면 switch를 나간다
		case '3'://k43_jumin에 있는 7번째 숫자가 3이면
			System.out.println("20세기후 태어난 남자 사람");//20세기후 태어난 남자 사람 출력
			break;//조건이 맞다면 switch를 나간다
		case '4'://k43_jumin에 있는 7번째 숫자가 4이면
			System.out.println("20세기전 태어난 여자 사람");//20세기후 태어난 여자 사람 출력
			break;//조건이 맞다면 switch를 나간다
		default:
			System.out.println("사람");//위에 조건이 아니라면 사람출력
			break;//조건이 맞다면 switch를 나간다
		}
	}

}
