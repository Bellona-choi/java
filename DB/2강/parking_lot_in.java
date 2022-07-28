import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class parking_lot_in {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");//jar파일 사용
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.103:33060/kopoctc", "kopo43", "1234");
		//DBMS 서버 접속
		Statement stmt = conn.createStatement();//stmt객체 생성
		
		File f = new File("C:\\Users\\kopo\\Desktop\\한국교통안전공단_전국공영주차장정보_20191224.txt");
		BufferedReader br = new BufferedReader(new FileReader(f));
		
		String readtxt;
		
		if((readtxt = br.readLine())==null) {//만약 읽을 줄이 없으면
			System.out.printf("빈 파일입니다\n");//출력
			return;
		}
		String[] field_name=readtxt.split("\t");//\t기준으로 쪼개기
		
		int LineCnt=0;
		while ((readtxt = br.readLine())!=null) {//한줄씩 읽기
			String[] field = readtxt.split("\t");
			String QueryTxt;
			//데이터 삽입
			QueryTxt = String.format("insert into parking ("
					+ "inst_place,inst_place_detail,inst_city,inst_country,inst_place_flag, "
					+ "service_provider,wifi_ssid,inst_date,place_addr_road,place_addr_load,"
					+ "manage_office,manage_office_phone,latitude,longitude,write_date)"
					+"values("
					+ "'%s','%s','%s','%s','%s',"
					+ "'%s','%s','%s','%s','%s',"
					+"'%s','%s','%s','%s','%s');",
					field[0],field[1],field[2],field[3],field[4],
					field[5],field[6],field[7],field[8],field[9],
					field[10],field[11],field[12],field[13],field[14]);
			stmt.execute(QueryTxt);//QueryTxt 실행
			System.out.printf("%d번째 항목 Insert OK [%s]\n", LineCnt, QueryTxt);
			System.out.println(readtxt);
			LineCnt++;//LineCnt++
		}
		br.close();//br닫기
		
		stmt.close();//stmt닫기
		conn.close();//conn닫기

	}

}
