
public class P2 {

	public static int k43_netprice(int k43_price, double k43_rate) {//Ŭ���� �����
		return (int) (k43_price / (1 + k43_rate));//Ŭ������ �����ϱ�
	}

	public static void main(String[] args) {
		int k43_price = 1234;//���� ����(��ǰ����)
		double k43_tax_rate = 0.1;// �������� (����10%)

		int k43_netprice = k43_netprice(k43_price, k43_tax_rate);//�������� �Լ�ȣ��
		int k43_tax = k43_price - k43_netprice;//���� ��������

		System.out.printf("***************************************\n");
		System.out.printf("*      �Һ��ڰ�, ��������, ���� ���          *\n");
		System.out.printf(" �Һ��ڰ���: %d, ��������: %d, ����: %d\n", k43_price, k43_netprice, k43_tax);//�Һ��ڰ���, ��������, ���� ���
		System.out.printf("***************************************\n");
		
		
	}

}
