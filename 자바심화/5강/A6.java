package java5;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class A6 {
	static Calendar k43_calt = Calendar.getInstance();
	static SimpleDateFormat k43_sdt = new SimpleDateFormat("YYYY-MM-dd HH:mm");
	static SimpleDateFormat k43_sdt1 = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
	static DecimalFormat k43_df = new DecimalFormat("###,###,###,###");
	static String[] k43_itemname = { "����Ȩ SAFE365 �ڵ�ũ��", "(G)LH��������ȭ�� 100cm", "��������E", "���� ���Ϸ� �� �ѷ�", "���Ƿ� SAFE �ٵ����",
			"��� �Ŷ��120g*5", "(��)������������", "���ѱ� ����� 156g*4", "GAP ������ 4-6��", "�� ����� �ٳ���(��)", "��ɻ�ټ�2L",
			"(����)����߰���(g)", "DZ�ִϾ�縻3��C_BK", "DZ�ִϾ�縻3��D_WH", "�����̾��������ʹ�", "����ũ ����̿���500g", "���� ���ִ¿���GT ������",
			"���������÷�10��", "��������(��)65*6", "�ɶ�ý� ���� Ʈ��Ʈ��Ʈ", "Ǫ���� �̼��������", "���Ϸν���������500g", "CJ ����Ĩ 20G", "����ũ ����̿���500",
			"����� ���� ��ũƼ", "1+ ��޶� 10���� Ư", "��ɻ�ټ�500M", "�츮����ֽ�1.4", "��������̳���10", "�����ݽ�10KG","�ɶ�ý� ���� Ʈ��Ʈ" };// ���� ���� ���� �Է�
	static int[] k43_price = { 1000000, 6900, 5980, 3300, 5500, 3360, 6610, 2750, 10800, 4980, 800, 7920, 4980, 4980, 7130,
			3980, 4480, 4980, 3210, 6950, 2980, 1990, 1980, 3980, 4480, 9480, 310, 2950, 4350, 100000, 6950 };// ������ ���� �Է�
	static int[] k43_num = { 1, 2, 2, 5, 8, 1, 9, 8, 5, 6, 1, 2, 8, 6, 3, 8, 5, 1, 8, 4, 6, 7, 2, 5, 4, 9, 8, 5, 7, 1,1 };// ������
																														// ����
																														// �Է�
	static boolean[] k43_taxfree = { true, false, false, false, false, false, true, false, true, true, false, false,
			false, false, false, false, true, false, false, false, false, false, false, false, false, true, false,
			false, false, true, false };// ������ �鼼 �Է�

	static int k43_tatal = 0;// ������ �� �ݾ�
	static int k43_bl_tatal = 0;// �鼼 ������ �� �ݾ�
	static int k43_total_rate;// �� �ΰ��� �Լ�
	static int k43_blool_price;// �鼼�� �� �ݾ�
	public static void main(String[] args) {
		
		k43_TitlePrint();//������ ���� Ÿ��Ʋ�� �ҷ��´�
		
		k43_TimeStemp();//������ ��½ð��� �ҷ��´�
		
		k43_HeaderPrint();//���(��ǰ��,�ܰ�,����,�μ�)�� �ҷ��´�
		
		k43_Total_Print();//�հ� ���� ���� �ҷ��´�
	}

	public static void k43_TitlePrint() {// ������ ���� Ÿ��Ʋ
		System.out.printf("%34s\n", "�̸�Ʈ ������ (031)888-1234");
		System.out.printf("%10s%19s\n","emart", "206-86-50913 ����");
		System.out.printf("%28s\n", "���� ������ ������� 552");
		System.out.printf("\n");
	}

	public static void k43_TimeStemp() {// ��½ð� �μ�
		System.out.printf("%s\n", "������ �������� ��ȯ/ȯ�� �Ұ�");
		System.out.printf("%s\n", "�����ǰ�� ����, 30�� �̳�(�ż� 7��)");
		System.out.printf("%s\n", "�Ϻ� �귣����� ����(���� ����������)");
		System.out.printf("%s\n", "��ȯ/ȯ�� ���������� ����(����ī�� ����)");
		System.out.printf("\n");
		System.out.printf("%s%s%18s\n", "[�� ��]", k43_sdt.format(k43_calt.getTime()), "POS:0011-9861");// ���Žð� ���
		System.out.printf("%s\n", "-----------------------------------------");
	}

	public static void k43_HeaderPrint() {// ���(��ǰ��,�ܰ�,����,�μ�)

		System.out.printf("%7s%17s%3s%5s\n", "�� ǰ ��", "�� ��", "����", "�� ��");//��ǰ��, �ܰ�, ����, �ݾ� ���
		for (int k43_i = 0; k43_i < k43_itemname.length; k43_i++) {// ���� ������ ������ŭ for�� ������
			
			if (k43_i % 5 == 0) {// 5�پ� ��µ� ������
				System.out.printf("%s\n", "-----------------------------------------");// ����ϱ�
			}
			if (k43_taxfree[k43_i] == true) {// ���� �鼼�� �̸�
				System.out.printf("* ");// �տ� *���
				k43_bl_tatal += k43_price[k43_i] * k43_num[k43_i];// �鼼 ������ �Ѱ��� ���ϱ�
				k43_blool_price += k43_price[k43_i] * k43_num[k43_i];//�鼼���� �ֱ�
			} else {// �鼼 ������ �ƴϸ�
				System.out.printf("  ");// �տ� ��ĭ ����ֱ�
			}
			
			k43_tatal += k43_price[k43_i] * k43_num[k43_i];// ������ �� �ݾ� ���ϱ�

			System.out.printf("%s%10s%2s%10s\n", k43_subByte(k43_itemname[k43_i], 17),
					k43_df.format(k43_price[k43_i]), k43_num[k43_i], k43_df.format(k43_price[k43_i] * k43_num[k43_i]));//

		}
		
		 
		k43_total_rate = k43_tatal-k43_blool_price;//�鼼���� ������ ���� ���� �����
		if (((double) k43_total_rate / 11) == k43_total_rate / 11) {// �ѱݾ� �ΰ��� ���ϱ�
			k43_total_rate = (k43_total_rate / 11);// 11�� ���������� �Ҽ����� ������ �״��
		} else {
			k43_total_rate = (k43_total_rate / 11) + 1;// 11�� ���������� �Ҽ����� ������+1
		}
	}

	public static void k43_Total_Print() {//�հ� ���׵��� �μ�
		int k43_point=5473;//���� ������ ����Ʈ
		int k43_new_point = k43_tatal/1000;//���ο� ����Ʈ(����/1000)
		int k43_tatal_point=k43_point+k43_new_point;
		System.out.printf("\n");
		System.out.printf("%22s%14s\n", "�� ǰ�� ����", k43_itemname.length);
		System.out.printf("%23s%14s\n", "(*)�� ��  �� ǰ", k43_df.format(k43_bl_tatal));
		System.out.printf("%23s%14s\n", "�� ��  �� ǰ", k43_df.format(k43_tatal - k43_total_rate - k43_bl_tatal));
		System.out.printf("%24s%14s\n", "��   ��   ��", k43_df.format(k43_total_rate));
		System.out.printf("%25s%14s\n", "��        ��", k43_df.format(k43_tatal));
		System.out.printf("%s%24s\n", "�� �� �� �� �� ��", k43_df.format(k43_tatal));
		System.out.printf("%s\n", "-----------------------------------------");
		System.out.printf("%s%28s\n", "0012 KEB �ϳ�", "541707**0484/35860658");
		System.out.printf("%s%16.18s%10.50s\n", "ī�����(IC)", "�Ͻú� / ",k43_df.format(k43_tatal));
		System.out.printf("%s\n", "-----------------------------------------");
		System.out.printf("%23s\n", "[�ż�������Ʈ ����]");
		System.out.printf("%s\n", "ȫ*�� ������ ����Ʈ ��Ȳ�Դϴ�.");
		System.out.printf("%s%20s%7.20s\n", "��ȸ�߻�����Ʈ", "9350**9995", k43_df.format(k43_new_point));
		System.out.printf("%s%18s%s%5s%s\n", "����(����)����Ʈ", k43_df.format(k43_tatal_point),"(",k43_df.format(k43_point),")");
		System.out.printf("%s\n", "*�ż�������Ʈ ��ȿ�Ⱓ�� 2���Դϴ�.");
		System.out.printf("%s\n", "-----------------------------------------");
		System.out.printf("%23s\n", "���űݾױ��� ���������ð� �ڵ��ο�");
		System.out.printf("%s%30s\n", "������ȣ :", "34��****");
		System.out.printf("%s%31s\n", "�����ð� :", k43_sdt1.format(k43_calt.getTime()));
		System.out.printf("%s\n", "-----------------------------------------");
		System.out.printf("%s%25s\n", "ĳ��:084599 ��00", "1150");
		System.out.printf("%33s\n","llllllllllllllllllllll");
		System.out.printf("%33s\n","llllllllllllllllllllll");
		System.out.printf("%33s\n","llllllllllllllllllllll");
		System.out.printf("%37s\n", "20220419/00119861/00164980/31");
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
