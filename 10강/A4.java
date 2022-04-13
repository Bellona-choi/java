import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = null;
		int sum = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		br = new BufferedReader(new FileReader("C:\\Users\\kopo\\Desktop\\trafficvolume.csv"));
		String line;
		List<Integer> tmpList = new ArrayList<Integer>();
		while ((line = br.readLine()) != null) {
			String array[] = line.split(",");
			if (array[1].equals("목")) {
				try {
					tmpList.add(Integer.parseInt(array[20]));
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		for (int i = 0; i < tmpList.size(); i++) {
			sum += tmpList.get(i);
			min = Math.min(min, tmpList.get(i));
			max = Math.max(max, tmpList.get(i));
		}
		System.out.println("총합 : " + sum + ", 최소값 : " + min + ", 최대값 : " + max + ", 평균 : " + sum / tmpList.size());
	}

}
