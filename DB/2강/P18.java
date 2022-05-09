import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class P18 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");//jar파일 사용
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.103:33060/kopoctc", "root", "kopo43");
		//DBMS 서버 접속
		Statement stmt = conn.createStatement();//stmt객체 생성
		stmt.execute("create table examtable("+ //테이블 만들기
				"name varchar(20),"+//이름 은 char형태로 20칸 이내
				"studentid int not null primary key,"+//학생id는 고유키로 null값이 올수없다
				"kor int,"+//국어는 int형태로
				"eng int,"+//영어는 int 형태로
				"mat int)"+//수학은 int 형태로
				"DEFAULT CHARSET=utf8;");//utf8기준으로 (한글사용가능)
		
		stmt.close();//stmt닫기
		conn.close();//conn닫기

	}

}
