package java4;

public class A2 {

	public static void main(String[] args) {
		String k43_jumin = "123456-4234567";//k43_jumin �����

		switch (k43_jumin.charAt(7)) {//k43_jumin�� �ִ� 8��° ����(0���� �����ؼ�)
		case '1'://k43_jumin�� �ִ� 7��° ���ڰ� 1�̸�
			System.out.println("20������ �¾ ���� ���");//20������ �¾ ���� ��� ���
			break;//������ �´ٸ� switch�� ������
		case '2'://k43_jumin�� �ִ� 7��° ���ڰ� 2�̸�
			System.out.println("20������ �¾ ���� ���");//20������ �¾ ���� ��� ���
			break;//������ �´ٸ� switch�� ������
		case '3'://k43_jumin�� �ִ� 7��° ���ڰ� 3�̸�
			System.out.println("20������ �¾ ���� ���");//20������ �¾ ���� ��� ���
			break;//������ �´ٸ� switch�� ������
		case '4'://k43_jumin�� �ִ� 7��° ���ڰ� 4�̸�
			System.out.println("20������ �¾ ���� ���");//20������ �¾ ���� ��� ���
			break;//������ �´ٸ� switch�� ������
		default:
			System.out.println("���");//���� ������ �ƴ϶�� ������
			break;//������ �´ٸ� switch�� ������
		}
	}

}
