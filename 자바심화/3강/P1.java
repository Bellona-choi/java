
public class P1 {
	public static int k43_taxcal(int k43_val, int k43_rate) {
		int k43_ret;// k43_ret �Լ�����

		if (((double) k43_val * (double) k43_rate / 100.0) == k43_val * k43_rate / 100) {//int�� douvle�� �ٲٰ� �Ҽ����� ���Ҽ� �ִ� �� �����
			k43_ret = k43_val * k43_rate / 100;// �Ҽ��� ���ϰ� ������ �׳� ó��
		} else {
			k43_ret = k43_val * k43_rate / 100 + 1;// �Ҽ��� ���ϰ� ���������� �ø�ó��
		}
		return k43_ret;
	}

	public static void main(String[] args) {
		int k43_val = 271;// ���� ���ǰ� �Լ�����
		int k43_rate = 3;// ���� ���ǰ��� ����(5%) �Լ� ����

		int k43_txt = k43_taxcal(k43_val, k43_rate);// ���ݰ� �Լ�ȣ��
		System.out.printf("********************************\n");
		System.out.printf("*         �ܼ� ���� ���          *\n");
		System.out.printf("���� ���ݰ��: %f\n", k43_val * k43_rate / 100.0);// ���� ���ݰ���� �ݾ�

		System.out.printf("��������: %d ���� :%d �����԰���: %d\n", k43_val, k43_txt, k43_val + k43_txt);// ���� �� + ���� �� + �Ѱ���

	}

}
