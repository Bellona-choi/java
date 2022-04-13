import java.text.SimpleDateFormat;
import java.util.Date;

public class P1 {

	public static void main(String[] args) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		Date time = new Date();
		String dataAndTime = format.format(time);
		
		System.out.println(dataAndTime);
		System.out.println("start");
		
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		time = new Date();
		dataAndTime = format.format(time);
		System.out.println(dataAndTime);
		System.out.println("end");
	}

}
