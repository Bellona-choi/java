package java4;

public class A17 {

	public static void main(String[] args) {
		for (int k43_i = 1; k43_i < 13; k43_i++) {// k43_i�� 1���� 12���� �ݺ��� ������(�Ҷ����� 1�� �߰�)�����
			System.out.printf("%d�� =>", k43_i);// k43_i + �� ���
			for (int k43_j = 1; k43_j < 32; k43_j++) {// k43_j 1���� 32���� �ݺ��� ������(�ҋ����� 1�� �߰�)�ϰ��
				System.out.printf("%d,", k43_j);// k43_j ���(��)
				if ((k43_i == 4 || k43_i == 6 || k43_i == 9 || k43_i == 11) && (k43_j == 30))
					break;// k43_i(��)�� 4,6,9,11 �̸� k43_j(��)�� 30������ �ϰ� for���� ������
				if (k43_i == 2 && k43_j == 28)
					break;// k43_i(��)�� 2 �̸� k43_j(��)�� 28������ �ϰ� for���� ������
			}
			System.out.printf("\n");// �ٹٲ�
		}

	}

}
