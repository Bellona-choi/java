import java.text.DecimalFormat;//���ڿ� ,�� �߰��ϴ� ���̺귯��
import java.text.SimpleDateFormat;//��¥, �ð� ������ �����ϱ� ���� ���̺귯��
import java.util.Calendar;//��¥,�ð��� ��ȯ�ϴ� ���̺귯��

public class P5 {

	public static void main(String[] args) {
		DecimalFormat k43_df = new DecimalFormat("###,###,###,###,###");// ,�� ������ �ִ� Ŭ���� ����
		Calendar k43_calt = Calendar.getInstance();// ��¥, �ð� ������ �����ϱ� ���� Ŭ���� ����
		SimpleDateFormat k43_sdt = new SimpleDateFormat("YYYY�� MM�� dd�� HH�� mm�� ss��");// ��¥�� ��ȯ�Ҽ� �ִ� Ŭ���� ����(����/��/��
																						// �ð�:��:��)
		int k43_MyWon = 1000000;// ȯ���� �ѱ���
		double k43_MoneyEx = 1238.21;// �޷�ȯ��
		double k43_commission = 0.003;// ȯ�� ������

		double k43_ComPerOne = k43_MoneyEx * k43_commission;// 1�޷��� ������ ���
		int k43_usd = (int) (k43_MyWon / (k43_MoneyEx + k43_ComPerOne));// �޷� ���ϱ� (��ü �ݾ��� ȯ���� ������)
		int k43_i_totalcom;// �� ������
		double k43_totalcom = k43_usd * k43_ComPerOne;// ������ ���

		if (k43_totalcom != (double) ((int) k43_totalcom)) {// ������ �ø�ó��
			k43_i_totalcom = (int) k43_totalcom + 1;
		} else {
			k43_i_totalcom = (int) k43_totalcom;
		}
		System.out.println("***************************************************************");
		System.out.printf("�� ������: %s�� => ��ȭ: %s�޷�, �޷��� ������: %f��\n", k43_df.format(k43_i_totalcom),
				k43_df.format(k43_usd), k43_ComPerOne);// �� ������ , �޷�, �޷��� ������ ���

		int k43_remain = (int) (k43_MyWon - k43_usd * k43_MoneyEx - k43_i_totalcom);// �ܵ����
		System.out.printf("�� ��ȭȯ���ݾ�: %s�� => ��ȭ: %s�޷�, ������: %s�� �ܵ�: %s��\n", k43_df.format(k43_MyWon),
				k43_df.format(k43_usd), k43_df.format(k43_i_totalcom), k43_remain);// �� ��ȭȯ���ݾ�, �޷�, ������, �ܵ� ���
		System.out.printf("��������ð�: %s\n", k43_sdt.format(k43_calt.getTime()));// ���� �ð� ���
		System.out.println("***************************************************************");
	}

}
