import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class P17 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");//jar���� ���
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.103:33060/kopoctc", "root", "kopo43");
		//DBMS ���� ����
		Statement stmt = conn.createStatement();//stmt��ü ����
		ResultSet rset = stmt.executeQuery("select * from examtable;");//rset ��ü ����
		
		while (rset.next()) {//database �� ������ ���
			System.out.println("�� : "+rset.getString(1));
		}
		rset.close();
		stmt.close();
		conn.close();

	}

}
