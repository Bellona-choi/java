package java8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class A8 {

	public static void main(String[] args) throws IOException {
		long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기

		File k43_f = new File("C:\\Users\\kopo\\Desktop\\df\\day_data\\THTSKS010H00.dat");// THTSKS010H00.dat 을 연다
		BufferedReader k43_br = new BufferedReader(new FileReader(k43_f));// 파일을 볼수있게 클래스 정의하기

		File k43_f1 = new File("C:\\Users\\kopo\\Desktop\\df\\day_data\\time.csv");// 지정된 값을 time.csv으로 저장
		BufferedWriter k43_bw = new BufferedWriter(new FileWriter(k43_f1));// 파일을 쓸수있게 클래스 정의하기

		String k43_readtxt;

		int k43_cnt = 0;
		int k43_wcnt = 0;
		while ((k43_readtxt = k43_br.readLine()) != null) {// 한줄씩 읽을 때마다 비어있지 않으면
			StringBuffer k43_s = new StringBuffer();// 스트링 버퍼 선언
			String[] k43_field = k43_readtxt.split("%_%");// %_%를 기준으로 나눈다

			if (k43_field.length > 2 && k43_field[1].replace("^", "").trim().equals("20150113")) {// 헤더가 2보다 크고 ^를 빈칸으로 바꾸고 날짜가 20150113이라면
				k43_s.append(k43_field[0].replace("^", "").trim());// field의 첫번째 문자에 ^ 을 제거하고 앞뒤 공백을 잘라서 추가

				for (int k43_j = 1; k43_j < k43_field.length; k43_j++) {
					k43_s.append("," + k43_field[k43_j].replace("^", "").trim());// field의 첫번째 문자에 ^ 을 제거하고 앞뒤 공백을 잘라서 추가
				}
				k43_bw.write(k43_s.toString());// 문자열로 바꾸고
				k43_bw.newLine();// 줄바꿈
				k43_wcnt++;// THTSKS010H00.dat 에서 원한 줄+1
			}
			k43_cnt++;// THTSKS010H00.dat 모든줄 +1+1
		}
		k43_br.close();//파일 닫기
		k43_bw.close();//파일 닫기
		long beforeTime = System.currentTimeMillis();// 코드 종료 시간 받아오기
		long secDiffTime = (beforeTime - afterTime) / 1000;// 종료시간에서 시작시간을 빼서 총 걸린시간 계산
		System.out.println("시작시간" + afterTime);// 시작시간 출력
		System.out.println("종료시간" + beforeTime);// 종료시간 출력
		System.out.println("총 걸린시간" + secDiffTime + "초");// 총 걸린시간 출력
		System.out.printf("Progrm End[%d][%d]records\n", k43_cnt, k43_wcnt);
		System.out.printf("총 항목의 수 : %d\n", k43_cnt);// 총 항목의 수
		System.out.printf("저장한 항목의 수 : %d\n", k43_wcnt);//저장한 항목의 수

	}

}
