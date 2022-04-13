public class P5 extends Thread {

	public static void main(String[] args) throws InterruptedException {
		int[] numbers = { 5, 10, 1 };
		try {
			System.out.println(numbers[3]);
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("NullPointer Exception");
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("ArrayIndexOutOfBounds Exception");
		} catch (Exception e) {
			System.out.println("exception");
			e.printStackTrace();
		} finally {
			System.out.println("finally");
		}
	}

}
