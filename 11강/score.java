import java.util.ArrayList;
import java.util.Collections;

public class score {

	public static void main(String[] args) {
		Student();
	}

	public static void Student() {
		ArrayList<String> student_score = new ArrayList<String>();
		ArrayList<Integer> score = new ArrayList<Integer>();
		ArrayList<String> Finnal = new ArrayList<String>();
		student_score.add("Mike 89");
		student_score.add("Jay 88");
		student_score.add("Kim 92");
		student_score.add("Lee 85");
		student_score.add("Park 90");
		for (int i = 0; i < student_score.size(); i++) {
			score.add(Integer.parseInt(student_score.get(i).substring(student_score.get(i).length() - 2)));
		}
		Collections.sort(score);
		Collections.reverse(score);
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (student_score.get(j).contains(Integer.toString(score.get(i)))) {
					Finnal.add(student_score.get(j).substring(0, student_score.get(j).length() - 3));
				}
			}
		}
		System.out.println(Finnal);
	}
}