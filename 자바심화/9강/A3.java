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

		JSONArray k43_score = new JSONArray();//JSONArray ����
		k43_score.add(k43_kor);//���� �߰�
		k43_score.add(k43_eng);//���� �߰�
		k43_score.add(k43_mat);//���� �߰�
		k43_dataObject.put("score", k43_score);
		return k43_dataObject;
	}

	public static void main(String[] args) {
		JSONObject k43_jsonObject = new JSONObject();// ���� �ϼ��� JSONObject ����
		JSONArray k43_datasArray = new JSONArray();// �Ѹ� ������ JSON������ ���� Array����
		
		JSONObject k43_dataObject = new JSONObject();//�Ѹ��� ������ �� JSONObject ����
		k43_dataObject.put("name", "����");//name �� ���� �߰�
		k43_dataObject.put("studentid", 209901);//studentid �� 209901 �߰�

		JSONArray k43_score = new JSONArray();//JSONArray ����
		k43_score.add(90);//���� �߰�
		k43_score.add(100);//���� �߰�
		k43_score.add(95);//���� �߰�
		k43_dataObject.put("score", k43_score);
		k43_datasArray.add(k43_dataObject);//�Ѹ��� ������ ���� �ϼ���k43_datasArray�� �߰�

		k43_datasArray.add(oneRec("����", 209902, 100, 85, 75));//���� �й� ���� ���� �߰�
		k43_datasArray.add(oneRec("���", 209903, 90, 75, 85));//��� �й� ���� ���� �߰�
		k43_datasArray.add(oneRec("�糪", 209904, 90, 85, 75));//�糪 �й� ���� ���� �߰�
		k43_datasArray.add(oneRec("��ȿ", 209905, 80, 75, 85));//��ȿ �й� ���� ���� �߰�
		k43_datasArray.add(oneRec("�̳�", 209906, 90, 85, 55));//�̳� �й� ���� ���� �߰�
		k43_datasArray.add(oneRec("�ٿ�", 209907, 70, 75, 65));//�ٿ� �й� ���� ���� �߰�
		k43_datasArray.add(oneRec("ä��", 209908, 100, 75, 95));//ä�� �й� ���� ���� �߰�
		k43_datasArray.add(oneRec("����", 209909, 80, 65, 95));//���� �й� ���� ���� �߰�
		
		try {
			FileWriter  k43_file = new FileWriter("C:\\Users\\kopo\\Desktop\\df\\test.json");//������ �����ְ� Ŭ���� �����ϱ�
			 k43_file.write(k43_datasArray.toJSONString());//JSON�� String���·� �ٲ۴�
			 k43_file.flush();//���ۿ� �ִ� �����͸� ��� ó��
			 k43_file.close();//���� �ݱ�
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("JSON ����� : " + k43_datasArray);
	}

}
