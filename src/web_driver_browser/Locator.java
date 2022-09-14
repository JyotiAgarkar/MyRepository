package web_driver_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	String key="webdriver.chrome.driver";
	String value="C:\\Users\\PCS\\eclipse-workspace\\june_selenium\\driver\\chromedriver.exe";
	String url="https://www.facebook.com/login/";
	
	System.setProperty(key, value);
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get(url);
	
    driver.findElement(By.id("email")).sendKeys("jyyotisgaikwad@gmail.com");
    driver.findElement(By.name("pass")).sendKeys("22feb2020");
    Thread.sleep(2000);
	
    String s= driver.findElement(By.id("loginbutton")).getText();
    System.out.println(s);
    Thread.sleep(1000);
  //  driver.findElement(By.tagName("button")).click();
    //driver.findElement(By.id("loginbutton")).click();
    
   // driver.findElement(By.linkText("Forgotten account?")).click();
   // driver.findElement(By.partialLinkText("Forgot")).click();
   driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
    
    
	}

}
