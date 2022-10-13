package POMpagefactory;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	static WebDriver  driver=null;
	//@BeforeClass
	public static void browserLaunch() throws InterruptedException, IOException
	{
 System.setProperty("webdriver.chrome.driver", "C:\\Users\\PCS\\eclipse-workspace\\june_selenium\\driver\\chromedriver.exe");
 driver =new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

driver.get("https://admin-demo.nopcommerce.com/login");
	}
}
