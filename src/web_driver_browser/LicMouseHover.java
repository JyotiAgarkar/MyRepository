package web_driver_browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LicMouseHover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String key="webdriver.chrome.driver";
		String value="C:\\Users\\PCS\\eclipse-workspace\\june_selenium\\driver\\chromedriver.exe";
		String url="https://licindia.in/";
		
		
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(3000);
		
		WebElement menu = driver.findElement(By.xpath("(//li[@class='bar has-sub'])[3]"));
		
		Actions act=new Actions(driver);
		act.moveToElement(menu).perform();
		Thread.sleep(2000);
		
		                                                                     
	List<WebElement> manyOption = driver.findElements(By.xpath("(//li[@class=\"bar has-sub\"])[3]/ul/li"));			
	Thread.sleep(2000);	
	for(WebElement option:manyOption)
	{
		act.moveToElement(option).perform();
		Thread.sleep(1000);
		System.out.println(option.getText());
	}
	}

}
