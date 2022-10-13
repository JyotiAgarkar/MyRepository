package Framework_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_practice {
	WebDriver driver;
	
@Test
	public void hardAssert()
	{
		String actualtxt="Google";
		Assert.assertEquals(actualtxt, driver.getTitle(),"not Equal");
		//Reporter.log("title not equal",true);//prog terminate if not equal
	}

@Test
public void softAssert()
{
	SoftAssert sftasrt=new SoftAssert();
	String actualtxt="Google";
	sftasrt.assertEquals(actualtxt, driver.getTitle(),"not Equal");
	//Reporter.log("sft assert title not equal",true);//prg will not terminate
	sftasrt.assertAll();//thow exception that test case fail.if not written test case will be shown as pass
	
	}
@BeforeClass
public void launchBrowser()
{

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\PCS\\eclipse-workspace\\june_selenium\\driver\\chromedriver.exe");
  driver=new ChromeDriver();
	driver.manage().window().maximize();
  driver.get("https://www.google.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
}
@AfterClass
public void closeBrowser()
{
	driver.close();
}



@Test
public void imagedisply()
{
	WebElement img = driver.findElement(By.xpath("//img[@alt='Google']"));
	Assert.assertTrue(img.isDisplayed(), "img not visible");
	}


}
