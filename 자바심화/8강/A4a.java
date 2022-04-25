package java8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class A4a {

	public static void main(String[] args) throws IOException {
		File k43_f = new File("C:\\Users\\kopo\\Desktop\\day_data\\�ѱ������������_������������������_20191224.csv");//���� Ŭ���� �ҷ�����

		BufferedReader k43_br = new BufferedReader(new FileReader(k43_f));//���۸��� ���ٰ� ���� ������ �ִ´�(����ó��)

		String k43_readtxt;

		if ((k43_readtxt = k43_br.readLine()) == null) {//���� ���� ��� ������
			System.out.printf("�� ���� �Դϴ�\n");//�� ���� �Դϴ� ���
			return;
		}
		String[] filed_name = k43_readtxt.split(",");//,�������� �ɰ���

		double k43_lat = 37.3860521;//�浵�� ����
		double k43_lng = 127.1214038;//������ ����
		int k43_min=0, k43_max=0;
		int k43_LineCnt = 0;
		double k43_distmin=0.0, k43_distmax=0.0;
		String k43_ls=null, k43_ls1 = null;
		String k43_MAXname = null, k43_MINname = null;
		while ((k43_readtxt = k43_br.readLine()) != null) {//���پ� ���� ������ ������� ������
			
			String[] field = k43_readtxt.split(",");//,�������� �ɰ���
		
			System.out.printf("**[%d��° �׸�]**************\n", k43_LineCnt);
			System.out.printf("%s : %s\n", filed_name[1], field[1]);
			System.out.printf("%s : %s\n", filed_name[2], field[2]);
			System.out.printf("%s : %s\n", filed_name[3], field[3]);
		
			double k43_dist = Math.sqrt(Math.pow(Double.parseDouble(field[3]) - k43_lat, 2)//��Ÿ��� ����(�Ÿ� ���ϱ�)
					+ Math.pow(Double.parseDouble(field[2]) - k43_lng, 2));
			System.out.printf("������������ �Ÿ� : %f\n", k43_dist);
			System.out.printf("*************************\n");
			k43_LineCnt++;
			if(k43_LineCnt==1) {//ó�� �����̶��
				k43_distmin = k43_dist;//�ּҰŸ�
				k43_distmax = k43_dist;//�ִ�Ÿ�
				k43_min = k43_LineCnt;
				k43_max = k43_LineCnt;
				k43_MAXname = field[1];
				k43_MINname = field[1];
				k43_ls = field[6];
				k43_ls1 = field[6];
			}else {//������ 1�� �ƴ϶��
				if(k43_distmin>k43_dist) {//�ּҰŸ��� ���ο� ���κ��� ũ�ٸ�
					k43_min = k43_LineCnt;//���� ���� �����Ѵ�
					k43_distmin = k43_dist;//���� �ٿ� �ִ� �Ÿ��� �����Ѵ� 
					k43_MINname = field[1];
					k43_ls = field[6];
				}else if(k43_distmax < k43_dist) {//�ִ�Ÿ��� ���ο� ���κ��� �۴ٸ�
					k43_max = k43_LineCnt;//���� ���� �����Ѵ�
					k43_distmax = k43_dist;//���� �ٿ� �ִ� �Ÿ��� �����Ѵ� 
					k43_MAXname = field[1];
					k43_ls1 = field[6];
				}
			}
			
		}
		System.out.printf("%s %s �ִ�Ÿ� : %f\n", k43_ls1,k43_MAXname,k43_distmax);
		System.out.printf("%s %s �ּҰŸ� : %f\n", k43_ls,k43_MINname,k43_distmin);
		k43_br.close();//���� �ݱ�
	}


}
