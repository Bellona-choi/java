
public class P4 {

	public static void main(String[] args) {
		int k43_MyWon = 1000000;// k43_MyWon 100���� �Է�
		double k43_MoneyEx = 1238.21;// �޷� ȯ��
		double k43_commission = 0.003;// ȯ�� ������

		int k43_usd = (int) (k43_MyWon / k43_MoneyEx);// �޷� ���ϱ�
		int k43_remain = (int) (k43_MyWon - k43_usd * k43_MoneyEx);// �ܵ����

		System.out.printf("*******************************************\n");
		System.out.printf("*            ��������� ���                   *\n");
		System.out.printf("�� ��ȭȯ���ݾ�: %d�� => ��ȭ: %d�޷�, �ܵ�: %d��\n", k43_MyWon, k43_usd, k43_remain);// ȯ���� �ݾ�, �޷�, �ܵ� ���
		System.out.printf("*******************************************\n");
		
		
		double k43_ComperOne = k43_MoneyEx * k43_commission;//1�޷��� ������
		double k43_totalcom = k43_usd * k43_ComperOne;//�� ������
		
		System.out.printf("*******************************************\n");
		System.out.printf("*            ��������� ���                   *\n");
		System.out.printf("�� ������: %f�� => ��ȭ: %d�޷�, �޷��� ������: %f��\n", k43_totalcom, k43_usd, k43_ComperOne); //�� ������, �޷�, �޷��� ������ ���
		System.out.printf("*******************************************\n");
		
		int k43_i_totalcom;// �� ������
		

		if (k43_totalcom != (double) ((int) k43_totalcom)) {// ������ �ø�ó��
			k43_i_totalcom = (int) k43_totalcom + 1;
		} else {
			k43_i_totalcom = (int) k43_totalcom;
		}
		System.out.printf("*******************************************\n");
		System.out.printf("*                  ������ ����ȯ��             *\n");
		System.out.printf("�� ������: %d��=> ��ȭ: %d�޷�, �޷��� ������: %f��\n", k43_i_totalcom, k43_usd,k43_ComperOne);//�Ѽ�����, �޷�, �޷��� ������ ���
		int k43_remain1 = (int) (k43_MyWon - k43_usd * k43_MoneyEx - k43_i_totalcom);// �ܵ����
		System.out.printf("�� ��ȭȯ���ݾ�: %d�� => ��ȭ: %d�޷�, ������¡��:%d�� �ܵ�: %d��\n", k43_MyWon, k43_usd, k43_i_totalcom, k43_remain1);// ȯ���� �ݾ�, �޷�, ������, �ܵ� ���
		
	}
	

}
