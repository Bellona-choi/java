
public class A2 {

	public static void main(String[] args) {
		int k43_sum;//k43_sum ������ �Լ� ����
		k43_sum = 0;//k43_sum ���� �Լ� �ʱ�ȭ �ϱ�
		for (int k43_i= 0; k43_i < 101; k43_i++) {// for���� ����Ͽ� 0~100���� ������
			k43_sum = k43_sum + k43_i; // 1~100������ k43_i ���� ��� ���ؼ� k43_sum�� �ֱ�
		}
		System.out.printf("#2-1 : %d\n" , k43_sum);// 0~100���� ���� ���� k43_sum ����ϱ�

		System.out.printf("#2-2 : %d\n" , k43_sum / 100);// k43_sum�� 100���� ������ ��ձ��ϱ�

		int[] k43_v = { 1, 2, 3, 4, 5 };//k43_v�迭 ����
		int k43_vSum;//k43_vSum �Լ� ����
		k43_vSum = 0;//k43_vSum �Լ����� �ʱ�ȭ�ϱ� 

		for (int k43_i = 4; k43_i >= 0; k43_i--) {//for������ �迭 ������
			k43_vSum += k43_v[k43_i];//k43_i���� k43_vSum�� �����ֱ�
		}
		System.out.printf("#2-3 : %d\n" , k43_vSum);//k43_vSum�� ������ֱ�
	}
}
