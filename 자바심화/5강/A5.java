package java5;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class A5 {

	public static void main(String[] args) {
		Calendar k43_calt = Calendar.getInstance();
		SimpleDateFormat k43_sdt = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss");// 시간을 출력할수 있는 함수 선언
		DecimalFormat k43_df = new DecimalFormat("###,###,###,###");// 금액에 ,를 추가할수 있는 함수 선언
		String k43_itemname1 = "퓨어에어 비밀차단용마스크(최고급형)";// 1번 물건의 이름
		String k43_itemcode1 = "1031615";// 1번 물건 코드
		int k43_price1 = 3000;// 1번 물건의 가격
		int k43_amount1 = 1;// 1번 물건의 구매 갯수

		String k43_itemname2 = "슬라이드시명찰(가로형)(100호)";// 2번 물건의 이름
		String k43_itemcode2 = "11008152";// 2번 물건 코드
		int k43_price2 = 1000;// 2번 물건의 가격
		int k43_amount2 = 1;// 2번 물건의 구매 갯수

		String k43_itemname3 = "매직흡착 인테리어후크(알루미늉타입)";// 3번 물건의 이름
		String k43_itemcode3 = "1020800";// 3번 물건 코드
		int k43_price3 = 1000;// 3번 물건의 가격
		int k43_amount3 = 1;// 3번 물건의 구매 갯수

		int k43_total = (k43_price1 * k43_amount1) + (k43_price2 * k43_amount2) + (k43_price3 * k43_amount3);// 산 물건의 총
																												// 금액
		int k43_total_rate;// 세금을 구할 함수
		if (((double) k43_total / 11) == k43_total / 11) {// 만약 총 금액이 11로 나눌시 소수점이 없으면
			k43_total_rate = (k43_total / 11);// 부가세에 넣기
		} else {// 같지 않으면
			k43_total_rate = (k43_total / 11) + 1;// 부가세에 나눈금액에 +1
		}
		int k43_tatal_netprice = k43_total - k43_total_rate;// 과세합셰구하기 총 금액 - 부가세
		System.out.printf("%26s\n", "\"국민가게, 다이소\"");
		System.out.printf("%s\n", "(주)아성다이소_분당서현점");
		System.out.printf("%s\n", "전화:031-702-6016");
		System.out.printf("%s\n", "본사:서울 강남구 남부순환로 2748 (도곡동)");
		System.out.printf("대표:박정부,신호섭 213-81-52063\n");
		System.out.printf("%20.29s\n", "매장:경기도 성남시 분당구 분당로53번길 11 (서현");
		System.out.printf("%s\n", "동)");
		System.out.printf("=================================================\n");
		System.out.printf("%28s\n", "소비자중심경영(CCM) 인증기업");
		System.out.printf("%30s\n", "ISO 9001 품질경영시스템 인증기업");
		System.out.printf("=================================================\n");
		System.out.printf("%28s\n", "교환/환불 14일(5월2일)이내,");
		System.out.printf("%s\n", "(전자)영수증, 결제카드 지참 후 구입매장에서 가능");
		System.out.printf("%27s\n", "포장/가격 택 훼손시 교환/환불 불가");
		System.out.printf("%27s\n", "체크카드 취소 시 최대 7일 소요");
		System.out.printf("=================================================\n");
		System.out.printf("%s%36s\n", "[POS 1058231]", k43_sdt.format(k43_calt.getTime()));
		System.out.printf("=================================================\n");
		System.out.printf("%.14s%8s%5s%10s\n", k43_subByte(k43_itemname1,26), k43_df.format(k43_price1), k43_df.format(k43_amount1),
				k43_df.format(k43_price1 * k43_amount1));// 1번 물건의 이름, 금액, 갯수, 금액*갯수 출력
		System.out.printf("[%s]\n", k43_itemcode1);// 1번물건의 코드 출력
		System.out.printf("%.14s%10s%5s%10s\n",k43_subByte(k43_itemname2,26), k43_df.format(k43_price2), k43_df.format(k43_amount2),
				k43_df.format(k43_price2 * k43_amount2));// 2번 물건의 이름, 금액, 갯수, 금액*갯수 출력
		System.out.printf("[%s]\n", k43_itemcode2);// 2번물건의 코드 출력
		System.out.printf("%5.14s%8s%5s%10s\n", k43_subByte(k43_itemname3,26), k43_df.format(k43_price3), k43_df.format(k43_amount3),
				k43_df.format(k43_price3 * k43_amount3));// 3번 물건의 이름, 금액, 갯수, 금액*갯수 출력
		System.out.printf("[%s]\n", k43_itemcode3);// 3번물건의 코드 출력

		System.out.printf("%17.20s%28s\n", "과세합계", k43_df.format(k43_tatal_netprice));// 구한 과세합계 출력
		System.out.printf("%18.20s%28s\n", "부가세", k43_df.format(k43_total_rate));// 구한 부가세 출력
		System.out.printf("-------------------------------------------------\n");
		System.out.printf("%s%41s\n", "판매합계", k43_df.format(k43_total));// 판매합계,총 금액 출력
		System.out.printf("=================================================\n");
		System.out.printf("%s%41s\n", "신용카드", k43_df.format(k43_total));// 신용카드,총 금액 출력
		System.out.printf("-------------------------------------------------\n");
		System.out.printf("%s%41s\n", "우리카드", " 538720**********");
		System.out.printf("%s%17s%8s\n", "승인번호 77982843(0)", "승인금액", k43_df.format(k43_total));// 총 금액 출력
		System.out.printf("=================================================\n");
		System.out.printf("%28.20s%6s\n", k43_sdt.format(k43_calt.getTime()), "분당서현점");// 결제한 시간 출력
		System.out.printf("%s\n", "상품 및 기타 문의 : 1522-4400");
		System.out.printf("%s\n", "멤버십 및 삽다이소 관련 문의 : 1599-2211");
		System.out.printf("%30.20s", "2112820610158231\n");
		System.out.printf("-------------------------------------------------\n");
		System.out.printf("%23s\n", "◈ 다이소 멤버십 맵 또는 홈페이지에 접속하셔서");
		System.out.printf("%25s", "회원가입 후 다양한 혜택을 누려보세요! ◈");
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
