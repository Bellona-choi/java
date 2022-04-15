package java4;

public class A7 {

	public static void main(String[] args) {
		for (int k43_i = 1; k43_i < 13; k43_i++) {//k43_i는 1부터 12까지 반복문 돌리기(할때마다 1씩 추가)월계산
			System.out.printf(" %d월 =>", k43_i);//k43_i + 월 출력
			for (int k43_j = 1; k43_j < 32; k43_j++) {//k43_j 1부터 32까지 반복문 돌리기(할떄마다 1씩 추가)일계산
				System.out.printf("%d", k43_j);//k43_j 출력

				if(k43_i == 1 && k43_j == 31)break;//k43_i이 1이고 k43_j가 31이라면 k43_i == 1 종료
				if(k43_i == 2 && k43_j == 28)break;//k43_i이 2이고 k43_j가 28이라면 k43_i == 2 종료
				if(k43_i == 3 && k43_j == 31)break;//k43_i이 3이고 k43_j가 31이라면 k43_i == 3 종료
				if(k43_i == 4 && k43_j == 30)break;//k43_i이 4이고 k43_j가 30이라면 k43_i == 4 종료
				if(k43_i == 5 && k43_j == 31)break;//k43_i이 5이고 k43_j가 31이라면 k43_i == 5 종료
				if(k43_i == 6 && k43_j == 30)break;//k43_i이 6이고 k43_j가 30이라면 k43_i == 6 종료
				if(k43_i == 7 && k43_j == 31)break;//k43_i이 7이고 k43_j가 31이라면 k43_i == 7 종료
				if(k43_i == 8 && k43_j == 31)break;//k43_i이 8이고 k43_j가 31이라면 k43_i == 8 종료
				if(k43_i == 9 && k43_j == 30)break;//k43_i이 9이고 k43_j가 30이라면 k43_i == 9 종료
				if(k43_i == 10 && k43_j == 31)break;//k43_i이 10이고 k43_j가 31이라면 k43_i == 10 종료
				if(k43_i == 11 && k43_j == 30)break;//k43_i이 11이고 k43_j가 30이라면 k43_i == 11종료
				if(k43_i == 12 && k43_j == 31)break;//k43_i이 12이고 k43_j가 31이라면 k43_i == 12 종료
			}
			System.out.println();//다음줄 내리기
		}

	}

}
