import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class P18 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");//jar���� ���
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.103:33060/kopoctc", "root", "kopo43");
		//DBMS ���� ����
		Statement stmt = conn.createStatement();//stmt��ü ����
		stmt.execute("create table examtable("+ //���̺� �����
				"name varchar(20),"+//�̸� �� char���·� 20ĭ �̳�
				"studentid int not null primary key,"+//�л�id�� ����Ű�� null���� �ü�����
				"kor int,"+//����� int���·�
				"eng int,"+//����� int ���·�
				"mat int)"+//������ int ���·�
				"DEFAULT CHARSET=utf8;");//utf8�������� (�ѱۻ�밡��)
		
		stmt.close();//stmt�ݱ�
		conn.close();//conn�ݱ�

	}

}
