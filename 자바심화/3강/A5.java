
public class A5 {

	public static void main(String[] args) {
		int k43_MyVal = 14 / 5; //k43_MyVal �Լ� ���� �� �� �ֱ�, �Ҽ��� ���ϴ� ��������
		System.out.println("#5-1 : " + k43_MyVal);//k43_MyVal ����ϱ�

		double k43_MyValF;//k43_MyValF �Լ� ����

		k43_MyValF = 14 / 5;//k43_MyValF�� 14/5 ���� �Ҽ��� ����
		System.out.println("#5-2 : " + k43_MyValF);//k43_MyValF ����ϱ�

		k43_MyValF = 14.0 / 5;//k43_MyValF��14.0/5 ���� �Ѱ��� �Ǽ� ���¾�� �Ǽ����·� ���´�
		System.out.println("#5-3 : " + k43_MyValF);//k43_MyValF ����ϱ�

		k43_MyValF = (14.0) / 5 + 0.5;// �����Ⱑ ���� �ϱ� ������ 2.8+0.5�� �ȴ�
		System.out.println("#5-4 : " + k43_MyValF);//k43_MyValF ����ϱ�

		k43_MyValF = (int) ((14.0) / 5 + 0.5); //�Ǽ������� ����� �ϰ� ���������� �ٲ��ش�(�̋� �Ҽ����� ��������)
		System.out.println("#5-5 : " + k43_MyValF);//k43_MyValF ����ϱ�
	}

}
