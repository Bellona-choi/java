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
		Class.forName("com.mysql.cj.jdbc.Driver");// jar파일 사용
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.103:33060/kopoctc", "kopo43", "1234");
		// DBMS 서버 접속

		String queryText=String.format("insert into sam(bsop_date,shrn_iscd,stck_oprc,stck_prpr,stck_hgpr,stck_lwpr,acml_vol,acml_tr_pbmn) values(?,?,?,?,?,?,?,?)");
	      PreparedStatement pstmt = conn.prepareStatement(queryText);
	      //statement = 커넥션.createStatement();
	      File f= new File("C:\\Users\\kopo\\Desktop\\df\\day_data\\StockDailyPrice.csv");
	      BufferedReader br = new BufferedReader(new FileReader(f));
	      
	      String readtext;//읽어온 파일을 한줄씩 저장하기 위한 문자열 변수
	      
	      if ((readtext = br.readLine())==null) {//첫줄이 null이면 빈 파일이기 때문에
	         System.out.println("빈 파일 입니다.");//출력
	      }
	      
	      String[] field_Name = readtext.split(",");//구분자지정
	      
	      int linecount =0;//읽어들이는 라인의 수를 저장하기 위한 변수
	      conn.setAutoCommit(false);//insert 속도 향상을 위해 setAutoCommit을 false로 설정
	      
	      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // 시간 형태 지정하기
	      long startTime = System.currentTimeMillis(); // 코드 실행 전에 시간 받아오기 (시작 시간)
	      Date startInDate = new Date(startTime); // 형태 날짜로 변환
	      String startFormat = sdf.format(startInDate); // 문자열 변수로 형태 변환
	      
	      while ((readtext = br.readLine())!=null){//읽어온 줄이 null이 아니면 계속 읽기
	               
	         String[] field = readtext.split(",");//, 구분자로 필드값을 나눠서 저장
	         
	         pstmt.setString(1,field[1]);//필드 입력
	         pstmt.setString(2,field[2]);//필드 입력
	         pstmt.setInt(3,Integer.parseInt(field[4]));//필드 입력
	         pstmt.setInt(4,Integer.parseInt(field[3]));//필드 입력
	         pstmt.setInt(5,Integer.parseInt(field[5]));//필드 입력
	         pstmt.setInt(6,Integer.parseInt(field[6]));//필드 입력
	         pstmt.setInt(7,Integer.parseInt(field[11]));//필드 입력
	         pstmt.setLong(8,Long.parseLong(field[12]));//필드 입력
	         pstmt.addBatch();//addBatch 메소드를 호출해서 SQL문장에 담는다
	         System.out.println(linecount+" 번째 항목 batch 완료");
	         pstmt.clearParameters();//Parameters 비우기
	         linecount++;//데이터를 처리하면 라인을 증가시킨다
	         try {
	            if(linecount%10000==0) {//10000줄씩 읽을때마다
	               pstmt.executeBatch();//executeBatch를 호출해서 SQL을 실행
	               conn.commit();//commit을 호출해 저장
	            }
	         } catch (Exception e) {//executeBatch에 에러가 발생하면
	            e.printStackTrace();//예외메시지 출력
	         }
	      }
	      try {
	         pstmt.executeBatch();//while루프가 끝난 뒤 캐시에 남은 SQL문장 실행
	      } catch (Exception e) {//executeBatch에 에러가 발생하면
	         e.printStackTrace();//예외메시지 출력
	      }
	      conn.commit();//commit을 호출해 저장
	      conn.setAutoCommit(true);//AutoCommit을 true로 설정
	      
	      long finishTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
	      Date finishInDate = new Date(finishTime); // 형태 날짜로 변환
	      String finishFormat = sdf.format(finishInDate); // 문자열 변수로 형태 변환

	      long diffTime = (finishTime - startTime); // 시간 차이 계산
	      long diffTimeMin = (diffTime / 1000 / 60); // 분 구하기
	      long diffTimeSec = (diffTime / 1000 % 60); // 초 구하기
	      
	      br.close();//br 닫기
	      pstmt.close();  //열었으면 닫아줘야 잘 돌아간다
	      conn.close(); //열었으면 닫아줘야 잘 돌아간다
	      System.out.println("시작 시간 : " + startFormat); // 시작 시간 출력
	      System.out.println("종료 시간 : " + finishFormat); // 종료 시간 출력
	      System.out.println("소요 시간 : " + diffTimeMin + "분 " + diffTimeSec + "초"); // 소요 시간 출력
	      System.out.println("총 항목 개수 : " + linecount); // 총 항목 개수 출력
	   }
	}