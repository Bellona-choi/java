package java4;

public class A6 {

	public static void main(String[] args) {
		int k43_iVal;// k43_iVal���� ����
		for (int k43_i = 0; k43_i < 300; k43_i++) {// k43_i�� 0~300���� �ݺ��� ������
			k43_iVal = 5 * k43_i;// k43_iVal�� ���� 5 * k43_i�� ����
			if (k43_iVal >= 0 && k43_iVal < 10) {// ���� k43_iVal�� 0���� ũ�ų� ���� 10���� ������
				System.out.printf("�� %d\n", k43_iVal);// �� , k43_iVal ���
			} else if (k43_iVal >= 10 && k43_iVal < 100) {// ���� k43_iVal�� 10���� ũ�ų� ���� 100���� ������
				System.out.printf("�� %d\n", k43_iVal);// �� , k43_iVal ���
			} else if (k43_iVal >= 100 && k43_iVal < 1000) {// ���� k43_iVal�� 100���� ũ�ų� ���� 1000���� ������
				System.out.printf("�� %d\n", k43_iVal);// �� , k43_iVal ���
			} else {// ���� if���� ���Ե��� ������
				System.out.printf("õ %d\n", k43_iVal);// õ , k43_iVal ���
			}
		}

	}

}
