package java4;

public class A5 {

	public static void main(String[] args) {
		int k43_il;//k43_il�� int�� �Լ�����
		double k43_iD;//k43_iD�� double�� �Լ�����
		k43_il = 10 / 3;//k43_il���� 10/3���� �־��ֱ�
		k43_iD = 10 / 3.0;//k43_iD���� 10/3.0���� �־��ֱ�

		if (k43_il == k43_iD) {//���� k43_il�� k43_iD�� ���ٸ�
			System.out.printf("equal\n");//equal ���
		} else {//k43_il�� k43_iD�� ���� �ʴٸ�
			System.out.printf("Not equal[%f][%f]\n", (double) k43_il, k43_iD);//Not equal�� double������ k43_il, k43_iD ���
		}

		if (k43_iD == 3.333333) {//k43_iD �� 3.333333 �̶��
			System.out.printf("equal\n");//equal ���
		} else {//k43_iD �� 3.333333�� �ƴ϶��
			System.out.printf("Not equal[3.333333][%f]\n", k43_iD);//Not equal�� k43_iD ���
		}

		k43_iD = (int) k43_iD;//double �� k43_iD�� int�� �ٲٱ�
		if (k43_il == k43_iD) {//���� k43_il�� k43_iD�� ���ٸ�
			System.out.printf("equal\n");//equal ���
		} else {//k43_il�� k43_iD�� ���� �ʴٸ�
			System.out.printf("Not equal[%f][%f]\n", (double) k43_il, k43_iD);//Not equal�� double������ k43_il, k43_iD ���
		}
		System.out.printf("int�� �μ�[%d][%f]\n", k43_il, k43_iD);// k43_il, k43_iD ���� ��Ƽ�� ���·� ���
		System.out.printf("double�� �μ�[%f][%f]\n", (double) k43_il, k43_iD);// k43_il, k43_iD ���� ���� ���·� ���

		char k43_a = 'c';//k43_a�̶� ������ c�� ����
		if (k43_a == 'b') {//k43_a�̶� ������ b���
			System.out.printf("a�� b�̴�\n");//a�� b�̴� ���
		}
		if (k43_a == 'c') {//k43_a�̶� ������ c���
			System.out.printf("a�� c�̴�\n");//a�� c�̴� ���
		}
		if (k43_a == 'd') {//k43_a�̶� ������ d���
			System.out.printf("a�� d�̴�\n");//a�� d�̴� ���
		}
		String k43_aa = "abcd";//k43_aa�̶� ������ abcd �� ����
		if (k43_aa.equals("abcd")) {//k43_aa�̶� ������ abcd�� ���ٸ�
			System.out.printf("k43_aa�� abcd�̴�\n");//k43_aa�� abcd�̴� ���
		} else {////k43_aa�̶� ������ abcd�� �ٸ��ٸ�
			System.out.printf("k43_aa�� abcd�� �ƴϴ�\n");//k43_aa�� abcd�� �ƴϴ� ���
		}
		boolean k43_bb = true;//k43_bb�̶� ������ boolean���� ���� �� true(��)�̶�� ����

		if (!!k43_bb) {//k43_bb�� ���ٸ�
			System.out.printf("bb�� �ƴϰ� �ƴϸ� ���̴�\n");//bb�� �ƴϰ� �ƴϸ� ���̴� ���
		} else {//k43_bb�� �ٸ��ٸ� 
			System.out.println("bb�� �ƴϰ� �ƴϸ� �����̴�\n");//bb�� �ƴϰ� �ƴϸ� �����̴� ���
		}
	}

}
