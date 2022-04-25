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

		Object obj = parser.parse(new FileReader("C:\\Users\\kopo\\Desktop\\df\\test.json"));//������ �б�� �ҷ��´�

		JSONArray array = (JSONArray) obj;//JSONArray �迭�����

		System.out.println("*********************************");
		for (int i = 0; i < array.size(); i++) {//array ũ�⸸ŭ �ݺ����� ������
			JSONObject k43_result = (JSONObject) array.get(i);
			System.out.println("�̸� : " +  k43_result.get("name"));//�̸� ���
			System.out.println("�й� : " +  k43_result.get("studentid"));//�й� ���

			JSONArray score = (JSONArray)  k43_result.get("score");//score�� k43_result�� �ִ� ������ �߰��Ѵ�

			long kor = (long) score.get(0);//���� ������ �߰��Ѵ�
			long eng = (long) score.get(1);//���� ������ �߰��Ѵ�
			long mat = (long) score.get(2);//���� ������ �߰��Ѵ�

			System.out.println("���� : " + kor);//�������� ���
			System.out.println("���� : " + eng);//�������� ���
			System.out.println("���� : " + mat);//�������� ���
			System.out.println("���� : " + (kor + eng + mat));//���� ���
			System.out.println("��� : " + ((kor + eng + mat) / 3.0));//��� ���
			System.out.println("*********************************");
		}
	}

}
