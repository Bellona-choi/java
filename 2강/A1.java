package choi;

public class A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int y = 0;
		for (i = 1; i < 10; i++) {
			if (i <= 1) {
				i++;
			}
			for (int j = 1; j < 10; j++) {
				y = j * i;
				System.out.println(i + "X" + j + "=" + y);
			}
		}
	}

}
