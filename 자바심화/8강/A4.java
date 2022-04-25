package java8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class A4 {

	public static void main(String[] args) throws IOException {
		File k43_f = new File("C:\\Users\\kopo\\Desktop\\day_data\\12_04_07_E_무료와이파이정보.csv");//파일 클래스 불러오기

		BufferedReader k43_br = new BufferedReader(new FileReader(k43_f));//버퍼리더 에다가 파일 리더를 넣는다(버퍼처리)

		String k43_readtxt;

		if ((k43_readtxt = k43_br.readLine()) == null) {//파일 줄이 비어 있으면
			System.out.printf("빈 파일 입니다\n");//빈 파일 입니다 출력
			return;
		}
		String[] filed_name = k43_readtxt.split(",");//,기준으로 쪼갠다
		String k43_MAXname = null, k43_MINname = null;
		double k43_lat = 37.3860521;//경도값 설정
		double k43_lng = 127.1214038;//위도값 설정
		int k43_min=0, k43_max=0;
		int k43_LineCnt = 0;
		
		double k43_distmin=0.0, k43_distmax=0.0;
		String k43_ls=null, k43_ls1 = null;
		while ((k43_readtxt = k43_br.readLine()) != null) {//한줄씩 읽을 때마다 비어있지 않으면
			
			String[] field = k43_readtxt.split(",");//,기준으로 쪼갠다
		
			System.out.printf("**[%d번째 항목]**************\n", k43_LineCnt);
			System.out.printf("%s : %s\n", filed_name[1], field[1]);
			System.out.printf("%s : %s\n", filed_name[13], field[13]);
			System.out.printf("%s : %s\n", filed_name[14], field[14]);
		
			double k43_dist = Math.sqrt(Math.pow(Double.parseDouble(field[13]) - k43_lat, 2)//피타고라스 정리(거리 구하기)
					+ Math.pow(Double.parseDouble(field[14]) - k43_lng, 2));
			System.out.printf("현재지점과의 거리 : %f\n", k43_dist);
			System.out.printf("*************************\n");
			k43_LineCnt++;
			if(k43_LineCnt==1) {//처음 라인이라면
				k43_distmin = k43_dist;//최소거리
				k43_distmax = k43_dist;//최대거리
				k43_min = k43_LineCnt;
				k43_max = k43_LineCnt;
				k43_MAXname = field[1];
				k43_MINname = field[1];
				k43_ls = field[4];
				k43_ls1 = field[4];
			}else {//라인이 1이 아니라면
				if(k43_distmin>k43_dist) {//최소거리가 새로운 라인보다 크다면
					k43_min = k43_LineCnt;//현재 줄을 대입한다
					k43_distmin = k43_dist;//현재 줄에 있는 거리를 대입한다 
					k43_MINname = field[1];
					k43_ls = field[4];
				
				}else if(k43_distmax < k43_dist) {//최대거리가 새로운 라인보다 작다면
					k43_max = k43_LineCnt;//현재 줄을 대입한다
					k43_distmax = k43_dist;//현재 줄에 있는 거리를 대입한다 
					k43_MAXname = field[1];
					k43_ls1 = field[4];
				}
			}
			
		}
		System.out.printf("[%s] %s %s 최대거리 : %f\n",k43_min,k43_ls1, k43_MAXname,k43_distmax);
		System.out.printf("[%s] %s %s 최소거리 : %f\n",k43_max,k43_ls, k43_MINname,k43_distmin);
		k43_br.close();//파일 닫기
	}


}
