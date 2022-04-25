package java9;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class A1 {

	public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException {
		//파씽을 위한 준비
		DocumentBuilder k43_docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		// xml파일을 처리 pc안에 있어서 전체경로를 지정
		Document k43_doc = k43_docBuilder.parse(new File("C:\\Users\\kopo\\Desktop\\df\\data.xml"));

		Element root = k43_doc.getDocumentElement();//root테그 가져오기

		NodeList  k43_tag_name = k43_doc.getElementsByTagName("name");//node리스트에 name 추가
		NodeList  k43_tag_studentid = k43_doc.getElementsByTagName("studentid");//node리스트에 studentid 추가
		NodeList  k43_tag_kor = k43_doc.getElementsByTagName("kor");//node리스트에 kor 추가
		NodeList  k43_tag_eng = k43_doc.getElementsByTagName("eng");//node리스트에 enge 추가
		NodeList  k43_tag_mat = k43_doc.getElementsByTagName("mat");//node리스트에 mat 추가

		System.out.printf("************************\n");
		for (int i = 0; i <  k43_tag_name.getLength(); i++) {
			System.out.printf("이름 : %s\n",  k43_tag_name.item(i).getFirstChild().getNodeValue());
			System.out.printf("학번 : %s\n",  k43_tag_studentid.item(i).getFirstChild().getNodeValue());
			System.out.printf("국어 : %s\n",  k43_tag_kor.item(i).getFirstChild().getNodeValue());
			System.out.printf("영어 : %s\n",  k43_tag_eng.item(i).getFirstChild().getNodeValue());
			System.out.printf("수학 : %s\n",  k43_tag_mat.item(i).getFirstChild().getNodeValue());
			System.out.printf("************************\n");
		}

	}

}
