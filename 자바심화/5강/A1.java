package java5;

public class A1 {

	public static void main(String[] args) {
		int k43_gogodan = 0;//gogodan ����
		for (int k43_i = -1; k43_i < 8; k43_i++) {//for������ ������ 3�ܾ� ���
			k43_i+= 2;//�Ʒ�ĭ�� ���۴��� +2�ܺ��� ����
			
			System.out.printf("  ************  ************   ************\n");
			System.out.printf("  ������ %d ��   ������ %d ��    ������ %d ��\n", k43_i, k43_i + 1, k43_i + 2);
			System.out.printf("  ************  ************   ************\n");
			for (int k43_j = 1; k43_j < 10; k43_j++) {//�ܸ��� 1~9���� �����ش�

				System.out.printf("  %d * %d = %2d  %3d * %1d = %3d  %3d * %1d = %3d\n", k43_i, k43_j, k43_i * k43_j,
						k43_i + 1, k43_j, (k43_i + 1) * k43_j, k43_i + 2, k43_j, (k43_i + 2) * k43_j);
			}
		}
	}

}
