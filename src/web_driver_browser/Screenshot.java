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

import net.bytebuddy.utility.RandomString;

public class Screenshot {

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String key="webdriver.chrome.driver";
		String value="C:\\Users\\PCS\\eclipse-workspace\\june_selenium\\driver\\chromedriver.exe";
		String url="https://www.amazon.in/";
		System.setProperty(key, value);
		
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		
		//TakesScreenshot t = (TakesScreenshot)driver;
	
		// File source=t.getScreenshotAs(OutputType.FILE);
		// System.out.println(source);
//		 File desti=new File("C:\\Users\\PCS\\eclipse-workspace\\june_selenium\\screenshot\\aspire.jpg");
//		 FileHandler.copy(source, desti);
		 
		 //unique file name
		 
		// Date d=new Date();
	//	String timestamp= d.toString().replace(" ", "").replace(":", "");
		//File desti=new File("C:\\Users\\PCS\\eclipse-workspace\\june_selenium\\screenshot\\"+timestamp+".jpg");
		
		// FileHandler.copy(source,desti);
		 
		 //random string make filename
		 
		 
      WebElement element=driver.findElement(By.xpath("//div[@id='desktop-grid-2']"));
      File src=element.getScreenshotAs(OutputType.FILE);
      String randomname=RandomString.make(3);
		File desti=new File("C:\\Users\\PCS\\eclipse-workspace\\june_selenium\\screenshot\\"+randomname+".jpg");
FileHandler.copy(src, desti);
	}

}
