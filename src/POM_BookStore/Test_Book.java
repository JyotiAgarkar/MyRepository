package POM_BookStore;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_Book {
@Test
	public void browserLaunch() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PCS\\eclipse-workspace\\june_selenium\\driver\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	driver.get("https://www.indiabookstore.net/");
	
	
	Pom_Homepage p1=new Pom_Homepage(driver);
	p1.logovalidation();
	Thread.sleep(2000);
	p1.searchBook();
	Thread.sleep(2000);
	p1.searchbutton();
	Thread.sleep(2000);
	
	Result_BookPage p2=new Result_BookPage(driver);
	p2.printBook();
	//driver.close();
	}
}
