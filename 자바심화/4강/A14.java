package java4;

public class A14 {

	public static void main(String[] args) {
		double k43_fSin;// k43_fSin���� ����
		for (int k43_i = 0; k43_i < 360; k43_i++) {// 0~359���� �ݺ��� ���� 1�� �߰��ϱ�
			k43_fSin = Math.sin(k43_i * 3.141592 / 180);// k43_fSin�� k43_i*3.141592/180 �� �����ϱ�(1���� =180/����)
			System.out.printf("%d sin ==>%f\n", k43_i, k43_fSin);// k43_i + sin + k43_fSin�� ����ϱ�
		}

		for (int k43_i = 0; k43_i < 360; k43_i++) {// 0~359���� �ݺ��� ���� 1�� �߰��ϱ�
			k43_fSin = Math.sin(k43_i * 3.141592 / 180);// k43_fSin�� k43_i*3.141592/180 �� �����ϱ�(1���� =180/����
			int k43_iSpace = (int) ((1.0 - k43_fSin) * 50);//k43_iSpace���� ����, sin �Լ���-1~1�������´� �̸� ���ȭ �ϰ� 50�� ���Ͽ� ���� 0~100������ ���� �����Ѵ� 
			for (int k43_j = 0; k43_j < k43_iSpace; k43_j++) {//360������ �׸���
				System.out.printf(" ");//��ĭ ����ϱ�
			}
			System.out.printf("*[%f][%d]\n", k43_fSin, k43_iSpace);//k43_fSin,k43_iSpace�� ����ϱ�
		}

	}

}
