
public class P4 {

	public static void main(String[] args) {
		int k43_MyWon = 1000000;// k43_MyWon 100만원 입력
		double k43_MoneyEx = 1238.21;// 달러 환율
		double k43_commission = 0.003;// 환전 수수료

		int k43_usd = (int) (k43_MyWon / k43_MoneyEx);// 달러 구하기
		int k43_remain = (int) (k43_MyWon - k43_usd * k43_MoneyEx);// 잔돈계산

		System.out.printf("*******************************************\n");
		System.out.printf("*            수수료없이 계산                   *\n");
		System.out.printf("총 한화환전금액: %d원 => 미화: %d달러, 잔돈: %d원\n", k43_MyWon, k43_usd, k43_remain);// 환전할 금액, 달러, 잔돈 출력
		System.out.printf("*******************************************\n");
		
		
		double k43_ComperOne = k43_MoneyEx * k43_commission;//1달러당 수수료
		double k43_totalcom = k43_usd * k43_ComperOne;//총 수수료
		
		System.out.printf("*******************************************\n");
		System.out.printf("*            수수료없이 계산                   *\n");
		System.out.printf("총 수수료: %f원 => 미화: %d달러, 달러당 수수료: %f원\n", k43_totalcom, k43_usd, k43_ComperOne); //총 수수료, 달러, 달러당 수수료 출력
		System.out.printf("*******************************************\n");
		
		int k43_i_totalcom;// 총 수수료
		

		if (k43_totalcom != (double) ((int) k43_totalcom)) {// 수수료 올림처리
			k43_i_totalcom = (int) k43_totalcom + 1;
		} else {
			k43_i_totalcom = (int) k43_totalcom;
		}
		System.out.printf("*******************************************\n");
		System.out.printf("*                  수수료 적용환전             *\n");
		System.out.printf("총 수수료: %d원=> 미화: %d달러, 달러당 수수료: %f원\n", k43_i_totalcom, k43_usd,k43_ComperOne);//총수수료, 달러, 달러당 수수료 출력
		int k43_remain1 = (int) (k43_MyWon - k43_usd * k43_MoneyEx - k43_i_totalcom);// 잔돈계산
		System.out.printf("총 한화환전금액: %d원 => 미화: %d달러, 수수료징구:%d원 잔돈: %d원\n", k43_MyWon, k43_usd, k43_i_totalcom, k43_remain1);// 환전할 금액, 달러, 수수료, 잔돈 출력
		
	}
	

}
