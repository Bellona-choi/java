package java4;

public class A15 {

	public static void main(String[] args) {
		int k43_m = 20, k43_n = 1;// k43_m, k43_n ��������

		while (true) {// while�� ����
			for (int k43_i = 0; k43_i < k43_m; k43_i++) {// k43_i�� k43_m�� ������������ k43_i+1
				System.out.printf(" ");// ��ĭ�� ����Ѵ�
			}
			for (int k43_i = 0; k43_i < k43_n; k43_i++) {// k43_i�� k43_n �� ������������ k43_i+1
				System.out.printf("*");// *�� ����Ѵ�
			}
			System.out.printf("\n");// �ٹٲ�
			k43_m = k43_m - 1;// ��ĭ�� �ϳ��� �����Ѵ�
			k43_n = k43_n + 2;// *�� 2���� �߰��Ѵ�
			if (k43_m < 0) {// ���� ��ĭ�� 0���� ������
				break;// while�ݺ����� ������.
			}
		}

	}

}
