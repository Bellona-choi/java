
public class A3 {

	public static void main(String[] args) {
		int k43_ii = 1000 / 3; //k43_ii �Լ����� �� �� �־��ֱ�
		System.out.printf("#3-1 : %d\n",  k43_ii);//k43_ii ����ϱ�
		k43_ii = 1000 % 3; //k43_ii �� �־��ֱ�,������ ����Ҷ�
		System.out.printf("#3-2 : %d\n" , k43_ii);//k43_ii ����ϱ�

		for (int k43_i = 0; k43_i < 20; k43_i++) {//for������ 0~19���� �Լ� ������
			System.out.printf("#3-3 : %d  " , k43_i);//k43_i ����ϱ�
			if (((k43_i + 1) % 5) == 0) {//k43_i + 1 �� 5�� ��������  ���Ҷ� �������� 0�̸�
				System.out.printf("\n");//�Ʒ��� ��ĭ ����ֱ�
			}
		}
	}
}
