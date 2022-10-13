package Framework_TestNG;

import static org.testng.Assert.fail;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Screenshot {
	
	WebDriver driver;
	@Test
	public void launchBroswer()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PCS\\eclipse-workspace\\june_selenium\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	Reporter.log("Amazon broswer lanch");
	}
	@Test
	public void screenShot() throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		 File source=ts.getScreenshotAs(OutputType.FILE);
		File desti=new File("C:\\Users\\PCS\\eclipse-workspace\\june_selenium\\screenshot\\AlS.jpg");
		FileHandler.copy(source, desti);
		Reporter.log("screenshot taken");
	}
	@Test(enabled=true)
	public void mobileClick()
	{
		driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
		Reporter.log("click on mobile");
		
	}
	@Test
	public void login()
	{
		//Assert.fail();
		driver.findElement(By.xpath("")).click();
		Reporter.log("login to application");
	}
	@Test(dependsOnMethods="login")
	public void logout()
	{
		Reporter.log("log out from app");
	}
	

}
