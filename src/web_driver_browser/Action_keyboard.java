package web_driver_browser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Action_keyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String key="webdriver.chrome.driver";
		String value="C:\\Users\\PCS\\eclipse-workspace\\june_selenium\\driver\\chromedriver.exe";
		String url="https://www.facebook.com/login/";
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.get(url);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		int size=driver.findElements(By.xpath("//select[@id='month']/option")).size();
		
		Actions act=new Actions(driver);
		
		act.click(month).perform();
		for(int i=1;i<=size;i++)
		{
			act.sendKeys(Keys.ARROW_DOWN).perform();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			
		}
		for(int i=1;i<=6;i++)
			
		{
			act.sendKeys(Keys.ARROW_UP).perform();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			
		}
		act.sendKeys(Keys.ENTER).perform();	
		
}
		
		
	
}
