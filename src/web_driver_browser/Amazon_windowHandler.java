package web_driver_browser;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_windowHandler {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String key="webdriver.chrome.driver";
		String value="C:\\Users\\PCS\\eclipse-workspace\\june_selenium\\driver\\chromedriver.exe";
		String url="https://www.amazon.in/";
		
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Samsung mobile");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	   driver.findElement(By.xpath("//span[contains(text(),'Samsung Galaxy M13')]")).click();
	   driver.findElement(By.xpath("//span[contains(text(),'Samsung Galaxy M32 5G')]")).click();
	   driver.findElement(By.xpath("//span[contains(text(),'Samsung Galaxy M13')]")).click();
	   
	  Set <String> ids=driver.getWindowHandles();
	  for(String id:ids)
	  {
		  System.out.println(id);
	  }
	   
	  ArrayList<String> arl= new ArrayList <String>(ids);	
	  driver.switchTo().window(arl.get(2));    //M32 mobile
	  
	  String deliverydate=driver.findElement(By.xpath("(//span[@class='a-text-bold'])[3]")).getText();
	  System.out.println(deliverydate);
	
	driver.switchTo().window(arl.get(1));
	Thread.sleep(2000);
	driver.switchTo().window(arl.get(3));
	Thread.sleep(2000);
	driver.switchTo().window(arl.get(2));
	Thread.sleep(2000);
	driver.switchTo().window(arl.get(0));
	
	}
	
	

}
