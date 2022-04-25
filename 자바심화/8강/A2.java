package java8;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class A2 {

	public static void main(String[] args) {
		try {//혹시 중간에 에러가 나서 멈추면 않되니깐 try사용
			File f = new File("C:\\Users\\kopo\\Desktop\\day_data\\asd.txt");//파일 클래스 불러오기
			FileWriter fw = new FileWriter(f);//파일을 쓸수있게 클래스 정의하기
			
			fw.write("안녕 파일\n");//불러온 파일에 값 넣기
			fw.write("hellr 헬로\n");//불러온 파일에 값 넣기
			fw.close();//불러온 파일 닫기
			
			FileReader fr = new FileReader(f);//파일을 볼수있게 클래스 정의하기
			int n = -1;
			char[] ch;
			
			while(true) {//없을때까지
				ch = new char[100];//100개씩 읽기
				n = fr.read(ch);//읽은 값을 넣기
				
				if(n==-1)break;//만약 n이 -1이라면 while문 종료(더이상 읽을게 없으면)
				
				for(int i =0;i<n;i++) {
					System.out.printf("%c", ch[i]);
				}
			}
			fr.close();//다 처리되서 break가 되면 파일을 닫는다
			System.out.printf("\n FIle READ END ");//while문을 빠져나오면 출력
		}catch(Exception e) {
			System.out.printf("나 에러[%s]\n",e);//에러가 나면 출력
		}

	}
	
	

}
