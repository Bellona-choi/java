package java4;

public class A3 {

	public static void main(String[] args) {
		int k43_sum = 0;// k43_sum �Լ� �����
		for (int k43_i = 0; k43_i < 10; k43_i++) {// k43_i�� 0���� �����ؼ� 10���� ���������� k43_i�� 1�� ���ϰ� �ݺ��ؼ� ������
			k43_sum = k43_sum + k43_i;// 0~9���� �� ���� ���ؼ� k43_sum�� �־��ֱ�
		}
		System.out.printf("sum %d\n", k43_sum);// k43_sum�� ����ϱ�

		for (int k43_i = 1; k43_i < 10; k43_i++) {// k43_i�� 1���� �����ؼ� 10���� ���������� k43_i�� 1�� ���ϰ� �ݺ��ؼ� ������
			System.out.printf("***********************\n");
			System.out.printf("      ������ %d ��\n", k43_i);// k43_i ����ؼ� ������� Ȯ��
			System.out.printf("***********************\n");
			for (int k43_j = 1; k43_j < 10; k43_j++) {// k43_j�� 1���� �����ؼ� 10���� ���������� k43_i�� 1�� ���ϰ� �ݺ��ؼ� ������
				System.out.printf("%d * %d = %d\n", k43_i, k43_j, k43_i * k43_j);// ������ ���
			}
		}

	}

}
