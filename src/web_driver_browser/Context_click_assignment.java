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

public class Context_click_assignment {

	//private static final int OutputType = 0;

	public static void main(String[] args) throws IOException {
	
		String key="webdriver.chrome.driver";
		String value="C:\\Users\\PCS\\eclipse-workspace\\june_selenium\\driver\\chromedriver.exe";
		String url="https://www.google.com/";
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		//toget text of page
		//TakesScreenshot ts=(TakesScreenshot)driver;
		//String text=driver.findElement(By.xpath("(//div[@class=\"entry-content\"]/p)[3]")).getText();
		//System.out.println(text);
		WebElement img = driver.findElement(By.xpath("//img[@class='lnXdpd']"));
		File source=img.getScreenshotAs(OutputType.FILE);
System.out.println(source);

Date d=new Date();
String timespam=d.toString().replace(":", "_").replace(" ", "_");

File desti=new File("C:\\Users\\PCS\\eclipse-workspace\\june_selenium\\screenshot\\"+timespam+".jpg");
System.out.println(desti);
FileHandler.copy(source, desti);

		
		
	}

}
