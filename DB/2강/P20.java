import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class P20 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");// jar���� ���
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.103:33060/kopoctc", "root", "kopo43");
		// DBMS ���� ����
		Statement stmt = conn.createStatement();// stmt��ü ����
		//stmt.execute�� ����Ͽ� db�� ����� ��ɾ� �Է�(���� �����ϱ�)
		stmt.execute("insert into examtable (name, studentid, kor, eng, mat) values ('����', 209901, 95, 100, 95);");
		stmt.execute("insert into examtable (name, studentid, kor, eng, mat) values ('����', 209902,  100,  100,  100);");
		stmt.execute("insert into examtable (name, studentid, kor, eng, mat) values ('���', 209903, 100, 90, 100);");
		stmt.execute("insert into examtable (name, studentid, kor, eng, mat) values ('�糪', 209904, 100,  95,  90);");
		stmt.execute("insert into examtable (name, studentid, kor, eng, mat) values ('��ȿ', 209905,  80, 100,  70);");
		stmt.execute("insert into examtable (name, studentid, kor, eng, mat) values ('�̳�', 209906,  95,  90,  95);");
		stmt.execute("insert into examtable (name, studentid, kor, eng, mat) values ('����', 209907, 100, 90, 100);");
		stmt.execute("insert into examtable (name, studentid, kor, eng, mat) values ('ä��', 209908, 100,  75,  90);");
		stmt.execute("insert into examtable (name, studentid, kor, eng, mat) values ('����', 209909,  100, 100,  70);");

		stmt.close();// stmt�ݱ�
		conn.close();// conn�ݱ�

	}

}
