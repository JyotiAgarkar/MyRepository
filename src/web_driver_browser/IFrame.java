package web_driver_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String key="webdriver.chrome.driver";
		String value="C:\\Users\\PCS\\eclipse-workspace\\june_selenium\\driver\\chromedriver.exe";
        String url="https://demoqa.com/nestedframes";
	    System.setProperty(key, value);
	    
	    WebDriver driver=new ChromeDriver();
	    driver.get(url);
	    
	   String pageText= driver.findElement(By.xpath("//div[contains(text(),'inspecter ')]")).getText();
	   System.out.println(pageText);
	   
	    //driver.switchTo().frame(0);
//	   driver.switchTo().frame("frame1"); 
//	   String pFrame= driver.findElement(By.xpath("//body[text()='Parent frame']")).getText();
//	    System.out.println(pFrame);
//	    
	    
	   WebElement parent = driver.findElement(By.xpath("//iframe[@id='frame1']"));
	   driver.switchTo().frame(parent);
	   String pFrame= driver.findElement(By.xpath("//body[text()='Parent frame']")).getText();
  System.out.println(pFrame);
	   
  
  WebElement cframe=driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
	   driver.switchTo().frame(cframe);
	  String child= driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText();
	  System.out.println(child);
	   Thread.sleep(2000);
	   //driver.close();
	   // driver.switchTo().parentFrame();
	   driver.switchTo().defaultContent();
	    driver.close();
	    
	    
	}
	

}
