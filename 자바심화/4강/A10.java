package java4;

public class A10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] k43_iLMD = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };// k43_iLMD�� ���� �迭 ����

		for (int k43_i = 1; k43_i < 13; k43_i++) {// k43_i�� 1���� 12���� 1�� �߰��ϱ�
			System.out.printf(" %d�� =>", k43_i);// k43_i �� ����ϱ�
			for (int k43_j = 1; k43_j < 32; k43_j++) {// k43_j�� 1���� 32���� 1�� �߰��ϱ�
				System.out.printf("%d", k43_j);// k43_j ����ϱ�

				if (k43_iLMD[k43_i - 1] == k43_j)// ���� k43_iLMD[k43_i-1]�� k43_j���(k43_i - 1�� k43_iLMD�� 0���� �����ؼ� �̴�.)
					break;// for�� ����������
				System.out.printf(",");// , �߰��ϱ�
			}
			System.out.println();// �ٹٲ�
		}

	}

}
