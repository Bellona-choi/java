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

public class A2 {

	public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException {

		String k43_seq = "";// 48�ð��� ���������
		String k43_hour = "";// 3�ð����� ���׿���
		String k43_day = "";// ��¥(0 = ����,1=����,2=�� )
		String k43_temp = "";// ���� �ð��µ�
		String k43_tmx = "";// �ְ� �µ�
		String k43_tmn = "";// ���� �µ�
		String k43_sky = "";// �ϴû���(1 = ����,2=��������,3=��������, 4=�帲 )
		String k43_pty = "";// ��������(0 = ����,1=��,2=��/��,3=��/��,4=�� )
		String k43_wfKor = "";// ���� �ѱ���
		String k43_wfEn = "";// ���� ����
		String k43_pop = "";// ����Ȯ��
		String k43_r12 = "";// 12�ð� ���� ������
		String k43_s12 = "";// 12�ð� ���� ������
		String k43_ws = "";// ǳ��(m/s)
		String k43_wd = "";// ǳ��(0~7=��/�ϵ�/��/����/��/����/��/�ϼ�)
		String k43_wdKor = "";// ǳ�� �ѱ���
		String k43_wdEn = "";// ǳ�� ����
		String k43_reh = "";// ����
		String k43_r06 = "";// 6�ð� ���� ������
		String k43_s06 = "";// 6�ð� ���� ������
		DocumentBuilder k43_docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();// �ľ��� ���� �غ�
		Document k43_doc = k43_docBuilder.parse(new File("C:\\Users\\kopo\\Desktop\\df\\DFS.xml"));// xml������ ó�� pc�ȿ� �־
																									// ��ü��θ� ����
		Element root = k43_doc.getDocumentElement();// ��Ʈ �ױ� ��������
		NodeList tag_001 = k43_doc.getElementsByTagName("data");// node����Ʈ��tag_001 �߰�
		for (int i = 0; i < tag_001.getLength(); i++) {// tag_001����Ʈ���� ������ŭ �ݺ���
			Element elmt = (Element) tag_001.item(i);

			k43_seq = tag_001.item(i).getAttributes().getNamedItem("seq").getNodeValue();
			k43_hour = elmt.getElementsByTagName("hour").item(0).getFirstChild().getNodeValue();
			k43_day = elmt.getElementsByTagName("day").item(0).getFirstChild().getNodeValue();
			k43_temp = elmt.getElementsByTagName("temp").item(0).getFirstChild().getNodeValue();
			k43_tmx = elmt.getElementsByTagName("tmx").item(0).getFirstChild().getNodeValue();
			k43_tmn = elmt.getElementsByTagName("tmn").item(0).getFirstChild().getNodeValue();
			k43_sky = elmt.getElementsByTagName("sky").item(0).getFirstChild().getNodeValue();
			k43_pty = elmt.getElementsByTagName("pty").item(0).getFirstChild().getNodeValue();
			k43_wfKor = elmt.getElementsByTagName("wfKor").item(0).getFirstChild().getNodeValue();
			k43_wfEn = elmt.getElementsByTagName("wfEn").item(0).getFirstChild().getNodeValue();
			k43_pop = elmt.getElementsByTagName("pop").item(0).getFirstChild().getNodeValue();
			k43_r12 = elmt.getElementsByTagName("r12").item(0).getFirstChild().getNodeValue();
			k43_s12 = elmt.getElementsByTagName("s12").item(0).getFirstChild().getNodeValue();
			k43_ws = elmt.getElementsByTagName("ws").item(0).getFirstChild().getNodeValue();
			k43_wd = elmt.getElementsByTagName("wd").item(0).getFirstChild().getNodeValue();
			k43_wdKor = elmt.getElementsByTagName("wdKor").item(0).getFirstChild().getNodeValue();
			k43_wdEn = elmt.getElementsByTagName("wdEn").item(0).getFirstChild().getNodeValue();
			k43_reh = elmt.getElementsByTagName("reh").item(0).getFirstChild().getNodeValue();
			k43_r06 = elmt.getElementsByTagName("r06").item(0).getFirstChild().getNodeValue();
			k43_s06 = elmt.getElementsByTagName("s06").item(0).getFirstChild().getNodeValue();

			System.out.printf("%s%s\n", "48�ð����� ��ȣ                              : ", k43_seq);
			System.out.printf("%s%s\n", "3�ð�����                                    : ", k43_hour);
			System.out.printf("%s%s\n", "��¥(0:����,1:����,2:��)                   : ", k43_day);
			System.out.printf("%s%s\n", "���� �ð��µ�                                : ", k43_temp);
			System.out.printf("%s%s\n", "�ְ� �µ�                                    : ", k43_tmx);
			System.out.printf("%s%s\n", "���� �µ�                                    : ", k43_tmn);
			System.out.printf("%s%s\n", "�ϴû���(1:����,2:��������,3:��������,4:�帲): ", k43_sky);
			System.out.printf("%s%s\n", "��������(0:����,1:��,2:��/��,3:��/��,4:��)   : ", k43_pty);
			System.out.printf("%s%s\n", "���� �ѱ���                                  : ", k43_wfKor);
			System.out.printf("%s%s\n", "���� ����                                    : ", k43_wfEn);
			System.out.printf("%s%s\n", "����Ȯ��                                     : ", k43_pop);
			System.out.printf("%s%s\n", "12�ð� ���� ������                           : ", k43_r12);
			System.out.printf("%s%s\n", "12�ð� ���� ������                           : ", k43_s12);
			System.out.printf("%s%s\n", "ǳ��(m/s)                                    : ", k43_ws);
			System.out.printf("%s%s\n", "ǳ��(0~7=��/�ϵ�/��/����/��/����/��/�ϼ�)    : ", k43_wd);
			System.out.printf("%s%s\n", "ǳ�� �ѱ���                                  : ", k43_wdKor);
			System.out.printf("%s%s\n", "ǳ�� ����                                    : ", k43_wdEn);
			System.out.printf("%s%s\n", "����                                         : ", k43_reh);
			System.out.printf("%s%s\n", "6�ð� ���� ������                            : ", k43_r06);
			System.out.printf("%s%s\n", "6�ð� ���� ������                            : ", k43_s06);
			System.out.printf("%s\n", "*******************************************************************");

		}
		
	}

}
