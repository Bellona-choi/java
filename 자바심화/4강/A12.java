package java4;

public class A12 {

	public static void main(String[] args) {
		// 2030200000 20000000 1001034567
		int k43_iNumVal = 2000012123;// k43_iNumVal란 변수에 1001034567 선언
		String k43_sNumVal = String.valueOf(k43_iNumVal);// k43_iNumVal(int)를 k43_sNumVal(str)로 변경 후 선언
		String k43_sNumVoice = "";// str을 하나씩 쪼개주기
		System.out.printf("==> %s [%d자리]\n", k43_sNumVal, k43_sNumVal.length());// k43_sNumVal와 k43_sNumVal의 길이를 출력하기

		int k43_i, k43_j;// k43_i, k43_j 변수 선언하기

		String[] k43_units = { "영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구" };// k43_units에 숫자 입력 및 선언하기
		String[] k43_unitx = { "", "십", "백", "천", "만", "십", "백", "천", "억", "십" };// k43_unitx에 단위 입력 및 선언하기

		k43_i = 0;// k43_i값 초기화하기
		k43_j = k43_sNumVal.length() - 1;// k43_j를 k43_sNumVal의 길의에 1을 뺴주기

		while (true) {// while반복문 시작
			if (k43_i >= k43_sNumVal.length())// 만약 k43_i의 값이 k43_sNumVal의 길이보다 크거나 같으면
				break;// while 반복문 종료

			System.out.printf("%s[%s]", k43_sNumVal.substring(k43_i, k43_i + 1),
					k43_units[Integer.parseInt(k43_sNumVal.substring(k43_i, k43_i + 1))]);// 숫자들을 k43_units형태로 출력하기
			if (k43_sNumVal.substring(k43_i, k43_i + 1).equals("0")) {// k43_sNumVal.substring(k43_i, k43_i + 1)가 0이라면
				if (k43_unitx[k43_j].equals("만") || k43_unitx[k43_j].equals("억")) {// k43_unitx[k43_j] 가 억 이라면
					k43_sNumVoice = k43_sNumVoice + "" + k43_unitx[k43_j];// k43_sNumVoice = 숫자 + 숫자읽기 대입
					if (k43_sNumVal.substring(k43_sNumVal.length() - 8, k43_sNumVal.length() - 4).equals("0000")) {// 만약 뒤에서 5번째자리(만자리)가 0이라면
						k43_sNumVoice = k43_sNumVoice.replace("만", "");// 만 을 빈칸으로 교체
					}
				}
			} else {
				k43_sNumVoice = k43_sNumVoice + k43_units[Integer.parseInt(k43_sNumVal.substring(k43_i, k43_i + 1))]
						+ k43_unitx[k43_j];// 0이 아닐때 인덱스를 추가한다
			}
			k43_i++;// 숫자를 뒤로 넘기기
			k43_j--;// 인덱스를 앞으로 넘기기
		}
		System.out.printf("\n %s[%s]\n", k43_sNumVal, k43_sNumVoice);// 숫자랑 숫자읽기를 출력한다

	}
}