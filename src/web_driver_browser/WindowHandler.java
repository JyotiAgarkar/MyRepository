package web_driver_browser;

import java.util.ArrayList;
import java.util.Set;

//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandler {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String key="webdriver.chrome.driver";
		String value="C:\\Users\\PCS\\eclipse-workspace\\june_selenium\\driver\\chromedriver.exe";
String url="https://www.onlinesbi.sbi/";
System.setProperty(key, value);
WebDriver driver=new ChromeDriver();

driver.get(url);
//click on SBI Salary Account

driver.findElement(By.xpath("//a[text()='SBI Salary Account']")).click();
//click on  SBI Mutual Fund
Thread.sleep(2000);
driver.findElement(By.xpath("(//a[text()='SBI Mutual Fund'])[3]")).click();
Thread.sleep(2000);
   Set<String> ids= driver.getWindowHandles();
  for(String id:ids)
  {
	  System.out.println(id);
  }
  ArrayList <String> ar=new ArrayList<String>(ids);
  
  
  
//handling mutual fund window
	
	

  //handling of salary window
   driver.switchTo().window(ar.get(2));
    //get  text from page
   Thread.sleep(1000);
  String text= driver.findElement(By.xpath("//p[@class='font-weight-700 text-center']")).getText();
	System.out.println(text);
	Thread.sleep(2000);
	
	driver.switchTo().window(ar.get(1));
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='txtUserName']")).sendKeys("user123");
Thread.sleep(2000);

driver.switchTo().window(ar.get(2));
Thread.sleep(2000);
driver.switchTo().window(ar.get(1));

Thread.sleep(2000);
driver.switchTo().window(ar.get(0));
	
		  
	}

}
