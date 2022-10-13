package web_driver_browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String key="webdriver.chrome.driver";
		String value="C:\\Users\\PCS\\eclipse-workspace\\june_selenium\\driver\\chromedriver.exe";
String url="https://www.facebook.com/r.php?locale=en_GB&display=page";
		
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("jyoti");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Agarkar");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9819773650");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("pass123");
		
		//select date
		
	WebElement day=	driver.findElement(By.xpath("//select[@id='day']"));
		Select s=new Select(day);
		s.selectByValue("31");
		Thread.sleep(1000);
		List<WebElement> l=s.getOptions();
		for(WebElement e:l) 
		{
			System.out.println(e.getText());
		}
		WebElement month=	driver.findElement(By.xpath("//select[@id='month']"));
		Select s1=new Select(month);
		s1.selectByValue("12");
		Thread.sleep(1000);
	List<WebElement> l1=s.getOptions();
	for(WebElement e:l1)
	{
	System.out.println(e.getText());	
	}
		
		WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
		Select s3=new Select(year);
		s3.selectByValue("1988");
	
		List<WebElement> l2=s3.getOptions();
		for(WebElement e:l2)
		{
			System.out.println(e.getText());
		}
		
		
		
		//gender Selection
		
		driver.findElement(By.xpath("//input[@type='radio' and @value='1']")).click();
		
		//sign in button
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
		
	}

}
