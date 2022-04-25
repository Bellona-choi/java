package java5;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class A4 {
	public static int k43_rate(int k43_price, double k43_rat) {
		return (int) (k43_price / (1 + k43_rat));// 합계에서 금액 구하는 식
	}

	public static void main(String[] args) {
		int k43_iPrice = 33000; // 합계 정하기
		double k43_tax = 0.1; // 세금 10%
		Calendar k43_calt = Calendar.getInstance();
		SimpleDateFormat k43_sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");// 현재시간 불러오기
		DecimalFormat k43_df = new DecimalFormat("###,###,###,###");// 숫자에 , 추가해주기

		int k43_total_tax;// 부가세 구하기
		if (((double) k43_iPrice / 11) == k43_iPrice / 11) {// 총금액 부가세 구하기
			k43_total_tax = (k43_iPrice / 11);// 11로 나누었을떄 소수점이 없으면 그대로
		} else {
			k43_total_tax = (k43_iPrice / 11) + 1;// 11로 나누었을떄 소수점이 있으면+1
		}
		int k43_item = k43_iPrice - k43_total_tax;// 합계에서 부가세를 제외한 금액 구하기
		System.out.printf("%s\n", "신용승인");
		System.out.printf("%s%25s\n","단말기 : 2N68665898", "전표번호 : 041218");
		System.out.printf("%s\n","가맹점 : 한양김치찌개");
		System.out.printf("%s\n","주  소 : 경기 성남시 분당구 횡새울로351번길 10 ,");
		System.out.printf("%s\n", "1층");
		System.out.printf("%s\n","대표자 : 유창신");
		System.out.printf("%s%27s\n", "사업자 : 752-53-00558", "TEL : 7055695");
		System.out.printf("------------------------------------------------\n");
		System.out.printf("금  액 %38s 원\n", k43_df.format(k43_item));
		System.out.printf("부가세 %38s 원\n", k43_df.format(k43_total_tax));
		System.out.printf("합  계 %38s 원\n", k43_df.format(k43_iPrice));
		System.out.printf("------------------------------------------------\n");
		System.out.printf("%s\n","우리카드");
		System.out.printf("%s%12s\n", "카드번호 : 5387-20**-****-4613(S)","일시불");
		System.out.printf("거래일시 : %s\n", k43_sdt.format(k43_calt.getTime()));
		System.out.printf("%s\n", "승인번호 : 70404427");
		System.out.printf("%s\n", "거래번호 : 357734873739");
		System.out.printf("%s%27s\n","매입 : 비씨카드사","가맹 : 720068568");
		System.out.printf("%s\n","알림 : EDC매출표");
		System.out.printf("%s\n","문의 : TEL)1544-4700");
		System.out.printf("------------------------------------------------\n");
		System.out.printf("%24s\n", "* 감사합니다 *");
		System.out.printf("%44s\n","표준V2.08_20200212");
	}

}
