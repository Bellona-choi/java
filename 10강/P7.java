import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class P7 {

	private static final Charset False = null;

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("C:\\Users\\kopo\\Desktop\\out.txt", false);
		for (int i = 11; i < 16; i++) {
			String data = "Line #" + i + "\n";
			fw.write(data);
		}
		fw.close();
	}
}
