package java4;

public class A4 {

	public static void main(String[] args) {
		int k43_iA, k43_iB; // k43_iA, k43_iB ����
		k43_iA = 0; // k43_iA ���� 0���� �ʱ�ȭ

		while (true) {// �ݺ��� ����
			k43_iB = 0; // k43_iB ���� 0���� �ʱ�ȭ

			while (true) {// �ݺ��� ����
				System.out.printf("*");// *���

				if (k43_iA == k43_iB)// ���� k43_iA �� k43_iB �� ���ٸ�
					break;// while���� �����Ѵ�
				k43_iB++;//k43_iA�� 30����� (0���� �����̴� 31��)

			}
			System.out.printf("\n");// ���� �ٲ��ش�
			k43_iA++;// k43_iA�� �ϳ� �߰����ش�(*�� �߰�)
			if (k43_iA == 30) {// k43_iA�� ���� 30����� (0���� �����̴� 31��)
				break;// while���� �����Ѵ�
			}
		}

	}

}
