import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class score_in {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");//jar���� ���
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.103:33060/kopoctc", "root", "kopo43");
		// DBMS ���� ����
		Statement stmt = conn.createStatement();// stmt��ü ����
		// stmt.execute�� ����Ͽ� db�� ����� ��ɾ� �Է�(���� �����ϱ�)
		// stmt.execute("insert into score (name, studentid, kor, eng, mat) values
		// ('����', 209901, 95, 100, 95);");
		int num =1001;
		for (int i = 1; i < num; i++) {
			String name = String.format("ȫ��%03d", i);
			String QueryTxt;
			QueryTxt = String.format(
					"insert into score(studentid, name, kor, eng, mat) values (%s,'%s', ROUND(RAND()*100, 0), ROUND(RAND()*100, 0), ROUND(RAND()*100, 0));",
					i,name);
			stmt.execute(QueryTxt);
		}

		stmt.close();// stmt�ݱ�
		conn.close();// conn�ݱ�

	}

}
