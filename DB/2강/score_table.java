import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class score_table {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");//jar���� ���
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.103:33060/kopoctc", "root", "kopo43");
		// DBMS ���� ����
		Statement stmt = conn.createStatement();// stmt��ü ����
		stmt.execute("create table score(" + // ���̺� �����
				"name varchar(20),"+//�̸� �� char���·� 20ĭ �̳�
				"studentid int,"+//�л�id�� ����Ű�� null���� �ü�����
				"kor int,"+//����� int���·�
				"eng int,"+//����� int ���·�
				"mat int,primary key(studentid))"+//������ int ���·�
				"DEFAULT CHARSET=utf8;");//utf8�������� (�ѱۻ�밡��)

		stmt.close();// stmt�ݱ�
		conn.close();// conn�ݱ�

	}

}
