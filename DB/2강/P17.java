import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class P17 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");//jar파일 사용
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.103:33060/kopoctc", "root", "kopo43");
		//DBMS 서버 접속
		Statement stmt = conn.createStatement();//stmt객체 생성
		ResultSet rset = stmt.executeQuery("select * from examtable;");//rset 객체 생성
		
		while (rset.next()) {//database 의 내용을 출력
			System.out.println("값 : "+rset.getString(1));
		}
		rset.close();
		stmt.close();
		conn.close();

	}

}
