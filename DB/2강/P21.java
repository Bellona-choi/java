import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class P21 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");// jar���� ���
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.103:33060/kopoctc", "kopo43", "1234");
		// DBMS ���� ����
		Statement stmt = conn.createStatement();// stmt��ü ����
		ResultSet rset = stmt.executeQuery("select * from student;");// rset ��ü ����(�����ͺ��̽� ��ɾ� �Է�)
		// stmt.execute�� ����Ͽ� db�� ����� ��ɾ� �Է�(���� �����ϱ�)
		while (rset.next()) {// database �� ������ ���
			System.out.printf("%4s  %6d  %3d  %3d  %3d \n", rset.getString(1), rset.getInt(2), rset.getInt(3),
					rset.getInt(4), rset.getInt(5));
		}
		rset.close();
		stmt.close();// stmt�ݱ�
		conn.close();// conn�ݱ�

	}

}
