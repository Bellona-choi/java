package java8;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class A2 {

	public static void main(String[] args) {
		try {//Ȥ�� �߰��� ������ ���� ���߸� �ʵǴϱ� try���
			File f = new File("C:\\Users\\kopo\\Desktop\\day_data\\asd.txt");//���� Ŭ���� �ҷ�����
			FileWriter fw = new FileWriter(f);//������ �����ְ� Ŭ���� �����ϱ�
			
			fw.write("�ȳ� ����\n");//�ҷ��� ���Ͽ� �� �ֱ�
			fw.write("hellr ���\n");//�ҷ��� ���Ͽ� �� �ֱ�
			fw.close();//�ҷ��� ���� �ݱ�
			
			FileReader fr = new FileReader(f);//������ �����ְ� Ŭ���� �����ϱ�
			int n = -1;
			char[] ch;
			
			while(true) {//����������
				ch = new char[100];//100���� �б�
				n = fr.read(ch);//���� ���� �ֱ�
				
				if(n==-1)break;//���� n�� -1�̶�� while�� ����(���̻� ������ ������)
				
				for(int i =0;i<n;i++) {
					System.out.printf("%c", ch[i]);
				}
			}
			fr.close();//�� ó���Ǽ� break�� �Ǹ� ������ �ݴ´�
			System.out.printf("\n FIle READ END ");//while���� ���������� ���
		}catch(Exception e) {
			System.out.printf("�� ����[%s]\n",e);//������ ���� ���
		}

	}
	
	

}
