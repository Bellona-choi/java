import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class P19 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");//jar파일 사용
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.103:33060/kopoctc", "kopo43", "1234");
		//DBMS 서버 접속
		Statement stmt = conn.createStatement();//stmt객체 생성
		stmt.execute("drop table student;"); //테이블 제거하기
				
		
		stmt.close();//stmt닫기
		conn.close();//conn닫기

	}

}
