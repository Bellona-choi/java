import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class P21 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");// jar파일 사용
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.103:33060/kopoctc", "kopo43", "1234");
		// DBMS 서버 접속
		Statement stmt = conn.createStatement();// stmt객체 생성
		ResultSet rset = stmt.executeQuery("select * from student;");// rset 객체 생성(데이터베이스 명령어 입력)
		// stmt.execute를 사용하여 db에 사용할 명령어 입력(내용 삽입하기)
		while (rset.next()) {// database 의 내용을 출력
			System.out.printf("%4s  %6d  %3d  %3d  %3d \n", rset.getString(1), rset.getInt(2), rset.getInt(3),
					rset.getInt(4), rset.getInt(5));
		}
		rset.close();
		stmt.close();// stmt닫기
		conn.close();// conn닫기

	}

}
