package java9;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class A4 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		JSONParser parser = new JSONParser();

		Object obj = parser.parse(new FileReader("C:\\Users\\kopo\\Desktop\\df\\test.json"));//파일을 읽기로 불러온다

		JSONArray array = (JSONArray) obj;//JSONArray 배열만들기

		System.out.println("*********************************");
		for (int i = 0; i < array.size(); i++) {//array 크기만큼 반복문을 돌린다
			JSONObject k43_result = (JSONObject) array.get(i);
			System.out.println("이름 : " +  k43_result.get("name"));//이름 출력
			System.out.println("학번 : " +  k43_result.get("studentid"));//학번 출력

			JSONArray score = (JSONArray)  k43_result.get("score");//score에 k43_result에 있는 점수를 추가한다

			long kor = (long) score.get(0);//국어 점수를 추가한다
			long eng = (long) score.get(1);//영어 점수를 추가한다
			long mat = (long) score.get(2);//수학 점수를 추가한다

			System.out.println("국어 : " + kor);//국어점수 출력
			System.out.println("영어 : " + eng);//영어점수 출력
			System.out.println("수학 : " + mat);//수학점수 출력
			System.out.println("총점 : " + (kor + eng + mat));//총점 출력
			System.out.println("평균 : " + ((kor + eng + mat) / 3.0));//평균 출력
			System.out.println("*********************************");
		}
	}

}
