package Framework_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class parameterization {
	
	WebDriver driver;
	@BeforeClass
	void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\PCS\\\\eclipse-workspace\\\\june_selenium\\\\driver\\\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	driver.get("https://www.facebook.com/login/");
	}

	@Test(priority=1)
	void logoTest()
	{
		WebElement logo = driver.findElement(By.xpath("//img[@alt='Facebook']"));
		Assert.assertTrue(logo.isDisplayed(),"Logo not displayed");
	
	}
	
	@Test(priority=2)
	void homepageTitle()
	{
		String title=driver.getTitle();
		Assert.assertEquals("Log1 in to Facebook", title,"title not match");
	}
	@AfterClass
	void teardown()
	{
		driver.close();
	}
	
	
}
