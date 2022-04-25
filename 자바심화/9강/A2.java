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

		String k43_seq = "";// 48시간중 몇번쨰인지
		String k43_hour = "";// 3시간단위 동네예보
		String k43_day = "";// 날짜(0 = 오늘,1=내일,2=모래 )
		String k43_temp = "";// 현재 시간온도
		String k43_tmx = "";// 최고 온도
		String k43_tmn = "";// 최저 온도
		String k43_sky = "";// 하늘상태(1 = 맑음,2=구름조금,3=구름많음, 4=흐림 )
		String k43_pty = "";// 강수상태(0 = 없음,1=비,2=비/눈,3=눈/비,4=눈 )
		String k43_wfKor = "";// 날씨 한국어
		String k43_wfEn = "";// 날씨 영어
		String k43_pop = "";// 강수확율
		String k43_r12 = "";// 12시간 예상 강수량
		String k43_s12 = "";// 12시간 예상 적설량
		String k43_ws = "";// 풍속(m/s)
		String k43_wd = "";// 풍향(0~7=북/북동/동/남동/남/남서/서/북서)
		String k43_wdKor = "";// 풍향 한국어
		String k43_wdEn = "";// 풍향 영어
		String k43_reh = "";// 습도
		String k43_r06 = "";// 6시간 예상 강수량
		String k43_s06 = "";// 6시간 예상 적설량
		DocumentBuilder k43_docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();// 파씽을 위한 준비
		Document k43_doc = k43_docBuilder.parse(new File("C:\\Users\\kopo\\Desktop\\df\\DFS.xml"));// xml파일을 처리 pc안에 있어서
																									// 전체경로를 지정
		Element root = k43_doc.getDocumentElement();// 루트 테그 가져오기
		NodeList tag_001 = k43_doc.getElementsByTagName("data");// node리스트에tag_001 추가
		for (int i = 0; i < tag_001.getLength(); i++) {// tag_001리스트내의 노드수만큼 반복문
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

			System.out.printf("%s%s\n", "48시간중의 번호                              : ", k43_seq);
			System.out.printf("%s%s\n", "3시간단위                                    : ", k43_hour);
			System.out.printf("%s%s\n", "날짜(0:오늘,1:내일,2:모래)                   : ", k43_day);
			System.out.printf("%s%s\n", "현재 시간온도                                : ", k43_temp);
			System.out.printf("%s%s\n", "최고 온도                                    : ", k43_tmx);
			System.out.printf("%s%s\n", "최저 온도                                    : ", k43_tmn);
			System.out.printf("%s%s\n", "하늘상태(1:맑음,2:구름조금,3:구름많음,4:흐림): ", k43_sky);
			System.out.printf("%s%s\n", "강수상태(0:없음,1:비,2:비/눈,3:눈/비,4:눈)   : ", k43_pty);
			System.out.printf("%s%s\n", "날씨 한국어                                  : ", k43_wfKor);
			System.out.printf("%s%s\n", "날씨 영어                                    : ", k43_wfEn);
			System.out.printf("%s%s\n", "강수확율                                     : ", k43_pop);
			System.out.printf("%s%s\n", "12시간 예상 강수량                           : ", k43_r12);
			System.out.printf("%s%s\n", "12시간 예상 적설량                           : ", k43_s12);
			System.out.printf("%s%s\n", "풍속(m/s)                                    : ", k43_ws);
			System.out.printf("%s%s\n", "풍향(0~7=북/북동/동/남동/남/남서/서/북서)    : ", k43_wd);
			System.out.printf("%s%s\n", "풍향 한국어                                  : ", k43_wdKor);
			System.out.printf("%s%s\n", "풍향 영어                                    : ", k43_wdEn);
			System.out.printf("%s%s\n", "습도                                         : ", k43_reh);
			System.out.printf("%s%s\n", "6시간 예상 강수량                            : ", k43_r06);
			System.out.printf("%s%s\n", "6시간 예상 적설량                            : ", k43_s06);
			System.out.printf("%s\n", "*******************************************************************");

		}
		
	}

}
