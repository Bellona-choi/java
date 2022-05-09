import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class P20 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");// jar파일 사용
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.103:33060/kopoctc", "root", "kopo43");
		// DBMS 서버 접속
		Statement stmt = conn.createStatement();// stmt객체 생성
		//stmt.execute를 사용하여 db에 사용할 명령어 입력(내용 삽입하기)
		stmt.execute("insert into examtable (name, studentid, kor, eng, mat) values ('나연', 209901, 95, 100, 95);");
		stmt.execute("insert into examtable (name, studentid, kor, eng, mat) values ('정연', 209902,  100,  100,  100);");
		stmt.execute("insert into examtable (name, studentid, kor, eng, mat) values ('모모', 209903, 100, 90, 100);");
		stmt.execute("insert into examtable (name, studentid, kor, eng, mat) values ('사나', 209904, 100,  95,  90);");
		stmt.execute("insert into examtable (name, studentid, kor, eng, mat) values ('지효', 209905,  80, 100,  70);");
		stmt.execute("insert into examtable (name, studentid, kor, eng, mat) values ('미나', 209906,  95,  90,  95);");
		stmt.execute("insert into examtable (name, studentid, kor, eng, mat) values ('다현', 209907, 100, 90, 100);");
		stmt.execute("insert into examtable (name, studentid, kor, eng, mat) values ('채영', 209908, 100,  75,  90);");
		stmt.execute("insert into examtable (name, studentid, kor, eng, mat) values ('쯔위', 209909,  100, 100,  70);");

		stmt.close();// stmt닫기
		conn.close();// conn닫기

	}

}
