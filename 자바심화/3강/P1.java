
public class P1 {
	public static int k43_taxcal(int k43_val, int k43_rate) {
		int k43_ret;// k43_ret 함수선언

		if (((double) k43_val * (double) k43_rate / 100.0) == k43_val * k43_rate / 100) {//int를 douvle로 바꾸고 소수점도 구할수 있는 식 만들기
			k43_ret = k43_val * k43_rate / 100;// 소수점 이하가 없을떄 그냥 처리
		} else {
			k43_ret = k43_val * k43_rate / 100 + 1;// 소수점 이하가 있을떄에는 올림처리
		}
		return k43_ret;
	}

	public static void main(String[] args) {
		int k43_val = 271;// 세전 물건값 함수선언
		int k43_rate = 3;// 세전 물건값의 세금(5%) 함수 선언

		int k43_txt = k43_taxcal(k43_val, k43_rate);// 세금값 함수호출
		System.out.printf("********************************\n");
		System.out.printf("*         단순 세금 계산          *\n");
		System.out.printf("실제 세금계산: %f\n", k43_val * k43_rate / 100.0);// 실제 세금계산한 금액

		System.out.printf("세전가격: %d 세금 :%d 세포함가격: %d\n", k43_val, k43_txt, k43_val + k43_txt);// 물건 값 + 세금 값 + 총가격

	}

}
