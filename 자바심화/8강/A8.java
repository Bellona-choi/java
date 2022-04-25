package java8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class A8 {

	public static void main(String[] args) throws IOException {
		long afterTime = System.currentTimeMillis(); // �ڵ� ���� �Ŀ� �ð� �޾ƿ���

		File k43_f = new File("C:\\Users\\kopo\\Desktop\\df\\day_data\\THTSKS010H00.dat");// THTSKS010H00.dat �� ����
		BufferedReader k43_br = new BufferedReader(new FileReader(k43_f));// ������ �����ְ� Ŭ���� �����ϱ�

		File k43_f1 = new File("C:\\Users\\kopo\\Desktop\\df\\day_data\\time.csv");// ������ ���� time.csv���� ����
		BufferedWriter k43_bw = new BufferedWriter(new FileWriter(k43_f1));// ������ �����ְ� Ŭ���� �����ϱ�

		String k43_readtxt;

		int k43_cnt = 0;
		int k43_wcnt = 0;
		while ((k43_readtxt = k43_br.readLine()) != null) {// ���پ� ���� ������ ������� ������
			StringBuffer k43_s = new StringBuffer();// ��Ʈ�� ���� ����
			String[] k43_field = k43_readtxt.split("%_%");// %_%�� �������� ������

			if (k43_field.length > 2 && k43_field[1].replace("^", "").trim().equals("20150113")) {// ����� 2���� ũ�� ^�� ��ĭ���� �ٲٰ� ��¥�� 20150113�̶��
				k43_s.append(k43_field[0].replace("^", "").trim());// field�� ù��° ���ڿ� ^ �� �����ϰ� �յ� ������ �߶� �߰�

				for (int k43_j = 1; k43_j < k43_field.length; k43_j++) {
					k43_s.append("," + k43_field[k43_j].replace("^", "").trim());// field�� ù��° ���ڿ� ^ �� �����ϰ� �յ� ������ �߶� �߰�
				}
				k43_bw.write(k43_s.toString());// ���ڿ��� �ٲٰ�
				k43_bw.newLine();// �ٹٲ�
				k43_wcnt++;// THTSKS010H00.dat ���� ���� ��+1
			}
			k43_cnt++;// THTSKS010H00.dat ����� +1+1
		}
		k43_br.close();//���� �ݱ�
		k43_bw.close();//���� �ݱ�
		long beforeTime = System.currentTimeMillis();// �ڵ� ���� �ð� �޾ƿ���
		long secDiffTime = (beforeTime - afterTime) / 1000;// ����ð����� ���۽ð��� ���� �� �ɸ��ð� ���
		System.out.println("���۽ð�" + afterTime);// ���۽ð� ���
		System.out.println("����ð�" + beforeTime);// ����ð� ���
		System.out.println("�� �ɸ��ð�" + secDiffTime + "��");// �� �ɸ��ð� ���
		System.out.printf("Progrm End[%d][%d]records\n", k43_cnt, k43_wcnt);
		System.out.printf("�� �׸��� �� : %d\n", k43_cnt);// �� �׸��� ��
		System.out.printf("������ �׸��� �� : %d\n", k43_wcnt);//������ �׸��� ��

	}

}
