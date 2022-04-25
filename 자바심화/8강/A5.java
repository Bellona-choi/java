package java8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class A5 {

	public static void main(String[] args) throws IOException {
		File k43_f = new File("C:\\Users\\kopo\\Desktop\\df\\day_data\\THTSKS010H00.dat");//파일 클래스 불러오기
		BufferedReader k43_br = new BufferedReader(new FileReader(k43_f));//파일을 볼수있게 클래스 정의하기
		long afterTime = System.currentTimeMillis(); // 코드 실행 시간 받아오기
	
		int k43_LineCnt = 0;//줄은 0부터 시작
		int k43_n = -1;//반복문을 빠져나가기 위한 변수
		StringBuffer s = new StringBuffer();//버퍼 클래스 불러오기
		while (true) {//반복문 시작
			char[] k43_ch = new char[100];//1000개씩 배열을 읽는다

			k43_n = k43_br.read(k43_ch);//읽은 배열을 n에 넣는다
			if (k43_n == -1)// 더이상 추가할 배열이 없다면
				break;//반복문을 나간다.

			for (char c : k43_ch) {
				if (c == '\n') {//만약 줄바꿈이 나온다면
					//System.out.printf("[%s]***\n", s.toString());//문자열로 바꿔서 출력
					s.delete(0, s.length());//초기화한다
				} else {
					s.append(c);// c를 추가한다
				}
			}
			k43_LineCnt++;//반복문이 돌때마다 파일수 추가
		}
		System.out.printf("[%s]***\n", s.toString());
		
		long beforeTime = System.currentTimeMillis();// 코드 종료 시간 받아오기
		long secDiffTime = (beforeTime - afterTime)/1000;//종료시간에서 시작시간을 빼서 총 걸린시간 계산
		System.out.println("시작시간"+afterTime);//시작시간 출력
		System.out.println("종료시간" + beforeTime);//종료시간 출력
		System.out.println("총 걸린시간" + secDiffTime+"초");//총 걸린시간 출력
		System.out.printf("총 항목의 수 : %d", k43_LineCnt);// 총 항목의 수
	
		System.out.println("총 항목의 수" + k43_LineCnt);
		k43_br.close();
	}

}
