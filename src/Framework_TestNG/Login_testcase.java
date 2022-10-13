package Framework_TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login_testcase {
  
	WebDriver driver;
	
	@Test(priority=1)
	public void browserLaunch() throws IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PCS\\eclipse-workspace\\june_selenium\\driver\\chromedriver.exe");
	driver= new ChromeDriver();
	
	Properties obj= new Properties();
	
FileInputStream file=new FileInputStream(
System.getProperty("user.dir")+"\\config.properties");
obj.load(file);

	driver.get(obj.getProperty("url"));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}
	@Test(priority=2)
	public void enterUser() throws InterruptedException
	{
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("jyoti@gmail.com");
	Thread.sleep(2000);
	}
	@Test(priority=3)
	public void enterPwd() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("jyoti123");
		Thread.sleep(2000);
	}
	@Test(priority=4)
	public void clickLogin() throws InterruptedException
	{
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(2000);
	}
	@Test(priority=5)
	public void closeBrowser()
	{
		driver.close();
	}
	
}
