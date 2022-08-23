package saramin;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class saramin_java {

		   public static final String WEB_DRIVER_ID = "webdriver.chrome.driver";
		   public static final String WEB_DRIVER_PATH = "C:\\Users\\kopo\\Desktop\\chromedriver\\chromedriver.exe";

		   public static void main(String[] args) throws IOException {
		      // TODO Auto-generated method stub
		      try {
		         System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
		      } catch (Exception e) {
		         e.printStackTrace();
		      }

		      ChromeOptions options = new ChromeOptions();
		      WebDriver driver = new ChromeDriver(options);
		      JavascriptExecutor js = (JavascriptExecutor) driver;
		      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));

		      File f = new File("C:\\Users\\kopo\\Desktop\\자료정리\\saramin4.csv");
		      BufferedWriter bw = new BufferedWriter(new FileWriter(f, true));
		      
		      
		      String city = "바이오인공지능";
		      int repeat = 0;

		     
		         driver.get("https://m.saramin.co.kr");
		         
		         wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/header/div[2]/div/input"))).click();
		         try { // 검색어 커서!
		            Thread.sleep(2000);
		         } catch (InterruptedException e) {
		            e.printStackTrace();
		         }

		         

		         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/form/input[3]"))
		               .sendKeys(city); // java검색
		         try {
		            Thread.sleep(1500);
		         } catch (InterruptedException e) {
		            e.printStackTrace();
		         }

		         // 엔터 누르기
		         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/form/input[3]"))
		               .sendKeys(Keys.ENTER);
//-----------------------------
		       
		         String tt = "";
		         int i = 1;
		         int n = 1;
		         String a="";
		         String c="";
		         int b = 1;
		         // GET TEXT  //li[1~20]
		         try {
		            while (true) {
		            	
		               tt = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div[6]/section[2]/ul/li["+ i + "]/div/div[1]/span[1]"))).getText();
		           
		               System.out.println(tt);
		               
		               tt = tt + ",";

		               a = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div[6]/section[2]/ul/li["+ i + "]/div/div[1]/strong"))).getText();
		               a = a.replaceAll(",", " ");
		               tt += a + ",";
		               
		               
	
		               c = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div[6]/section[2]/ul/li["+ i + "]/div/div[1]/span[2]"))).getText();
		               System.out.println(c);
		               c = c.replaceAll("|", " ");
		               tt += c;
		       
		               bw.write(tt);
		               bw.newLine();
		               
		               
		               if (i % 4 == 0) {
		                
		                  js.executeScript("window.scrollBy(0, 400)");
		                 
		                  try {
		                     Thread.sleep(2000);
		                  } catch (InterruptedException e) {
		                     e.printStackTrace();
		                  }
		               }
		               
		               i++;
		               
		               
		               if (i == 21 & n != 5) {
		            	   try { // 검색어 커서!
		            		   Thread.sleep(2000);
		            	   } catch (InterruptedException e) {
		            		   e.printStackTrace();
		            	   }
		            	   wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div[6]/section[2]/div/a["+ n + "]"))).click();
		            	   Thread.sleep(2000);
		            	   n++;
		            	   b++;
		            	   i=1;
		               }
		            	 if(n % 5 == 0 & i == 21) { 
		            		   if (b == 5) {
		            			   wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div[6]/section[2]/div/button"))).click();
		            			   n=1;																
		            			   i=1;
		            			   Thread.sleep(2000);
		            		
		            		   } else {
		            			   wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div[6]/section[2]/div/button[2]"))).click();
		            			   n=1;
		            			   i=1;
		            			   Thread.sleep(2000);
		            		   }
		            		   
		            		   
		            	   }
		               }
		         
		                      
		
		         } catch (Exception e) {
		            e.printStackTrace();
		            bw.close();
		         } finally {
		            repeat++;
		  
		         }
		         bw.close();
		      }
	

		}