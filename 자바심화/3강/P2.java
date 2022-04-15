
public class P2 {

	public static int k43_netprice(int k43_price, double k43_rate) {//클래스 만들기
		return (int) (k43_price / (1 + k43_rate));//클래스값 리턴하기
	}

	public static void main(String[] args) {
		int k43_price = 1234;//변수 선언(상품가격)
		double k43_tax_rate = 0.1;// 변수선언 (세금10%)

		int k43_netprice = k43_netprice(k43_price, k43_tax_rate);//변수선언 함수호출
		int k43_tax = k43_price - k43_netprice;//세금 변수선언

		System.out.printf("***************************************\n");
		System.out.printf("*      소비자가, 세전가격, 세금 계산          *\n");
		System.out.printf(" 소비자가격: %d, 세전가격: %d, 세금: %d\n", k43_price, k43_netprice, k43_tax);//소비자가격, 세전가격, 세금 출력
		System.out.printf("***************************************\n");
		
		
	}

}
