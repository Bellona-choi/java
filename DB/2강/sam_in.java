import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

public class sam_in {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");// jar���� ���
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.103:33060/kopoctc", "kopo43", "1234");
		// DBMS ���� ����

		String queryText=String.format("insert into sam(bsop_date,shrn_iscd,stck_oprc,stck_prpr,stck_hgpr,stck_lwpr,acml_vol,acml_tr_pbmn) values(?,?,?,?,?,?,?,?)");
	      PreparedStatement pstmt = conn.prepareStatement(queryText);
	      //statement = Ŀ�ؼ�.createStatement();
	      File f= new File("C:\\Users\\kopo\\Desktop\\df\\day_data\\StockDailyPrice.csv");
	      BufferedReader br = new BufferedReader(new FileReader(f));
	      
	      String readtext;//�о�� ������ ���پ� �����ϱ� ���� ���ڿ� ����
	      
	      if ((readtext = br.readLine())==null) {//ù���� null�̸� �� �����̱� ������
	         System.out.println("�� ���� �Դϴ�.");//���
	      }
	      
	      String[] field_Name = readtext.split(",");//����������
	      
	      int linecount =0;//�о���̴� ������ ���� �����ϱ� ���� ����
	      conn.setAutoCommit(false);//insert �ӵ� ����� ���� setAutoCommit�� false�� ����
	      
	      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // �ð� ���� �����ϱ�
	      long startTime = System.currentTimeMillis(); // �ڵ� ���� ���� �ð� �޾ƿ��� (���� �ð�)
	      Date startInDate = new Date(startTime); // ���� ��¥�� ��ȯ
	      String startFormat = sdf.format(startInDate); // ���ڿ� ������ ���� ��ȯ
	      
	      while ((readtext = br.readLine())!=null){//�о�� ���� null�� �ƴϸ� ��� �б�
	               
	         String[] field = readtext.split(",");//, �����ڷ� �ʵ尪�� ������ ����
	         
	         pstmt.setString(1,field[1]);//�ʵ� �Է�
	         pstmt.setString(2,field[2]);//�ʵ� �Է�
	         pstmt.setInt(3,Integer.parseInt(field[4]));//�ʵ� �Է�
	         pstmt.setInt(4,Integer.parseInt(field[3]));//�ʵ� �Է�
	         pstmt.setInt(5,Integer.parseInt(field[5]));//�ʵ� �Է�
	         pstmt.setInt(6,Integer.parseInt(field[6]));//�ʵ� �Է�
	         pstmt.setInt(7,Integer.parseInt(field[11]));//�ʵ� �Է�
	         pstmt.setLong(8,Long.parseLong(field[12]));//�ʵ� �Է�
	         pstmt.addBatch();//addBatch �޼ҵ带 ȣ���ؼ� SQL���忡 ��´�
	         System.out.println(linecount+" ��° �׸� batch �Ϸ�");
	         pstmt.clearParameters();//Parameters ����
	         linecount++;//�����͸� ó���ϸ� ������ ������Ų��
	         try {
	            if(linecount%10000==0) {//10000�پ� ����������
	               pstmt.executeBatch();//executeBatch�� ȣ���ؼ� SQL�� ����
	               conn.commit();//commit�� ȣ���� ����
	            }
	         } catch (Exception e) {//executeBatch�� ������ �߻��ϸ�
	            e.printStackTrace();//���ܸ޽��� ���
	         }
	      }
	      try {
	         pstmt.executeBatch();//while������ ���� �� ĳ�ÿ� ���� SQL���� ����
	      } catch (Exception e) {//executeBatch�� ������ �߻��ϸ�
	         e.printStackTrace();//���ܸ޽��� ���
	      }
	      conn.commit();//commit�� ȣ���� ����
	      conn.setAutoCommit(true);//AutoCommit�� true�� ����
	      
	      long finishTime = System.currentTimeMillis(); // �ڵ� ���� �Ŀ� �ð� �޾ƿ���
	      Date finishInDate = new Date(finishTime); // ���� ��¥�� ��ȯ
	      String finishFormat = sdf.format(finishInDate); // ���ڿ� ������ ���� ��ȯ

	      long diffTime = (finishTime - startTime); // �ð� ���� ���
	      long diffTimeMin = (diffTime / 1000 / 60); // �� ���ϱ�
	      long diffTimeSec = (diffTime / 1000 % 60); // �� ���ϱ�
	      
	      br.close();//br �ݱ�
	      pstmt.close();  //�������� �ݾ���� �� ���ư���
	      conn.close(); //�������� �ݾ���� �� ���ư���
	      System.out.println("���� �ð� : " + startFormat); // ���� �ð� ���
	      System.out.println("���� �ð� : " + finishFormat); // ���� �ð� ���
	      System.out.println("�ҿ� �ð� : " + diffTimeMin + "�� " + diffTimeSec + "��"); // �ҿ� �ð� ���
	      System.out.println("�� �׸� ���� : " + linecount); // �� �׸� ���� ���
	   }
	}