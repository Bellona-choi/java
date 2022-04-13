import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String f_Time = TimeFormat();

		System.out.println(f_Time);

		int f_Second = timeSecond(f_Time);
		while (true) {
			System.out.println("input second");
			int over_Time = sc.nextInt();

			int overTime = f_Second + over_Time;

			String s_Time = TimeFormat();

			int s_Second = timeSecond(s_Time);

			timerSetting(overTime, s_Second);

			String reset = TimeFormat();

			f_Second = timeSecond(reset);
		}
	}

	public static int timeSecond(String Time) {
		String[] timeArray = Time.split(" : ");
		int[] hourMinSec = { 3600, 60, 1 };
		int total = 0;

		for (int i = 0; i < timeArray.length; i++) {
			total += Integer.parseInt(timeArray[i]) * hourMinSec[i];
		}
		return total;
	}

	public static String TimeFormat() {
		SimpleDateFormat format = new SimpleDateFormat("HH : mm : ss");
		Date time = new Date();
		String dataAndTime = format.format(time);
		return dataAndTime;
	}

	public static String secondFormat(int time) {
		String hour = Integer.toString(time / 3600);
		time %= 3600;
		String minute = Integer.toString(time / 60);
		String second = Integer.toString(time % 60);
		String output = hour + " : " + minute + " : " + second;
		return output;
	}

	public static void timerSetting(int settingTime, int secondTime) {
		if (secondTime < settingTime) {
			try {
				Thread.sleep((settingTime - secondTime) * 1000);
				String alertTime = secondFormat(settingTime);
				System.out.println("time is over (" + alertTime + ")");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} else {
			String alreadyTime = secondFormat(secondTime);
			System.out.println("time is already over (" + alreadyTime + ")");
		}
	}
}