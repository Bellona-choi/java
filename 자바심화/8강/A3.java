package java8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class A3 {

	public static void FileWrite() throws IOException {
		File k43_f = new File("C:\\Users\\kopo\\Desktop\\day_data\\Mytest.txt");// 파일 클래스 불러오기
		BufferedWriter k43_bw = new BufferedWriter(new FileWriter(k43_f));// 버퍼라이터에다가 파일 라이터를 넣는다(버퍼처리)

		k43_bw.write("안녕 파일");// 파일에 추가
		k43_bw.newLine();// 줄바꿈
		k43_bw.write("hillo 헬로");// 파일에 추가
		k43_bw.newLine();// 줄바꿈

		k43_bw.close();// 파일 닫기
	}

	public static void FileRead() throws IOException {
		File k43_f = new File("C:\\Users\\kopo\\Desktop\\day_data\\Mytest.txt");// 파일 클래스 불러오기
		BufferedReader k43_br = new BufferedReader(new FileReader(k43_f));// 버퍼리더 에다가 파일 리더를 넣는다(버퍼처리)

		String k43_readtxt;

		while ((k43_readtxt = k43_br.readLine()) != null) {// 한줄씩 읽을 때마다 비어있지 않으면
			System.out.printf("%s\n", k43_readtxt);// 한줄씩 출력
		}
		k43_br.close();// 파일을 닫는다

	}

	public static void main(String[] args) throws IOException {
		FileWrite();
		FileRead();
	}

}
