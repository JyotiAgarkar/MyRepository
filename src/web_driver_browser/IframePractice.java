package web_driver_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IframePractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String key="webdriver.chrome.driver";
		String value="C:\\Users\\PCS\\eclipse-workspace\\june_selenium\\driver\\chromedriver.exe";
		String url="https://chercher.tech/practice/frames-example-selenium-webdriver";
		
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		
		driver.get(url);
	//2.To print Webpage tilte on cosol	
		String title=driver.findElement(By.xpath("//h1[@class='breadcrumb-item']")).getText();
		System.out.println(title);
		
		//3.Enter text in topic elenemt
		
	driver.switchTo().frame("frame1");
	Thread.sleep(2000);
	driver.findElement(By.tagName("input")).sendKeys("Jyoti Agarkar");
	Thread.sleep(2000);
	
	//4.click checkbox
	 //1.driver swich to chlid frame
	driver.switchTo().frame("frame3");
	driver.findElement(By.xpath(" //input[@type='checkbox']")).click();
	Thread.sleep(1000);
	
	//driver swictch to main webpage
	driver.switchTo().defaultContent();
	
	//5.Selct babycat 
	//driver pointing to animal frame
	
	driver.switchTo().frame("frame2");
	//find webelenment list and pass it to Select class
	WebElement list=driver.findElement(By.xpath(" //select[@id='animals']"));
	Select s=new Select(list);
	s.selectByValue("babycat");
	Thread.sleep(3000);
	//6.Uncheck the checkbox
	//1.driver switch to mainpage
	driver.switchTo().defaultContent();
	
	//driver switch to frame1
	driver.switchTo().frame("frame1");
	driver.switchTo().frame("Frame3");
	boolean x=driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
	System.out.println("checkbox selected "+x);
	if (x==true)
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Thread.sleep(2000);
	}
	driver.switchTo().defaultContent();
	driver.close();
	}

}
