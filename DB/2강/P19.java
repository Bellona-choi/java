import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class P19 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");//jar���� ���
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.103:33060/kopoctc", "kopo43", "1234");
		//DBMS ���� ����
		Statement stmt = conn.createStatement();//stmt��ü ����
		stmt.execute("drop table student;"); //���̺� �����ϱ�
				
		
		stmt.close();//stmt�ݱ�
		conn.close();//conn�ݱ�

	}

}
