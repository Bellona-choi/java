package java4;

public class A9 {

	public static void main(String[] args) {
		for (int k43_i = 1; k43_i < 13; k43_i++) {//k43_i�� 1~12���� �� ���ϱ� 
			System.out.printf(" %d�� =>", k43_i);//k43_i �� ����ϱ�
			LOOP: for (int k43_j = 1; k43_j < 32; k43_j++) {//k43_j�� 1~31���� �� ���ϱ�
				System.out.printf("%d,", k43_j);//k43_j ����ϱ�

				switch (k43_i) {//k43_i���� k43_j�� �Ѱ������ϱ�
				case 4://k43_i�� 4�� �̶��
				case 6://k43_i�� 6�� �̶��
				case 9://k43_i�� 9�� �̶��
				case 11://k43_i�� 11�� �̶��
					if (k43_j == 30)//k43_j �� 30�̶��
						break LOOP;//������ LOOP�� �̵�(k43_j �ݺ�������)
					break;//�ݸ�� ����������
				case 2://k43_i�� 2�� �̶��
					if (k43_j == 28)//k43_j �� 28�̶��
						break LOOP;//������ LOOP�� �̵�(k43_j �ݺ�������)
					break;//�ݸ�� ����������
				}
			}
			System.out.println();//�ٹٲ�
		}
	}

}
