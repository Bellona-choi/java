
public class P3 {

	public static void main(String[] args) {
		String[] k43_item = { "�޷γ� ", "�������", "������ ", "������ ", "���� " };//���̽�ũ���� ���� ����
		int[] k43_price = { 10000, 1500, 2000, 1300, 1250 };//���̽�ũ�� �� ���� ����
		int[] k43_amount = { 10, 30, 5, 1, 4 };//���̽�ũ�� ��� ���� ����
		double k43_tax_rate = 0.1;//�ΰ���ġ��
		int k43_total_sum = 0;//�� �ݾ�

		System.out.println("**************************************");
		System.out.println("              �� ���̽�ũ��            ");
		System.out.println(" �׸�         �ܰ�         ����        ��  ");
		for (int k43_i = 0; k43_i < k43_item.length; k43_i++) {//for������ ���̽�ũ�� ������ ���
			int k43_sum = k43_price[k43_i] * k43_amount[k43_i];//k43_sum�� ���̽�ũ�� ������ ����X����
			k43_total_sum = k43_total_sum + k43_sum;//k43_total_sum + k43_sum �հ豸�ϱ�
			//�迭�� ������� ����� �ֱ�
			System.out.printf("%.5s \t%7d \t%3d%10d\n", k43_item[k43_i], k43_price[k43_i], k43_amount[k43_i],	k43_sum);

		}
		System.out.println("*************************************");
		System.out.printf("���� �ݾ� : %27d\n", k43_total_sum);// ���ұݾ� ���

		int k43_total_net_price = (int) (k43_total_sum / (1 + k43_tax_rate));//�����ݾ� ��� (�� �ݾ׿� / (1+�ΰ���ġ��))
		System.out.printf("�����ݾ� :%29d\n", k43_total_net_price);//�����ݾ� ���
		int k43_tax = k43_total_sum - k43_total_net_price;//���� ��� (�� �ݾ� - �����ݾ�)
		System.out.printf("���� :%32d\n", k43_tax);//���� ���
	}

}
