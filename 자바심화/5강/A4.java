package java5;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class A4 {
	public static int k43_rate(int k43_price, double k43_rat) {
		return (int) (k43_price / (1 + k43_rat));// �հ迡�� �ݾ� ���ϴ� ��
	}

	public static void main(String[] args) {
		int k43_iPrice = 33000; // �հ� ���ϱ�
		double k43_tax = 0.1; // ���� 10%
		Calendar k43_calt = Calendar.getInstance();
		SimpleDateFormat k43_sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");// ����ð� �ҷ�����
		DecimalFormat k43_df = new DecimalFormat("###,###,###,###");// ���ڿ� , �߰����ֱ�

		int k43_total_tax;// �ΰ��� ���ϱ�
		if (((double) k43_iPrice / 11) == k43_iPrice / 11) {// �ѱݾ� �ΰ��� ���ϱ�
			k43_total_tax = (k43_iPrice / 11);// 11�� ���������� �Ҽ����� ������ �״��
		} else {
			k43_total_tax = (k43_iPrice / 11) + 1;// 11�� ���������� �Ҽ����� ������+1
		}
		int k43_item = k43_iPrice - k43_total_tax;// �հ迡�� �ΰ����� ������ �ݾ� ���ϱ�
		System.out.printf("%s\n", "�ſ����");
		System.out.printf("%s%25s\n","�ܸ��� : 2N68665898", "��ǥ��ȣ : 041218");
		System.out.printf("%s\n","������ : �Ѿ��ġ�");
		System.out.printf("%s\n","��  �� : ��� ������ �д籸 Ⱦ�����351���� 10 ,");
		System.out.printf("%s\n", "1��");
		System.out.printf("%s\n","��ǥ�� : ��â��");
		System.out.printf("%s%27s\n", "����� : 752-53-00558", "TEL : 7055695");
		System.out.printf("------------------------------------------------\n");
		System.out.printf("��  �� %38s ��\n", k43_df.format(k43_item));
		System.out.printf("�ΰ��� %38s ��\n", k43_df.format(k43_total_tax));
		System.out.printf("��  �� %38s ��\n", k43_df.format(k43_iPrice));
		System.out.printf("------------------------------------------------\n");
		System.out.printf("%s\n","�츮ī��");
		System.out.printf("%s%12s\n", "ī���ȣ : 5387-20**-****-4613(S)","�Ͻú�");
		System.out.printf("�ŷ��Ͻ� : %s\n", k43_sdt.format(k43_calt.getTime()));
		System.out.printf("%s\n", "���ι�ȣ : 70404427");
		System.out.printf("%s\n", "�ŷ���ȣ : 357734873739");
		System.out.printf("%s%27s\n","���� : ��ī���","���� : 720068568");
		System.out.printf("%s\n","�˸� : EDC����ǥ");
		System.out.printf("%s\n","���� : TEL)1544-4700");
		System.out.printf("------------------------------------------------\n");
		System.out.printf("%24s\n", "* �����մϴ� *");
		System.out.printf("%44s\n","ǥ��V2.08_20200212");
	}

}
