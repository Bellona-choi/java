
public class A4 {

	public static void main(String[] args) {
		int k43_ii = 12345; // k43_ii란 정수선언
		int k43_j = (k43_ii / 10) * 10;// k43_j 란 정수선언 및 k43_ii에10을 나눠주고 그 후에 10을 곱해준다(정수형 연산이라서 1원짜리 단위는 버려진다.)
		System.out.println("#4-1 : " + k43_j);// k43_j 출력하기
		
		k43_ii = 12345;// k43_ii란 정수값을 넣어준다
		k43_j = ((k43_ii + 5) / 10) * 10;// k43_j 란 정수선언 및 k43_ii에5를 더해주고 10을 나누고 그 후에 10을 곱해준다(1원짜리 단위를 반올림 처리)
		System.out.println("#4-2 : " + k43_j);// k43_j 출력하기
		
		k43_ii = 12344;// k43_ii란 정수값을 넣어준다
		k43_j = ((k43_ii + 5) / 10) * 10;// k43_j 란 정수선언 및 k43_ii에5를 더해주고 10을 나누고 그 후에 10을 곱해준다
		System.out.println("#4-3 : " + k43_j);// k43_j 출력하기(반올림 을 하려면 6을 더해야 한다 따라서 이식은 틀렸다)
		
		k43_ii = 12344;//k43_ii란 정수값을 넣어준다
		k43_j = (k43_ii / 1000) * 1000;//k43_j에 100원이하 반올림 하는 식을 넣어준다 
		System.out.println("#4-4 : " + k43_j);// k43_j 출력하기(100자리 반올림한값)
		
		k43_ii = 12344;//k43_ii란 정수값을 넣어준다
		k43_j = (k43_ii / 10000) * 10000;//k43_j에 1000원이하 반올림 하는 식을 넣어준다 
		System.out.println("#4-5 : " + k43_j);// k43_j 출력하기(1000자리 반올림한값)
	}

}
