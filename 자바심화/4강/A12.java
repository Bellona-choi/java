package java4;

public class A12 {

	public static void main(String[] args) {
		// 2030200000 20000000 1001034567
		int k43_iNumVal = 2000012123;// k43_iNumVal�� ������ 1001034567 ����
		String k43_sNumVal = String.valueOf(k43_iNumVal);// k43_iNumVal(int)�� k43_sNumVal(str)�� ���� �� ����
		String k43_sNumVoice = "";// str�� �ϳ��� �ɰ��ֱ�
		System.out.printf("==> %s [%d�ڸ�]\n", k43_sNumVal, k43_sNumVal.length());// k43_sNumVal�� k43_sNumVal�� ���̸� ����ϱ�

		int k43_i, k43_j;// k43_i, k43_j ���� �����ϱ�

		String[] k43_units = { "��", "��", "��", "��", "��", "��", "��", "ĥ", "��", "��" };// k43_units�� ���� �Է� �� �����ϱ�
		String[] k43_unitx = { "", "��", "��", "õ", "��", "��", "��", "õ", "��", "��" };// k43_unitx�� ���� �Է� �� �����ϱ�

		k43_i = 0;// k43_i�� �ʱ�ȭ�ϱ�
		k43_j = k43_sNumVal.length() - 1;// k43_j�� k43_sNumVal�� ���ǿ� 1�� ���ֱ�

		while (true) {// while�ݺ��� ����
			if (k43_i >= k43_sNumVal.length())// ���� k43_i�� ���� k43_sNumVal�� ���̺��� ũ�ų� ������
				break;// while �ݺ��� ����

			System.out.printf("%s[%s]", k43_sNumVal.substring(k43_i, k43_i + 1),
					k43_units[Integer.parseInt(k43_sNumVal.substring(k43_i, k43_i + 1))]);// ���ڵ��� k43_units���·� ����ϱ�
			if (k43_sNumVal.substring(k43_i, k43_i + 1).equals("0")) {// k43_sNumVal.substring(k43_i, k43_i + 1)�� 0�̶��
				if (k43_unitx[k43_j].equals("��") || k43_unitx[k43_j].equals("��")) {// k43_unitx[k43_j] �� �� �̶��
					k43_sNumVoice = k43_sNumVoice + "" + k43_unitx[k43_j];// k43_sNumVoice = ���� + �����б� ����
					if (k43_sNumVal.substring(k43_sNumVal.length() - 8, k43_sNumVal.length() - 4).equals("0000")) {// ���� �ڿ��� 5��°�ڸ�(���ڸ�)�� 0�̶��
						k43_sNumVoice = k43_sNumVoice.replace("��", "");// �� �� ��ĭ���� ��ü
					}
				}
			} else {
				k43_sNumVoice = k43_sNumVoice + k43_units[Integer.parseInt(k43_sNumVal.substring(k43_i, k43_i + 1))]
						+ k43_unitx[k43_j];// 0�� �ƴҶ� �ε����� �߰��Ѵ�
			}
			k43_i++;// ���ڸ� �ڷ� �ѱ��
			k43_j--;// �ε����� ������ �ѱ��
		}
		System.out.printf("\n %s[%s]\n", k43_sNumVal, k43_sNumVoice);// ���ڶ� �����б⸦ ����Ѵ�

	}
}