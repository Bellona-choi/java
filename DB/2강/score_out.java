import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class score_out {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");//jar���� ���
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.103:33060/kopoctc", "root", "kopo43");
		//DBMS ���� ����
		Statement stmt = conn.createStatement();//stmt��ü ����
		
		String QueryTxt;
		for(int i = 0; i < 1000; i=i+30) { 
			   QueryTxt = String.format(" select *, kor+eng+mat, (kor+eng+mat)/3 from score limit %d, 30;", i);
			   
			    ResultSet rset = stmt.executeQuery(QueryTxt);
			    
			    System.out.printf("**********************************************\n");   //���м� ���
			     System.out.printf("%s%4s%6s%4s%4s%4s%4s\n", "�й�", "�̸�", "����", "����", "����", "�հ�", "���");
			    // ����� ������ ����� ����ϱ� ���� while�� ����, ���� ������ while�� ����
			     while (rset.next()) {

			        System.out.printf("%04d%6s%5d%6d%6d%6d  %6.2f \n", rset.getInt(2),rset.getString(1),rset.getInt(3),rset.getInt(4),rset.getInt(5),rset.getInt(6),rset.getDouble(7));   
			    }
			    System.out.printf("*******************************************\n");   //���м� ���
			    
			    System.out.printf("����\n");   //���м� ���
			    QueryTxt = String.format(" select sum(kor), sum(eng), sum(mat), sum(kor+eng+mat), sum((kor+eng+mat)/3), "
			          + "avg(kor), avg(eng), avg(mat), avg(kor+eng+mat), avg((kor+eng+mat)/3) from (select kor,eng,mat from score limit %d,30)as sum;", i);
			    
			    ResultSet rset2 = stmt.executeQuery(QueryTxt);
			    
			    while (rset2.next()) {
			        System.out.printf("    %5d %6d %6d %6d  %6.2f \n", rset2.getInt(1),rset2.getInt(2),rset2.getInt(3),rset2.getInt(4),rset2.getDouble(5));
			        System.out.printf("    %5.2f %6.2f %6.2f %6.2f  %6.2f \n", rset2.getDouble(6),rset2.getDouble(7),rset2.getDouble(8),rset2.getDouble(9),rset2.getDouble(10));   
			    }
			    
			    System.out.printf("����\n");   //���м� ���
			    
			    if (i == 990) {
			       i=970;
			    }
			    QueryTxt = String.format(" select sum(kor), sum(eng), sum(mat), sum(kor+eng+mat), sum((kor+eng+mat)/3), "
			          + "avg(kor), avg(eng), avg(mat), avg(kor+eng+mat), avg((kor+eng+mat)/3) from (select kor,eng,mat from score limit 0, %d)as avg;", (i+30));
			    
			    ResultSet rset3 = stmt.executeQuery(QueryTxt);
			    
			    while (rset3.next()) {
			        System.out.printf("    %5d %6d %6d %6d  %6.2f \n", rset3.getInt(1),rset3.getInt(2),rset3.getInt(3),rset3.getInt(4),rset3.getDouble(5));
			        System.out.printf("    %5.2f %6.2f %6.2f %6.2f  %6.2f \n", rset3.getDouble(6),rset3.getDouble(7),rset3.getDouble(8),rset3.getDouble(9),rset3.getDouble(10));   
			    }
			        
			    rset.close(); //ResultSe ���� 
			    rset2.close();
			    rset3.close();
			}
			 

			  stmt.close(); //Statement ����
			  conn.close(); //Connection ����
			}
			}
