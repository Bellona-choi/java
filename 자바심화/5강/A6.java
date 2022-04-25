package java5;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class A6 {
	static Calendar k43_calt = Calendar.getInstance();
	static SimpleDateFormat k43_sdt = new SimpleDateFormat("YYYY-MM-dd HH:mm");
	static SimpleDateFormat k43_sdt1 = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
	static DecimalFormat k43_df = new DecimalFormat("###,###,###,###");
	static String[] k43_itemname = { "해피홈 SAFE365 핸드크림", "(G)LH원형유리화병 100cm", "상투과자E", "더블링 나일론 깡 롤러", "해피롬 SAFE 바디워시",
			"농심 신라면120g*5", "(대)국내산삼겹살찌개용", "오뚜기 비빔면 156g*4", "GAP 죽장사과 4-6입", "순 유기농 바나나(봉)", "농심삼다수2L",
			"(달콤)순살닭강정(g)", "DZ주니어양말3족C_BK", "DZ주니어양말3족D_WH", "프리미엄생연어초밥", "피코크 들깨미역국500g", "남양 맛있는우유GT 저지방",
			"녹차원흑당시럽10입", "진라면소컵(매)65*6", "케라시스 앰플 트리트먼트", "푸르밀 미숫가루우유", "자일로스갈색설탕500g", "CJ 비비고칩 20G", "피코크 들깨미역국500",
			"흑원당 말차 밀크티", "1+ 등급란 10개입 특", "농심삼다수500M", "우리사과주스1.4", "태평양현미녹차10", "김포금쌀10KG","케라시스 앰플 트리트" };// 구매 물건 종류 입력
	static int[] k43_price = { 1000000, 6900, 5980, 3300, 5500, 3360, 6610, 2750, 10800, 4980, 800, 7920, 4980, 4980, 7130,
			3980, 4480, 4980, 3210, 6950, 2980, 1990, 1980, 3980, 4480, 9480, 310, 2950, 4350, 100000, 6950 };// 물건의 가격 입력
	static int[] k43_num = { 1, 2, 2, 5, 8, 1, 9, 8, 5, 6, 1, 2, 8, 6, 3, 8, 5, 1, 8, 4, 6, 7, 2, 5, 4, 9, 8, 5, 7, 1,1 };// 물건의
																														// 갯수
																														// 입력
	static boolean[] k43_taxfree = { true, false, false, false, false, false, true, false, true, true, false, false,
			false, false, false, false, true, false, false, false, false, false, false, false, false, true, false,
			false, false, true, false };// 물건의 면세 입력

	static int k43_tatal = 0;// 물건의 총 금액
	static int k43_bl_tatal = 0;// 면세 물건의 총 금액
	static int k43_total_rate;// 총 부가세 함수
	static int k43_blool_price;// 면세가 총 금액
	public static void main(String[] args) {
		
		k43_TitlePrint();//영수증 맨위 타으틀을 불러온다
		
		k43_TimeStemp();//영수증 출력시간을 불러온다
		
		k43_HeaderPrint();//헤더(상품명,단가,수량,인쇄)를 불러온다
		
		k43_Total_Print();//합계 세액 등을 불러온다
	}

	public static void k43_TitlePrint() {// 영수증 맨위 타이틀
		System.out.printf("%34s\n", "이마트 죽전점 (031)888-1234");
		System.out.printf("%10s%19s\n","emart", "206-86-50913 강희석");
		System.out.printf("%28s\n", "용인 수지구 포은대로 552");
		System.out.printf("\n");
	}

	public static void k43_TimeStemp() {// 출력시간 인쇄
		System.out.printf("%s\n", "영수증 미지참시 교환/환불 불가");
		System.out.printf("%s\n", "정상상품에 한함, 30일 이내(신선 7일)");
		System.out.printf("%s\n", "일부 브랜드매장 제외(매장 고지물참조)");
		System.out.printf("%s\n", "교환/환불 구매점에서 가능(결제카드 지참)");
		System.out.printf("\n");
		System.out.printf("%s%s%18s\n", "[구 매]", k43_sdt.format(k43_calt.getTime()), "POS:0011-9861");// 구매시간 출력
		System.out.printf("%s\n", "-----------------------------------------");
	}

	public static void k43_HeaderPrint() {// 헤더(상품명,단가,수량,인쇄)

		System.out.printf("%7s%17s%3s%5s\n", "상 품 명", "단 가", "수량", "금 액");//상품명, 단가, 수량, 금액 출력
		for (int k43_i = 0; k43_i < k43_itemname.length; k43_i++) {// 구매 물건의 갯수만큼 for문 돌리기
			
			if (k43_i % 5 == 0) {// 5줄씩 출력될 때마다
				System.out.printf("%s\n", "-----------------------------------------");// 출력하기
			}
			if (k43_taxfree[k43_i] == true) {// 만약 면세가 이면
				System.out.printf("* ");// 앞에 *출력
				k43_bl_tatal += k43_price[k43_i] * k43_num[k43_i];// 면세 물건의 총가격 구하기
				k43_blool_price += k43_price[k43_i] * k43_num[k43_i];//면세가격 넣기
			} else {// 면세 물건이 아니면
				System.out.printf("  ");// 앞에 한칸 띄어주기
			}
			
			k43_tatal += k43_price[k43_i] * k43_num[k43_i];// 물건의 총 금액 구하기

			System.out.printf("%s%10s%2s%10s\n", k43_subByte(k43_itemname[k43_i], 17),
					k43_df.format(k43_price[k43_i]), k43_num[k43_i], k43_df.format(k43_price[k43_i] * k43_num[k43_i]));//

		}
		
		 
		k43_total_rate = k43_tatal-k43_blool_price;//면세가를 제외한 가격 세금 만들기
		if (((double) k43_total_rate / 11) == k43_total_rate / 11) {// 총금액 부가세 구하기
			k43_total_rate = (k43_total_rate / 11);// 11로 나누었을떄 소수점이 없으면 그대로
		} else {
			k43_total_rate = (k43_total_rate / 11) + 1;// 11로 나누었을떄 소수점이 있으면+1
		}
	}

	public static void k43_Total_Print() {//합계 세액등을 인쇄
		int k43_point=5473;//현재 보유한 포인트
		int k43_new_point = k43_tatal/1000;//새로운 포인트(총합/1000)
		int k43_tatal_point=k43_point+k43_new_point;
		System.out.printf("\n");
		System.out.printf("%22s%14s\n", "총 품목 수량", k43_itemname.length);
		System.out.printf("%23s%14s\n", "(*)면 세  물 품", k43_df.format(k43_bl_tatal));
		System.out.printf("%23s%14s\n", "과 세  물 품", k43_df.format(k43_tatal - k43_total_rate - k43_bl_tatal));
		System.out.printf("%24s%14s\n", "부   가   세", k43_df.format(k43_total_rate));
		System.out.printf("%25s%14s\n", "합        계", k43_df.format(k43_tatal));
		System.out.printf("%s%24s\n", "결 제 대 상 금 액", k43_df.format(k43_tatal));
		System.out.printf("%s\n", "-----------------------------------------");
		System.out.printf("%s%28s\n", "0012 KEB 하나", "541707**0484/35860658");
		System.out.printf("%s%16.18s%10.50s\n", "카드결제(IC)", "일시불 / ",k43_df.format(k43_tatal));
		System.out.printf("%s\n", "-----------------------------------------");
		System.out.printf("%23s\n", "[신세계포인트 적립]");
		System.out.printf("%s\n", "홍*두 고객님의 포인트 현황입니다.");
		System.out.printf("%s%20s%7.20s\n", "금회발생포인트", "9350**9995", k43_df.format(k43_new_point));
		System.out.printf("%s%18s%s%5s%s\n", "누계(가용)포인트", k43_df.format(k43_tatal_point),"(",k43_df.format(k43_point),")");
		System.out.printf("%s\n", "*신세계포인트 유효기간은 2년입니다.");
		System.out.printf("%s\n", "-----------------------------------------");
		System.out.printf("%23s\n", "구매금액기준 무료주차시간 자동부여");
		System.out.printf("%s%30s\n", "차량번호 :", "34저****");
		System.out.printf("%s%31s\n", "입차시간 :", k43_sdt1.format(k43_calt.getTime()));
		System.out.printf("%s\n", "-----------------------------------------");
		System.out.printf("%s%25s\n", "캐셔:084599 양00", "1150");
		System.out.printf("%33s\n","llllllllllllllllllllll");
		System.out.printf("%33s\n","llllllllllllllllllllll");
		System.out.printf("%33s\n","llllllllllllllllllllll");
		System.out.printf("%37s\n", "20220419/00119861/00164980/31");
	}

	public static String k43_subByte(String k43_source, int k43_cut) {//
		if (!k43_source.isEmpty()) {// 문자열이 비어있지 않다면
			k43_source = k43_source.trim();// 공백삭제
			if (k43_source.getBytes().length <= k43_cut) {// 자르는 값보다 문자열이 작으면
				for (int k43_i = k43_cut - k43_source.getBytes().length; k43_i > 0; k43_i--) {//지정된 값이 0보다 클때 하나씩 빼주고
					k43_source += " ";// 빈칸추가
				}
				return k43_source;//k43_source값 받기
			} else {// 문자열이 크면
				StringBuffer k43_sb = new StringBuffer(k43_cut);
				int k43_cnt = 0;// 변수0으로 초기화
				for (char k43_ch : k43_source.toCharArray()) {// 문자형으로 이동
					k43_cnt += String.valueOf(k43_ch).getBytes().length;// 정한 글자만큼 추가
					if (k43_cnt > k43_cut) {//변수가 자를 문자보다 크면
						break;//for문 나가기
					}
					k43_sb.append(k43_ch);//문자열에 자른만큼 추가하기
				}
				if (k43_sb.toString().getBytes().length == k43_cut - 1) {//만약 문자열 길이가 자를문자-1과 같으면
					k43_sb.append(" ");//빈칸 추가하기
				}
				return k43_sb.toString();
			}
		} else {
			return "";
		}
	}
}
