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
		//�ľ��� ���� �غ�
		DocumentBuilder k43_docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		// xml������ ó�� pc�ȿ� �־ ��ü��θ� ����
		Document k43_doc = k43_docBuilder.parse(new File("C:\\Users\\kopo\\Desktop\\df\\data.xml"));

		Element root = k43_doc.getDocumentElement();//root�ױ� ��������

		NodeList  k43_tag_name = k43_doc.getElementsByTagName("name");//node����Ʈ�� name �߰�
		NodeList  k43_tag_studentid = k43_doc.getElementsByTagName("studentid");//node����Ʈ�� studentid �߰�
		NodeList  k43_tag_kor = k43_doc.getElementsByTagName("kor");//node����Ʈ�� kor �߰�
		NodeList  k43_tag_eng = k43_doc.getElementsByTagName("eng");//node����Ʈ�� enge �߰�
		NodeList  k43_tag_mat = k43_doc.getElementsByTagName("mat");//node����Ʈ�� mat �߰�

		System.out.printf("************************\n");
		for (int i = 0; i <  k43_tag_name.getLength(); i++) {
			System.out.printf("�̸� : %s\n",  k43_tag_name.item(i).getFirstChild().getNodeValue());
			System.out.printf("�й� : %s\n",  k43_tag_studentid.item(i).getFirstChild().getNodeValue());
			System.out.printf("���� : %s\n",  k43_tag_kor.item(i).getFirstChild().getNodeValue());
			System.out.printf("���� : %s\n",  k43_tag_eng.item(i).getFirstChild().getNodeValue());
			System.out.printf("���� : %s\n",  k43_tag_mat.item(i).getFirstChild().getNodeValue());
			System.out.printf("************************\n");
		}

	}

}
