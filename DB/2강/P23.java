import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class P23 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");//jar���� ���
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.103:33060/kopoctc", "root", "kopo43");
		//DBMS ���� ����
		Statement stmt = conn.createStatement();//stmt��ü ����
		
		File f = new File("C:\\Users\\kopo\\Desktop\\day_data\\���������������.txt");
		BufferedReader br = new BufferedReader(new FileReader(f));
		
		String readtxt;
		
		if((readtxt = br.readLine())==null) {
			System.out.printf("�� �����Դϴ�\n");
			return;
		}
		String[] field_name=readtxt.split("\t");
		
		int LineCnt=0;
		while ((readtxt = br.readLine())!=null) {
			String[] field = readtxt.split("\t");
			String QueryTxt;
			
			QueryTxt = String.format("insert into freewifi ("
					+ "inst_place,inst_place_detail,inst_city,inst_country,inst_place_flag, "
					+ "service_provider,wifi_ssid,inst_date,place_addr_road,place_addr_load,"
					+ "manage_dffice,manage_office_phone,latitude,longitude,write_date)"
					+"values("
					+ "'%s','%s','%s','%s','%s',"
					+ "'%s','%s','%s','%s','%s',"
					+"'%s','%s','%s','%s','%s');",
					field[0],field[1],field[2],field[3],field[4],
					field[5],field[6],field[7],field[8],field[9],
					field[10],field[11],field[12],field[13],field[14]);
			//stmt.execute(QueryTxt);
			System.out.printf("%d��° �׸� Insert OK [%s]\n", LineCnt, QueryTxt);
			
			LineCnt++;
		}
		br.close();
		
		stmt.close();//stmt�ݱ�
		conn.close();//conn�ݱ�

	}

}
