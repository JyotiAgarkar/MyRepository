package web_driver_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeCode {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String key="webdriver.chrome.driver";
		String value="C:\\Users\\PCS\\eclipse-workspace\\june_selenium\\driver\\chromedriver.exe";
		String url="https://www.facebook.com/login/";
		System.setProperty(key,value);
		
		WebDriver driver=new ChromeDriver();
		driver.get(url);
//		
//		System.out.println("page title "+driver.getTitle());
//		System.out.println("Page URL is "+driver.getCurrentUrl());
//		System.out.println("Page Source "+driver.getPageSource());
		
//	driver.navigate().to("https://mail.google.com/mail/u/0/#inbox");
//	driver.navigate().back();
//	Thread.sleep(1000);
//	driver.navigate().forward();
//	Thread.sleep(1000);
//	driver.navigate().refresh();
//	
//	driver.manage().window().maximize();
//	driver.manage().window().minimize();
//	System.out.println("size of window "+driver.manage().window().getSize());
//	System.out.println("position of window "+driver.manage().window().getPosition());
//	
//	Dimension d=new Dimension(678,999);
//	driver.manage().window().setSize(d);
//	
//	Point p=new Point(678,566);
//	driver.manage().window().setPosition(p);
//	
	boolean b=driver.findElement(By.tagName("img")).isDisplayed();
	System.out.println("image present "+b);
	
	String s=driver.findElement(By.xpath("//div[text()='Log in to Facebook']")).getText();
	System.out.println(s);
	driver.findElement(By.id("email")).sendKeys("fdgwh@gmail.com");
	driver.findElement(By.partialLinkText("Forgo")).click();
	//driver.findElement(By.linkText("Forgotten account?")).click();
	}

}
