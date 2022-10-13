package POMpagefactory;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestClass1 extends BaseClass {
	
	Pom1_loginWebpage p1;
	pom2_homewebpage p2;
@BeforeClass
	public void browserOpen() throws InterruptedException, IOException
	{
	browserLaunch();
	 p1=new Pom1_loginWebpage(driver);
	 p2=new pom2_homewebpage( driver);
	
	}

@Test
	public void  titleValidate() throws IOException
	{
	p1.titleValidation(driver);
	}

@Test
public void loginvalidate() throws IOException, InterruptedException
{
	
p1.enterun();
Thread.sleep(2000);
p1.enterpwd();
Thread.sleep(2000);
p1.clicksigninbutton();
Thread.sleep(2000);
}

@Test
public void ckeckvalidation() throws IOException
{
p1.ckeckboxValidation();
}

@Test(dependsOnMethods="loginvalidate")
public void logovarify() throws IOException, InterruptedException
{
	
p2.logovlidation(driver);
Thread.sleep(2000);
}
@AfterClass
public void browserclose()
{
	driver.close();
	}





}


