package java8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class A9 {

	public static void main(String[] args) throws IOException {

		long afterTime = System.currentTimeMillis(); // �ڵ� ���� �Ŀ� �ð� �޾ƿ���

		File k43_f = new File("C:\\Users\\kopo\\Desktop\\df\\day_data\\THTSKS010H00.dat");// THTSKS010H00.dat �� ����
		BufferedReader k43_br = new BufferedReader(new FileReader(k43_f));// ������ �����ְ� Ŭ���� �����ϱ�

		File k43_f1 = new File("C:\\Users\\kopo\\Desktop\\df\\day_data\\last.csv");// ������ ���� Ŭ����
		BufferedWriter k43_bw = new BufferedWriter(new FileWriter(k43_f1));// ������ �����ְ� Ŭ���� �����ϱ�

		String k43_readtxt;
		int k43_min = 0, k43_max = 0;
		int k43_cnt = 0;
		int k43_wcnt = 0;
		String k43_MIN = "", k43_MAX = "";
		while ((k43_readtxt = k43_br.readLine()) != null) {// ���پ� ���� ������ ������� ������
			StringBuffer k43_s = new StringBuffer();// ��Ʈ�� ���� ����
			String[] k43_field = k43_readtxt.split("%_%");// %_%�� �������� ������

			if (k43_field.length > 2 && k43_field[2].replace("^", "").trim().equals("A005930")
					&& k43_field[1].replace("^", "").trim().substring(0, 4).equals("2015")) {// �����ڵ尡 A005930 �ΰͰ� ������
																								// 2015�� �͸� ����
				k43_s.append(k43_field[0].replace("^", "").trim());// field�� ù��° ���ڿ� ^ �� �����ϰ� �յ� ������ �߶� �߰�

				for (int k43_j = 1; k43_j < k43_field.length; k43_j++) {
					k43_s.append("," + k43_field[k43_j].replace("^", "").trim());// field�� ù��° ���ڿ� ^ �� �����ϰ� �յ� ������ �߶�
																					// �߰�
				}
				k43_bw.write(k43_s.toString());// ���ڿ��� �ٲٰ�
				k43_bw.newLine();// �ٹٲ�
				if (k43_wcnt == 0) {//�ҷ��� ���Ͽ� ���� ���ǿ� �´� ���� �����ϸ�
					k43_max = Integer.parseInt(k43_field[3].replace("^", "").trim());//field�� ù��° ���ڿ� ^ �� �����ϰ� �յ� �������� �� �߰�
					k43_min = Integer.parseInt(k43_field[3].replace("^", "").trim());//field�� ù��° ���ڿ� ^ �� �����ϰ� �յ� �������� �� �߰�
					k43_MAX = k43_field[1].replace("^", "").trim();//�ִ밪�� ��¥
					k43_MIN = k43_field[1].replace("^", "").trim();//�ּҰ��� ��¥
				} else {//�ҷ��� ���Ͽ� ���� ���ǿ� �´� ���� ������ �ƴϸ�
					if (k43_max < Integer.parseInt(k43_field[3].replace("^", "").trim())) {//���� �ִ밪�� ���ο� �ٺ��� ������
						k43_max = Integer.parseInt(k43_field[3].replace("^", "").trim());//�ִ밪�� ���� �־��ش�
						k43_MAX = k43_field[1].replace("^", "").trim();//�ִ밪�� ��¥�� ���� �־��ش�
					}
					if (k43_min > Integer.parseInt(k43_field[3].replace("^", "").trim())) {//���� �ּҰ��� ���ο� �ٺ��� ũ��
						k43_min = Integer.parseInt(k43_field[3].replace("^", "").trim());//�ּҰ��� ���� �־��ش�
						k43_MIN = k43_field[1].replace("^", "").trim();//�ּҰ��� ��¥�� ���� �־��ش�
					}
				}

				k43_wcnt++;// THTSKS010H00.dat ���� ���� ��+1
			}
			k43_cnt++;// THTSKS010H00.dat ����� +1+1
		}
		k43_br.close();
		k43_bw.close();
		long beforeTime = System.currentTimeMillis();// �ڵ� ���� �ð� �޾ƿ���
		long secDiffTime = (beforeTime - afterTime) / 1000;// ����ð����� ���۽ð��� ���� �� �ɸ��ð� ���
		System.out.println("���۽ð�" + afterTime);// ���۽ð� ���
		System.out.println("����ð�" + beforeTime);// ����ð� ���
		System.out.println("�� �ɸ��ð�" + secDiffTime + "��");// �� �ɸ��ð� ���
		System.out.printf("Progrm End[%d][%d]records\n", k43_cnt, k43_wcnt);
		System.out.printf("�� �׸��� �� : %d\n", k43_cnt);// �� �׸��� ��
		System.out.printf("������ �׸��� �� : %d\n", k43_wcnt);//������ �׸��� ��
		System.out.println("2015 �Ｚ���� �������� �ִ밪 ��¥" +  k43_MIN);
		System.out.printf("2015 �Ｚ���� �������� �ּҰ� %d\n", k43_min);
		System.out.println("2015 �Ｚ���� �������� �ּҰ� ��¥" +  k43_MAX);
		System.out.printf("2015 �Ｚ���� �������� �ִ밪 %d\n", k43_max);

	}

}
