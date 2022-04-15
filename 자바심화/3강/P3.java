
public class P3 {

	public static void main(String[] args) {
		String[] k43_item = { "메로나 ", "더위사냥", "보석바 ", "누가바 ", "비비빅 " };//아이스크림의 종류 선언
		int[] k43_price = { 10000, 1500, 2000, 1300, 1250 };//아이스크림 별 가격 선언
		int[] k43_amount = { 10, 30, 5, 1, 4 };//아이스크림 사는 갯수 선언
		double k43_tax_rate = 0.1;//부가가치율
		int k43_total_sum = 0;//총 금액

		System.out.println("**************************************");
		System.out.println("              고른 아이스크림            ");
		System.out.println(" 항목         단가         수량        합  ");
		for (int k43_i = 0; k43_i < k43_item.length; k43_i++) {//for문으로 아이스크림 종류별 계산
			int k43_sum = k43_price[k43_i] * k43_amount[k43_i];//k43_sum은 아이스크림 종류별 가격X갯수
			k43_total_sum = k43_total_sum + k43_sum;//k43_total_sum + k43_sum 합계구하기
			//배열을 순서대로 출력해 주기
			System.out.printf("%.5s \t%7d \t%3d%10d\n", k43_item[k43_i], k43_price[k43_i], k43_amount[k43_i],	k43_sum);

		}
		System.out.println("*************************************");
		System.out.printf("지불 금액 : %27d\n", k43_total_sum);// 지불금액 출력

		int k43_total_net_price = (int) (k43_total_sum / (1 + k43_tax_rate));//과세금액 계산 (총 금액에 / (1+부가가치율))
		System.out.printf("과세금액 :%29d\n", k43_total_net_price);//과세금액 출력
		int k43_tax = k43_total_sum - k43_total_net_price;//세금 계산 (총 금액 - 과세금액)
		System.out.printf("세금 :%32d\n", k43_tax);//세금 출력
	}

}
