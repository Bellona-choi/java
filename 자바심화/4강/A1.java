package java4;

import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
		Scanner k43_sc = new Scanner(System.in);// scnnerŬ���� k43_sc ��ü����
		System.out.println("������ �Է��ϼ���.");// ������ �Է��ϼ��� ���
		int k43_score = k43_sc.nextInt();// ���ϴ� ������ �Է� �޴´�

		if (k43_score >= 60) {// �Է��� ������ 60�� �̻��̸�
			System.out.println("�հ��Դϴ�.");// �հ��Դϴ� ���
		} else {// �Է��� ������ 60�� �̸��̸�
			System.out.println("���հ��Դϴ�.");// ���հ� �Դϴ�.
		}

		if (k43_score >= 90) {// �Է��� ������ 90�̻��̸�
			System.out.println("����� :A��� �Դϴ�");// A��� �Դϴ� ���
		} else if (k43_score >= 80) {// �Է��� ������ 80�̻� 90�̸��̸�
			System.out.println("����� :B��� �Դϴ�");// B��� �Դϴ� ���
		} else if (k43_score >= 70) {// �Է��� ������ 70�̻� 80�̸��̸�
			System.out.println("����� :C��� �Դϴ�");// C��� �Դϴ� ���
		} else {// �Է��� ������ 70�̸��̸�
			System.out.println("����� :D��� �Դϴ�");// D��� �Դϴ� ���
		}
		System.out.println("���ڸ� �Է��ϼ���.");// ���ڸ� �Է��ϼ��� ���
		int k43_num = k43_sc.nextInt();// ���ϴ� ���ڸ� �Է� �޴´�
		if (k43_num > 0) {// �Է��� ���ڰ� 0���� ũ��
			System.out.println("����Դϴ�.");// ����Դϴ�. ���
		} else if (k43_num < 0) {// �Է��� ���ڰ� 0���� ������
			System.out.println("�����Դϴ�");// �����Դϴ�. ���
		} else {// �Է��� ���ڰ� 0�̸�
			System.out.println("0�Դϴ�");// 0�Դϴ� ���
		}
	}

}
