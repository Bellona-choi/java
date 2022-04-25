package java8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class A1 {

	public static void main(String[] args) throws IOException {
		File k43_f = new File("C:\\Users\\kopo\\Desktop\\day_data\\12_04_07_E_무료와이파이정보.csv");//파일 클래스 불러오기

		BufferedReader k43_br = new BufferedReader(new FileReader(k43_f));//버퍼리더 에다가 파일 리더를 넣는다(버퍼처리)
		
		String k43_readtxt;

		if ((k43_readtxt = k43_br.readLine()) == null) {//파일 줄이 비어 있으면
			System.out.printf("빈 파일입니다\n");//빈 파일 입니다 출력
			return;
		}
		String[] field_name = k43_readtxt.split(",");//,를 기준을 문자를 나눈다(header)
		int k43_LineCnt = 0;//줄은 0부터 시작
		while ((k43_readtxt = k43_br.readLine()) != null) {//한줄씩 읽을 때마다 비어있지 않으면
			String[] k43_field = k43_readtxt.split(",");//,를 기준을 문자를 나눈다(value)

			System.out.printf("**[%d번째 항목]************\n", k43_LineCnt);
			for (int k43_j = 0; k43_j < field_name.length; k43_j++) {
				System.out.printf("%s : %s\n", field_name[k43_j], k43_field[k43_j]);
			}
			System.out.printf("****************\n");
			if (k43_LineCnt == 100)//100줄을 읽으면 반복문 종료
				break;
			k43_LineCnt++;//반복문이 돌떄마다 줄 추가

		}
		k43_br.close();
	}

}
