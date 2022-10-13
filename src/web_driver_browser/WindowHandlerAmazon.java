package web_driver_browser;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlerAmazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String key="webdriver.chrome.driver";
		String value="C:\\Users\\PCS\\eclipse-workspace\\june_selenium\\driver\\chromedriver.exe";
String url="https://www.amazon.in/";
System.setProperty(key, value);
WebDriver driver=new ChromeDriver();

driver.get(url);
driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Kids wear");
driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
String parentid=driver.getWindowHandle();
System.out.println("parent id="+parentid);


driver.findElement(By.xpath("//span[contains(text(),'Printed Motorcade')]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//span[contains(text(),'Baby Girls Frocks')]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//span[contains(text(),'Unisex Baby Cotton')] ")).click();


      Set<String> ids = driver.getWindowHandles();
      for(String id:ids)
      {
    	  System.out.println(id);
      }
      
      ArrayList<String>  arl=new ArrayList<String>(ids);
      
      driver.switchTo().window(arl.get(1));
      
     String productName1= driver.findElement(By.xpath("//span[@id='productTitle']")).getText();
System.out.println("Product name=="+productName1);
System.out.println();
        driver.switchTo().window(arl.get(2));
        String productName2= driver.findElement(By.xpath("//span[@id='productTitle']")).getText();
        System.out.println("Product name=="+productName2);
        
        System.out.println();
        driver.switchTo().window(arl.get(3));
        String productName3= driver.findElement(By.xpath("//span[@id='productTitle']")).getText();
        System.out.println("Product name=="+productName3);
        
        
        Thread.sleep(2000);
        driver.switchTo().window(arl.get(0));
        Thread.sleep(2000);
    driver.quit();
	}

}
