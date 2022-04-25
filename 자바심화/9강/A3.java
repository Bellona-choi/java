package java9;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class A3 {

	public static JSONObject oneRec(String k43_name, int k43_studentid, int k43_kor, int k43_eng, int k43_mat) {
		JSONObject k43_dataObject = new JSONObject();
		k43_dataObject.put("name", k43_name);
		k43_dataObject.put("studentid", k43_studentid);

		JSONArray k43_score = new JSONArray();//JSONArray 생성
		k43_score.add(k43_kor);//국어 추가
		k43_score.add(k43_eng);//영어 추가
		k43_score.add(k43_mat);//수학 추가
		k43_dataObject.put("score", k43_score);
		return k43_dataObject;
	}

	public static void main(String[] args) {
		JSONObject k43_jsonObject = new JSONObject();// 최종 완성될 JSONObject 선언
		JSONArray k43_datasArray = new JSONArray();// 한명 성적의 JSON정보를 담은 Array선언
		
		JSONObject k43_dataObject = new JSONObject();//한명의 정보가 들어갈 JSONObject 선언
		k43_dataObject.put("name", "나연");//name 에 나연 추가
		k43_dataObject.put("studentid", 209901);//studentid 에 209901 추가

		JSONArray k43_score = new JSONArray();//JSONArray 생성
		k43_score.add(90);//점수 추가
		k43_score.add(100);//점수 추가
		k43_score.add(95);//점수 추가
		k43_dataObject.put("score", k43_score);
		k43_datasArray.add(k43_dataObject);//한명의 정보를 최종 완성될k43_datasArray에 추가

		k43_datasArray.add(oneRec("정연", 209902, 100, 85, 75));//정연 학번 과목별 점수 추가
		k43_datasArray.add(oneRec("모모", 209903, 90, 75, 85));//모모 학번 과목별 점수 추가
		k43_datasArray.add(oneRec("사나", 209904, 90, 85, 75));//사나 학번 과목별 점수 추가
		k43_datasArray.add(oneRec("지효", 209905, 80, 75, 85));//지효 학번 과목별 점수 추가
		k43_datasArray.add(oneRec("미나", 209906, 90, 85, 55));//미나 학번 과목별 점수 추가
		k43_datasArray.add(oneRec("다연", 209907, 70, 75, 65));//다연 학번 과목별 점수 추가
		k43_datasArray.add(oneRec("채영", 209908, 100, 75, 95));//채영 학번 과목별 점수 추가
		k43_datasArray.add(oneRec("쯔위", 209909, 80, 65, 95));//쯔위 학번 과목별 점수 추가
		
		try {
			FileWriter  k43_file = new FileWriter("C:\\Users\\kopo\\Desktop\\df\\test.json");//파일을 쓸수있게 클래스 정의하기
			 k43_file.write(k43_datasArray.toJSONString());//JSON을 String형태로 바꾼다
			 k43_file.flush();//버퍼에 있는 데이터를 모두 처리
			 k43_file.close();//파일 닫기
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("JSON 만든거 : " + k43_datasArray);
	}

}
