import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class sam_table {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");// jar���� ���
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.103:33060/kopoctc", "kopo43", "1234");
		// DBMS ���� ����
		Statement stmt = conn.createStatement(); // JDBC ����̹� ���� ����

	      stmt.execute("create table sam (" 
	            + "bsop_date varchar(100), "
	            + "shrn_iscd  varchar(100), "
	            + "stck_oprc int, "
	            + "stck_prpr int, "
	            + "stck_hgpr int, "
	            + "stck_lwpr int, "
	            + "acml_vol long, "
	            + "acml_tr_pbmn long, "
	            + "PRIMARY KEY (bsop_date, shrn_iscd));" 
	      );
	      // open�� ��ŭ close �� �־�� �Ѵ�
	      stmt.close();
	      conn.close();
	   }
	}