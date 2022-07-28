import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class parking_lot_out {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");//jar파일 사용
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.103:33060/kopoctc", "root", "kopo43");
		//DBMS 서버 접속
		Statement stmt = conn.createStatement();//stmt객체 생성
		double lat=37.3860521;double lng = 127.1214038;
		String QueryTxt;
		//lat와 lng을 계산하여 가장 가까운 위치 찾기
		//QueryTxt = String.format("select * from parking where "+
		//							"SQRT( POWER( latitude-%f,2) + POWER (longitude-%f,2) ) = "+
		//							"(select MIN( SQRT( POWER( latitude-%f,2)+POWER (longitude-%f,2)))from parking);",
		//							lat,lng,lat,lng);
		
		//QueryTxt = "select * from parking";//전부보기
		//QueryTxt = "select * from parking where inst_country='강북구'";//시군구명에 강북구만 찾기
		QueryTxt = "select * from parking where inst_city = '서울특별시'";//도시가 서울특별시인 것만 찾기
		ResultSet rset = stmt.executeQuery(QueryTxt);
		int iCnt=0;
		while (rset.next()) {
			System.out.printf("*(%d)**********************************************************\n",iCnt++);
			System.out.printf("설치장소명        :%s\n",rset.getString(1));
			System.out.printf("설치장소상세      :%s\n",rset.getString(2));
			System.out.printf("설치시도명        :%s\n",rset.getString(3));
			System.out.printf("설치시군구명      :%s\n",rset.getString(4));
			System.out.printf("설치시설수분      :%s\n",rset.getString(5));
			System.out.printf("서비스제공사명    :%s\n",rset.getString(6));
			System.out.printf("와이파이SSID      :%s\n",rset.getString(7));
			System.out.printf("설치년월          :%s\n",rset.getString(8));
			System.out.printf("소재지도로명주소  :%s\n",rset.getString(9));
			System.out.printf("소재지번주소      :%s\n",rset.getString(10));
			System.out.printf("관리기관명        :%s\n",rset.getString(11));
			System.out.printf("관리기관전화번호  :%s\n",rset.getString(12));
			System.out.printf("위도              :%s\n",rset.getString(13));
			System.out.printf("경도              :%s\n",rset.getString(14));
			System.out.printf("데이터기준일자    :%s\n",rset.getString(15));
			
		}
		rset.close();
		
		stmt.close();//stmt닫기
		conn.close();//conn닫기

	}

}
