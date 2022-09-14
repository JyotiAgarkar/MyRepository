package web_driver_browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String key="webdriver.chrome.driver";
		String value="C:\\Users\\PCS\\eclipse-workspace\\june_selenium\\driver\\chromedriver.exe";

		String url="https://www.amazon.in/";
		System.setProperty(key, value);
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to(url);
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		driver.navigate().back();//flipkart
		Thread.sleep(3000);
		
		driver.navigate().back();//amazon
		Thread.sleep(3000);
		
		driver.navigate().forward();//flipkart
		Thread.sleep(3000);
		
		driver.navigate().forward();//facebook
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		driver.close();
		
		
		
		
		
	}

}
