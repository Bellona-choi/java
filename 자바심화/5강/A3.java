package java5;

public class A3 {

	public static void main(String[] args) {
		int k43_iWeekday = 5;
		int[] k43_iEnd = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		for (int k43_iMon = 0; k43_iMon < 12; k43_iMon++) {
			System.out.printf("\n\n        %d��\n", k43_iMon + 1);
			System.out.printf("=====================\n");
			System.out.println(" �� �� ȭ �� �� �� �� \n");

			for (int k43_j = k43_iWeekday; k43_j > 0; k43_j--) {
				System.out.printf("   "); // ���۳���ŭ ��ĭ����
			}
			for (int k43_i = 1; k43_i <= k43_iEnd[k43_iMon]; k43_i++) {
				k43_iWeekday++;
				if (k43_iWeekday % 7 == 0) { // k27_iWeekday�� 7�� ������ �������� 6 �� �� �� �� ����
					System.out.printf("%3d\n", k43_i);
					k43_iWeekday = k43_iWeekday - 7; // �ٽ� -1~6 (7��)�� ����ϱ� ���� -7
				} else { // �������� 6�� �ƴ϶�� ��¥ ���
					System.out.printf("%3d", k43_i);
				}

			}
		}

	}

}
