package web_driver_browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class MouseHoveronFlipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String key="webdriver.chrome.driver";
		String value="C:\\Users\\PCS\\eclipse-workspace\\june_selenium\\driver\\chromedriver.exe";
		String url="https://www.flipkart.com/";
		
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		
		Actions act=new Actions(driver);
//		//mouse hover an all menu
//		List<WebElement> allMenu = driver.findElements(By.xpath("//div[@class='_37M3Pb']/div"));
//		System.out.println("List of all Menu:");
//		for (WebElement menu:allMenu)
//		{
//			act.moveToElement(menu).perform();
//			System.out.println(menu.getText());
//			Thread.sleep(3000);
//		
//		}
//		
		
		//mouse hover on fation element
				WebElement fasionmenu = driver.findElement(By.xpath("(//div[@class='eFQ30H'])[4]"));
				act.moveToElement(fasionmenu).perform();
				Thread.sleep(2000);
		
				WebElement menFootwear = driver.findElement(By.xpath("(//div[@class='_3XS_gI _7qr1OC']/a)[5]"));
		       
				act.moveToElement(menFootwear).perform();
		        Thread.sleep(2000);
		        System.out.println("****List of option in Mens Footwear********");
		List<WebElement> allOptionMenFootwear = driver.findElements(By.xpath("//div[@class='_3XS_gI']/a"));
		Thread.sleep(1000);
		for(WebElement option:allOptionMenFootwear)
		{
			act.moveToElement(option).perform();
			Thread.sleep(1000);
			System.out.println(option.getText());
		}
		
	}

	}


