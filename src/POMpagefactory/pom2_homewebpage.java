package POMpagefactory;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class pom2_homewebpage {

	
	@FindBy (xpath="//img[@class='brand-image-xl logo-xl']")
	private WebElement logo;

	public pom2_homewebpage(WebDriver driver)
			{
		PageFactory.initElements(driver, this);
			}
public void logovlidation(WebDriver driver) throws IOException, InterruptedException
{
	Thread.sleep(2000);
boolean actulogo=Utility1.getbooleanData("Sheet1", 2, 5);
Assert.assertEquals(actulogo,logo.isDisplayed(),"TC003 fail logo not display ");


Utility1.screenshot(driver);
}


}
