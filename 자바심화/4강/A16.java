package java4;

import java.text.DecimalFormat;

public class A16 {

	public static void main(String[] args) {
		String k43_item = "사과";// k43_item란 변수 선언
		int k43_unit_price = 5000;// k43_unit_price란 변수 선언
		int k43_num = 500;// k43_num란 변수 선언
		int k43_total = 0;// k43_total란 변수 선언

		DecimalFormat k43_df = new DecimalFormat("###,###,###,###");

		System.out.printf("====================================================\n");
		System.out.printf("%20.20s%9.8s%10.8s%9.8s\n", "품목", "단가", "수량", "합계");// %20(20칸 비우기) .20s(은byte의 크기)
																				// 품목,단가,수량,합계 출력
		System.out.printf("====================================================\n");

		System.out.printf("%20.20s%10.10s%10.10s%10.10S\n", k43_item, k43_df.format(k43_unit_price),
				k43_df.format(k43_num), k43_df.format(k43_unit_price * k43_num));// k43_item,k43_unit_price,k43_num,k43_total
																					// 값 출력

	}

}
