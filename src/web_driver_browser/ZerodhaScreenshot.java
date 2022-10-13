package web_driver_browser;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class ZerodhaScreenshot {
	
     @Test
	public static void main(String[] args) throws IOException {
		
		String key="webdriver.chrome.driver";
		String value="C:\\Users\\PCS\\eclipse-workspace\\june_selenium\\driver\\chromedriver.exe";
		String url="https://zerodha.com/";
		System.setProperty(key, value);
		
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		
		//take login page screenshot
		TakesScreenshot t = (TakesScreenshot)driver;
		File source=t.getScreenshotAs(OutputType.FILE);
		
		Date d= new  Date();
		String timestamp=d.toString().replace(" ", "").replace(":", "");
		File desti=new File("C:\\Users\\PCS\\eclipse-workspace\\june_selenium\\screenshot\\"+timestamp+".jpg");
		FileHandler.copy(source,desti);
		
//		logo screenshot
		WebElement e=driver.findElement(By.xpath("//img[@class='logo-img']"));
		File src=e.getScreenshotAs(OutputType.FILE);
		Date d1= new  Date();
		String timestamp1=d1.toString().replace(" ", "").replace(":", "");
		File desti1=new File("C:\\Users\\PCS\\eclipse-workspace\\june_selenium\\screenshot\\"+timestamp1+".jpg");
		FileHandler.copy(src,desti1);
		
	}

}
