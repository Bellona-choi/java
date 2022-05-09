import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class P22 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");//jar���� ���
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.103:33060/kopoctc", "root", "kopo43");
		//DBMS ���� ����
		Statement stmt = conn.createStatement();//stmt��ü ����
		stmt.execute( "create table freewifi("+ //���̺� �����
				"inst_place varchar(50),"+
				"inst_place_detail varchar(50),"+
				"inst_city varchar(50),"+
				"inst_country varchar(50),"+
				"inst_place_flag varchar(50),"+
				"wifi_ssd varchar(50),"+
				"inst_date varchar(50),"+
				"place_addr_road varchar(200),"+
				"place_addr_load varchar(200),"+
				"manage_office varchar(50),"+
				"manage_office_phone varchar(50),"+
				"latitude double, "+
				"longitude double,"+
				"write_date date"+
				") DEFAULT CHARSET=utf8;"
				);//utf8�������� (�ѱۻ�밡��)
		
		stmt.close();//stmt�ݱ�
		conn.close();//conn�ݱ�

	}

}
