package java8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class A5 {

	public static void main(String[] args) throws IOException {
		File k43_f = new File("C:\\Users\\kopo\\Desktop\\df\\day_data\\THTSKS010H00.dat");//���� Ŭ���� �ҷ�����
		BufferedReader k43_br = new BufferedReader(new FileReader(k43_f));//������ �����ְ� Ŭ���� �����ϱ�
		long afterTime = System.currentTimeMillis(); // �ڵ� ���� �ð� �޾ƿ���
	
		int k43_LineCnt = 0;//���� 0���� ����
		int k43_n = -1;//�ݺ����� ���������� ���� ����
		StringBuffer s = new StringBuffer();//���� Ŭ���� �ҷ�����
		while (true) {//�ݺ��� ����
			char[] k43_ch = new char[100];//1000���� �迭�� �д´�

			k43_n = k43_br.read(k43_ch);//���� �迭�� n�� �ִ´�
			if (k43_n == -1)// ���̻� �߰��� �迭�� ���ٸ�
				break;//�ݺ����� ������.

			for (char c : k43_ch) {
				if (c == '\n') {//���� �ٹٲ��� ���´ٸ�
					//System.out.printf("[%s]***\n", s.toString());//���ڿ��� �ٲ㼭 ���
					s.delete(0, s.length());//�ʱ�ȭ�Ѵ�
				} else {
					s.append(c);// c�� �߰��Ѵ�
				}
			}
			k43_LineCnt++;//�ݺ����� �������� ���ϼ� �߰�
		}
		System.out.printf("[%s]***\n", s.toString());
		
		long beforeTime = System.currentTimeMillis();// �ڵ� ���� �ð� �޾ƿ���
		long secDiffTime = (beforeTime - afterTime)/1000;//����ð����� ���۽ð��� ���� �� �ɸ��ð� ���
		System.out.println("���۽ð�"+afterTime);//���۽ð� ���
		System.out.println("����ð�" + beforeTime);//����ð� ���
		System.out.println("�� �ɸ��ð�" + secDiffTime+"��");//�� �ɸ��ð� ���
		System.out.printf("�� �׸��� �� : %d", k43_LineCnt);// �� �׸��� ��
	
		System.out.println("�� �׸��� ��" + k43_LineCnt);
		k43_br.close();
	}

}
