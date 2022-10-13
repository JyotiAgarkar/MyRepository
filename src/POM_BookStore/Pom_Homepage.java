package POM_BookStore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Pom_Homepage {
	
	@FindBy(xpath="(//img[@alt='IndiaBookStore'])[2]") private WebElement logo;
	@FindBy(xpath="//input[@id='searchBox']") private WebElement searchbar;
	@FindBy(xpath="//button[@id='searchButtonInline']") private WebElement searchButton;

	public Pom_Homepage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void logovalidation()
	{
		boolean actullogo=true;
		Assert.assertEquals(actullogo, logo.isDisplayed(),"TC001 Fail logo not displayed");
	}
	
	public void searchBook()
	{
		searchbar.sendKeys("Rich dad poor dad");
	}
	
	public void searchbutton()
	{
		searchButton.click();
	}
}
