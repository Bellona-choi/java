import java.io.File;

public class P8 {

	public static void main(String[] args) {
		File dir = new File("C:\\Users\\kopo\\Desktop");
		File files[] = dir.listFiles();
		for (int i = 0; i < files.length; i++) {
			System.out.println(files[i]);
		}

	}

}
