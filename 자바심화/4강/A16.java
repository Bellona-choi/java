package java4;

import java.text.DecimalFormat;

public class A16 {

	public static void main(String[] args) {
		String k43_item = "���";// k43_item�� ���� ����
		int k43_unit_price = 5000;// k43_unit_price�� ���� ����
		int k43_num = 500;// k43_num�� ���� ����
		int k43_total = 0;// k43_total�� ���� ����

		DecimalFormat k43_df = new DecimalFormat("###,###,###,###");

		System.out.printf("====================================================\n");
		System.out.printf("%20.20s%9.8s%10.8s%9.8s\n", "ǰ��", "�ܰ�", "����", "�հ�");// %20(20ĭ ����) .20s(��byte�� ũ��)
																				// ǰ��,�ܰ�,����,�հ� ���
		System.out.printf("====================================================\n");

		System.out.printf("%20.20s%10.10s%10.10s%10.10S\n", k43_item, k43_df.format(k43_unit_price),
				k43_df.format(k43_num), k43_df.format(k43_unit_price * k43_num));// k43_item,k43_unit_price,k43_num,k43_total
																					// �� ���

	}

}
