package java4;

public class A8 {

	public static void main(String[] args) {
		for (int k43_i = 1; k43_i < 13; k43_i++) {// k43_i�� �� ���ϱ�
			System.out.printf("%d��", k43_i);// k43_i ���
			for (int k43_j = 1; k43_j < 32; k43_j++) {// k43_j�� ������ ���� �� ���ϱ�
				System.out.printf("%d", k43_j);// k43_j ���(�Ʒ� ���ǿ� ����1,3,5,8,12) �� 31���� ���ư���
				if (k43_i == 4 || k43_i == 6 || k43_i == 9 || k43_i == 11) {// ���� k43_i(��)�� 4,6,7,9,11 �̶��
					if (k43_j == 30)// k43_j(��)�� 30 ����
						break;// ���� �� for�� ����
				}
				if (k43_i == 2) {// k43_i(��)�� 2�̸�
					if (k43_j == 28)// k43_j(��)�� 28����
						break;// ���� �� for�� ����
				}
			}
			System.out.println();// �ٹٲ�
		}

	}

}
