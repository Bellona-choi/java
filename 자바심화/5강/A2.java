package java5;

public class A2 {

	public static void main(String[] args) {
		int k43_gogodan = 0;
		for (int k43_i = 1; k43_i < 4; k43_i++) {//for������ ������ 1~3�ܱ��� �����
			

			System.out.printf("  ************  ************  ************\n");
			System.out.printf("  ������ %d ��   ������ %d ��    ������ %d ��\n", k43_i, k43_i + 3, k43_i + 6);//�����δ� ���۴ܿ� +3��, +6�� ���
			System.out.printf("  ************  ************  ************\n");
			for (int k43_j = 1; k43_j < 10; k43_j++) {//�� �ܸ��� 1~9���� ���Ͽ� ������ �ϼ���Ű��

				System.out.printf("  %d * %d = %2d  %3d * %1d = %3d  %3d * %1d = %3d\n", k43_i, k43_j, k43_i * k43_j,
						k43_i + 3, k43_j, (k43_i + 3) * k43_j, k43_i + 6, k43_j, (k43_i + 6) * k43_j);
			}
		}
	}

}