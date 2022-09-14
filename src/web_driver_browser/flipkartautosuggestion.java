package web_driver_browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartautosuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String key="webdriver.chrome.driver";
		String value="C:\\Users\\PCS\\eclipse-workspace\\june_selenium\\driver\\chromedriver.exe";
		String url="https://www.flipkart.com/";
		System.setProperty(key, value);
		//String expoption="flipkart big billion days";
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		
	Thread.sleep(2000);
		List<WebElement> module = driver.findElements(By.xpath("//div[@class=\"_37M3Pb\"]/div"));
Thread.sleep(2000);
		System.out.println(module.size());
System.out.println("name of module");
		for(WebElement option:module)
		{
			System.out.println(option.getText());
		}
		
		
	}

}
