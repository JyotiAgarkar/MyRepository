package Practice_Code;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Simple_form {



	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		String key="webdriver.chrome.driver";
		String value="C:\\Users\\PCS\\eclipse-workspace\\june_selenium\\driver\\chromedriver.exe";
		String url="https://www.globalsqa.com/samplepagetest/";
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='g2599-name']")).sendKeys("jyoti");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='g2599-email']")).sendKeys("jyoti@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='g2599-website']")).sendKeys("https://demoqa.com/webtables");

		WebElement experience = driver.findElement(By.xpath("//select[@id='g2599-experienceinyears']"));
		Select s=new Select(experience);
		s.selectByValue("1-3");
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//input[@value='Automation Testing']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Manual Testing']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Post Graduate']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		
		Alert alt=driver.switchTo().alert();
Thread.sleep(2000);
		alt.accept();
		
		
Alert alt1=driver.switchTo().alert();
alt1.accept();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//textarea[@class='textarea']")).sendKeys("hi,this  is practice code");
		
		driver.findElement(By.xpath("//button[@class=\"pushbutton-wide\"]")).click();
		
		Thread.sleep(3000);
		
		
	TakesScreenshot ts=(TakesScreenshot)driver;
	 File source=ts.getScreenshotAs(OutputType.FILE);
	 
	 
	 Thread.sleep(2000);
	 Date d=new Date();
	 String timestamp=d.toString().replace(":","_").replace(" ", "_");
	 File desti=new File("C:\\Users\\PCS\\eclipse-workspace\\june_selenium\\screenshot\\"+timestamp+".jpg");
	FileHandler.copy(source, desti);
	
	}

}
