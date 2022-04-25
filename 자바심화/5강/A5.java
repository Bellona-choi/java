package java5;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class A5 {

	public static void main(String[] args) {
		Calendar k43_calt = Calendar.getInstance();
		SimpleDateFormat k43_sdt = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss");// �ð��� ����Ҽ� �ִ� �Լ� ����
		DecimalFormat k43_df = new DecimalFormat("###,###,###,###");// �ݾ׿� ,�� �߰��Ҽ� �ִ� �Լ� ����
		String k43_itemname1 = "ǻ��� ������ܿ븶��ũ(�ְ����)";// 1�� ������ �̸�
		String k43_itemcode1 = "1031615";// 1�� ���� �ڵ�
		int k43_price1 = 3000;// 1�� ������ ����
		int k43_amount1 = 1;// 1�� ������ ���� ����

		String k43_itemname2 = "�����̵�ø���(������)(100ȣ)";// 2�� ������ �̸�
		String k43_itemcode2 = "11008152";// 2�� ���� �ڵ�
		int k43_price2 = 1000;// 2�� ������ ����
		int k43_amount2 = 1;// 2�� ������ ���� ����

		String k43_itemname3 = "�������� ���׸�����ũ(�˷�̴�Ÿ��)";// 3�� ������ �̸�
		String k43_itemcode3 = "1020800";// 3�� ���� �ڵ�
		int k43_price3 = 1000;// 3�� ������ ����
		int k43_amount3 = 1;// 3�� ������ ���� ����

		int k43_total = (k43_price1 * k43_amount1) + (k43_price2 * k43_amount2) + (k43_price3 * k43_amount3);// �� ������ ��
																												// �ݾ�
		int k43_total_rate;// ������ ���� �Լ�
		if (((double) k43_total / 11) == k43_total / 11) {// ���� �� �ݾ��� 11�� ������ �Ҽ����� ������
			k43_total_rate = (k43_total / 11);// �ΰ����� �ֱ�
		} else {// ���� ������
			k43_total_rate = (k43_total / 11) + 1;// �ΰ����� �����ݾ׿� +1
		}
		int k43_tatal_netprice = k43_total - k43_total_rate;// �����ռα��ϱ� �� �ݾ� - �ΰ���
		System.out.printf("%26s\n", "\"���ΰ���, ���̼�\"");
		System.out.printf("%s\n", "(��)�Ƽ����̼�_�д缭����");
		System.out.printf("%s\n", "��ȭ:031-702-6016");
		System.out.printf("%s\n", "����:���� ������ ���μ�ȯ�� 2748 (���)");
		System.out.printf("��ǥ:������,��ȣ�� 213-81-52063\n");
		System.out.printf("%20.29s\n", "����:��⵵ ������ �д籸 �д��53���� 11 (����");
		System.out.printf("%s\n", "��)");
		System.out.printf("=================================================\n");
		System.out.printf("%28s\n", "�Һ����߽ɰ濵(CCM) �������");
		System.out.printf("%30s\n", "ISO 9001 ǰ���濵�ý��� �������");
		System.out.printf("=================================================\n");
		System.out.printf("%28s\n", "��ȯ/ȯ�� 14��(5��2��)�̳�,");
		System.out.printf("%s\n", "(����)������, ����ī�� ���� �� ���Ը��忡�� ����");
		System.out.printf("%27s\n", "����/���� �� �Ѽս� ��ȯ/ȯ�� �Ұ�");
		System.out.printf("%27s\n", "üũī�� ��� �� �ִ� 7�� �ҿ�");
		System.out.printf("=================================================\n");
		System.out.printf("%s%36s\n", "[POS 1058231]", k43_sdt.format(k43_calt.getTime()));
		System.out.printf("=================================================\n");
		System.out.printf("%.14s%8s%5s%10s\n", k43_subByte(k43_itemname1,26), k43_df.format(k43_price1), k43_df.format(k43_amount1),
				k43_df.format(k43_price1 * k43_amount1));// 1�� ������ �̸�, �ݾ�, ����, �ݾ�*���� ���
		System.out.printf("[%s]\n", k43_itemcode1);// 1�������� �ڵ� ���
		System.out.printf("%.14s%10s%5s%10s\n",k43_subByte(k43_itemname2,26), k43_df.format(k43_price2), k43_df.format(k43_amount2),
				k43_df.format(k43_price2 * k43_amount2));// 2�� ������ �̸�, �ݾ�, ����, �ݾ�*���� ���
		System.out.printf("[%s]\n", k43_itemcode2);// 2�������� �ڵ� ���
		System.out.printf("%5.14s%8s%5s%10s\n", k43_subByte(k43_itemname3,26), k43_df.format(k43_price3), k43_df.format(k43_amount3),
				k43_df.format(k43_price3 * k43_amount3));// 3�� ������ �̸�, �ݾ�, ����, �ݾ�*���� ���
		System.out.printf("[%s]\n", k43_itemcode3);// 3�������� �ڵ� ���

		System.out.printf("%17.20s%28s\n", "�����հ�", k43_df.format(k43_tatal_netprice));// ���� �����հ� ���
		System.out.printf("%18.20s%28s\n", "�ΰ���", k43_df.format(k43_total_rate));// ���� �ΰ��� ���
		System.out.printf("-------------------------------------------------\n");
		System.out.printf("%s%41s\n", "�Ǹ��հ�", k43_df.format(k43_total));// �Ǹ��հ�,�� �ݾ� ���
		System.out.printf("=================================================\n");
		System.out.printf("%s%41s\n", "�ſ�ī��", k43_df.format(k43_total));// �ſ�ī��,�� �ݾ� ���
		System.out.printf("-------------------------------------------------\n");
		System.out.printf("%s%41s\n", "�츮ī��", " 538720**********");
		System.out.printf("%s%17s%8s\n", "���ι�ȣ 77982843(0)", "���αݾ�", k43_df.format(k43_total));// �� �ݾ� ���
		System.out.printf("=================================================\n");
		System.out.printf("%28.20s%6s\n", k43_sdt.format(k43_calt.getTime()), "�д缭����");// ������ �ð� ���
		System.out.printf("%s\n", "��ǰ �� ��Ÿ ���� : 1522-4400");
		System.out.printf("%s\n", "����� �� ����̼� ���� ���� : 1599-2211");
		System.out.printf("%30.20s", "2112820610158231\n");
		System.out.printf("-------------------------------------------------\n");
		System.out.printf("%23s\n", "�� ���̼� ����� �� �Ǵ� Ȩ�������� �����ϼż�");
		System.out.printf("%25s", "ȸ������ �� �پ��� ������ ����������! ��");
	}
	public static String k43_subByte(String k43_source, int k43_cut) {//
		if (!k43_source.isEmpty()) {// ���ڿ��� ������� �ʴٸ�
			k43_source = k43_source.trim();// �������
			if (k43_source.getBytes().length <= k43_cut) {// �ڸ��� ������ ���ڿ��� ������
				for (int k43_i = k43_cut - k43_source.getBytes().length; k43_i > 0; k43_i--) {//������ ���� 0���� Ŭ�� �ϳ��� ���ְ�
					k43_source += " ";// ��ĭ�߰�
				}
				return k43_source;//k43_source�� �ޱ�
			} else {// ���ڿ��� ũ��
				StringBuffer k43_sb = new StringBuffer(k43_cut);
				int k43_cnt = 0;// ����0���� �ʱ�ȭ
				for (char k43_ch : k43_source.toCharArray()) {// ���������� �̵�
					k43_cnt += String.valueOf(k43_ch).getBytes().length;// ���� ���ڸ�ŭ �߰�
					if (k43_cnt > k43_cut) {//������ �ڸ� ���ں��� ũ��
						break;//for�� ������
					}
					k43_sb.append(k43_ch);//���ڿ��� �ڸ���ŭ �߰��ϱ�
				}
				if (k43_sb.toString().getBytes().length == k43_cut - 1) {//���� ���ڿ� ���̰� �ڸ�����-1�� ������
					k43_sb.append(" ");//��ĭ �߰��ϱ�
				}
				return k43_sb.toString();
			}
		} else {
			return "";
		}
	}

}
