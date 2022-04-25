package java8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class A7 {

	public static void main(String[] args) throws IOException {

		File k43_f = new File("C:\\Users\\kopo\\Desktop\\df\\day_data\\THTSKS010H00.dat");// ���� Ŭ���� �ҷ�����
		BufferedReader k43_br = new BufferedReader(new FileReader(k43_f));// ������ �����ְ� Ŭ���� �����ϱ�

		File k43_f1 = new File("C:\\Users\\kopo\\Desktop\\df\\day_data\\A005930.csv");// ������ ���� Ŭ����
		BufferedWriter k43_bw = new BufferedWriter(new FileWriter(k43_f1));// ������ �����ְ� Ŭ���� �����ϱ�
		long afterTime = System.currentTimeMillis(); // �ڵ� ���� �ð� �޾ƿ���
		String readtxt;

		int k43_cnt = 0;
		int k43_wcnt = 0;
		while ((readtxt = k43_br.readLine()) != null) {
			// ���پ� ���� ������ ������� ������
			StringBuffer k43_s = new StringBuffer();// ��Ʈ�� ���� ����
			String[] k43_field = readtxt.split("%_%");// %_%�� �������� ������

			if (k43_field.length > 2 && k43_field[2].replace("^", "").trim().equals("A005930")) {// �����ڵ尡 A005930
																									// �ΰ͸� ����
				k43_s.append(k43_field[0].replace("^", "").trim());// field�� ù��° ���ڿ� ^ �� �����ϰ� �յ� ������ �߶� �߰�
				for (int k43_j = 1; k43_j < k43_field.length; k43_j++) {
					k43_s.append("," + k43_field[k43_j].replace("^", "").trim());// field�� ù��° ���ڿ� ^ �� �����ϰ� �յ� ������
																					// �߶� �߰�
				}
				k43_bw.write(k43_s.toString());// ���ڿ��� �ٲٰ�
				k43_bw.newLine();// �ٹٲ�
				k43_wcnt++;// THTSKS010H00.dat ���� ���� ��+1
			}
			k43_cnt++;// THTSKS010H00.dat ����� +1+1
		}
		k43_br.close();// ���� �ݱ�
		k43_bw.close();// ���� �ݱ�
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
