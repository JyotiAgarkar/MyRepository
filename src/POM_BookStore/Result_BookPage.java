package POM_BookStore;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Result_BookPage {
	
	@FindBy(xpath="//ul[@id='results']/li") 
	private List<WebElement> list;
	
	@FindBy(xpath="//h4[@class='modal-title titleContainer']")
	private WebElement name;
	
	@FindBy(xpath="//button[@class='close']")
	private WebElement close;
	
	public Result_BookPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void printBook() throws InterruptedException
	{
		for(WebElement option:list)
		{
			//System.out.println(option.getText());
			option.click();
			Thread.sleep(2000);		
			System.out.println(name.getText());
			Thread.sleep(2000);
			close.click();
	
			
		}
	}

}
