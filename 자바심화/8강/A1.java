package java8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class A1 {

	public static void main(String[] args) throws IOException {
		File k43_f = new File("C:\\Users\\kopo\\Desktop\\day_data\\12_04_07_E_���������������.csv");//���� Ŭ���� �ҷ�����

		BufferedReader k43_br = new BufferedReader(new FileReader(k43_f));//���۸��� ���ٰ� ���� ������ �ִ´�(����ó��)
		
		String k43_readtxt;

		if ((k43_readtxt = k43_br.readLine()) == null) {//���� ���� ��� ������
			System.out.printf("�� �����Դϴ�\n");//�� ���� �Դϴ� ���
			return;
		}
		String[] field_name = k43_readtxt.split(",");//,�� ������ ���ڸ� ������(header)
		int k43_LineCnt = 0;//���� 0���� ����
		while ((k43_readtxt = k43_br.readLine()) != null) {//���پ� ���� ������ ������� ������
			String[] k43_field = k43_readtxt.split(",");//,�� ������ ���ڸ� ������(value)

			System.out.printf("**[%d��° �׸�]************\n", k43_LineCnt);
			for (int k43_j = 0; k43_j < field_name.length; k43_j++) {
				System.out.printf("%s : %s\n", field_name[k43_j], k43_field[k43_j]);
			}
			System.out.printf("****************\n");
			if (k43_LineCnt == 100)//100���� ������ �ݺ��� ����
				break;
			k43_LineCnt++;//�ݺ����� �������� �� �߰�

		}
		k43_br.close();
	}

}
