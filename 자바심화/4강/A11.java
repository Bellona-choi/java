package java4;

public class A11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] k43_units = { "��", "��", "��", "��", "��", "��", "��", "ĥ", "��", "��" };//// k43_units�� ���� �迭 ����
		for (int k43_i = 0; k43_i < 101; k43_i++) {// k43_i�� 0���� 100���� k43_i�� 1�� �����ֱ�

			if (k43_i >= 0 && k43_i < 10) {// k43_i�� 0���� ũ�ų� ���� 10��Ÿ ������
				System.out.printf("�����ڸ� : %s\n", k43_units[k43_i]);// �����ڸ� : k43_i ���
			} else if (k43_i >= 10 && k43_i < 100) {// k43_i�� 10���� ũ�ų� ���� 100��Ÿ ������
				int k43_i10, k43_i0;// k43_i10, k43_i0�� ���� ����
				k43_i10 = k43_i / 10;// �����ڸ� ���ϱ�
				k43_i0 = k43_i % 10;// �����ڸ� ���ϱ�
				if (k43_i0 == 0) {// k43_i0 (�����ڸ�)�� 0�̸�
					System.out.printf("�����ڸ� : %s��\n", k43_units[k43_i10]);// �����ڸ� k43_units[k43_i10(�����ڸ�)] ���
				} else {// k43_i0 (�����ڸ�)�� 0�� �ƴ϶��
					System.out.printf("�����ڸ� : %s��%s\n", k43_units[k43_i10], k43_units[k43_i0]);// �����ڸ�
																								// k43_units[k43_i10(�����ڸ�)],k43_units[k43_i0(�����ڸ�)]
																								// ���
				}
			} else {// k43_i�� 100�̶��
				System.out.printf("==> %d\n", k43_i);// ==> 100 ���
			}
		}
	}

}
