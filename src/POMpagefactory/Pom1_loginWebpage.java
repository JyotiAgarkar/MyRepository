package POMpagefactory;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Pom1_loginWebpage {
//WebDriver driver;
	@FindBy(xpath="//input[@name='RememberMe']" )private WebElement checkbox;
	@FindBy(xpath="//input[@id='Email']")private WebElement un;
	@FindBy (xpath="//input[@name='Password']")private WebElement pwd;
	@FindBy (xpath="//button[@type='submit']")private WebElement submitButton;
	//@FindBy (xpath="")private WebElement un;
	
	public Pom1_loginWebpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//title validation
	
	public void titleValidation(WebDriver driver) throws IOException
	{
		String actutitle=Utility1.getStringData("Sheet1", 2, 1);
		Assert.assertEquals(driver.getTitle(), actutitle,"Title not matchrd TC001 fail");
	}

public void ckeckboxValidation() throws IOException
{
    boolean expchkresult=Utility1.getbooleanData("Sheet1", 2, 2);
  
    System.out.println(expchkresult);// boolean actchkresult=checkbox.isSelected();
   Assert.assertEquals(expchkresult, checkbox.isSelected(),"Default checkbox status TC002 fail");

}

public void enterun() throws IOException, InterruptedException
{
	System.out.println("clear username");
	//Thread.sleep(2000);
	un.clear();
	System.out.println(Utility1.getStringData("Sheet1", 2, 3));
	
	un.sendKeys(Utility1.getStringData("Sheet1", 2, 3));
	
	//System.out.println(Utility1.getStringData("Sheet1", 2, 3));
	}
public void enterpwd() throws IOException
{
	
	pwd.clear();
	pwd.sendKeys(Utility1.getStringData("Sheet1", 2, 4));
	
	}

//click signin button

public void clicksigninbutton()
{
	submitButton.click();	
	}
}
