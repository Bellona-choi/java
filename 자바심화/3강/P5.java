import java.text.DecimalFormat;//숫자에 ,를 추가하는 라이브러리
import java.text.SimpleDateFormat;//날짜, 시간 형식을 설정하기 위한 라이브러리
import java.util.Calendar;//날짜,시간를 소환하는 라이브러리

public class P5 {

	public static void main(String[] args) {
		DecimalFormat k43_df = new DecimalFormat("###,###,###,###,###");// ,를 찍을수 있는 클래스 선언
		Calendar k43_calt = Calendar.getInstance();// 날짜, 시간 형식을 설정하기 위한 클래스 선언
		SimpleDateFormat k43_sdt = new SimpleDateFormat("YYYY년 MM월 dd일 HH시 mm분 ss초");// 날짜를 소환할수 있는 클래스 선언(연도/월/일
																						// 시간:분:초)
		int k43_MyWon = 1000000;// 환전할 한국돈
		double k43_MoneyEx = 1238.21;// 달러환율
		double k43_commission = 0.003;// 환전 수수료

		double k43_ComPerOne = k43_MoneyEx * k43_commission;// 1달러당 수수료 계산
		int k43_usd = (int) (k43_MyWon / (k43_MoneyEx + k43_ComPerOne));// 달러 구하기 (전체 금액을 환율로 나눈다)
		int k43_i_totalcom;// 총 수수료
		double k43_totalcom = k43_usd * k43_ComPerOne;// 수수료 계산

		if (k43_totalcom != (double) ((int) k43_totalcom)) {// 수수료 올림처리
			k43_i_totalcom = (int) k43_totalcom + 1;
		} else {
			k43_i_totalcom = (int) k43_totalcom;
		}
		System.out.println("***************************************************************");
		System.out.printf("총 수수료: %s원 => 미화: %s달러, 달러당 수수료: %f원\n", k43_df.format(k43_i_totalcom),
				k43_df.format(k43_usd), k43_ComPerOne);// 총 수수료 , 달러, 달러당 수수료 출력

		int k43_remain = (int) (k43_MyWon - k43_usd * k43_MoneyEx - k43_i_totalcom);// 잔돈계산
		System.out.printf("총 한화환전금액: %s원 => 미화: %s달러, 수수료: %s원 잔돈: %s원\n", k43_df.format(k43_MyWon),
				k43_df.format(k43_usd), k43_df.format(k43_i_totalcom), k43_remain);// 총 한화환전금액, 달러, 수수료, 잔돈 출력
		System.out.printf("최종실행시간: %s\n", k43_sdt.format(k43_calt.getTime()));// 현재 시간 출력
		System.out.println("***************************************************************");
	}

}
