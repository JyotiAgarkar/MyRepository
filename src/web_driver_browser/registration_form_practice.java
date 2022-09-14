package web_driver_browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class registration_form_practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String key="webdriver.chrome.driver";
		String value="C:\\Users\\PCS\\eclipse-workspace\\june_selenium\\driver\\chromedriver.exe";
		String url="https://mytestingthoughts.com/Sample/home.html";
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		
		String title=driver.findElement(By.tagName("h2")).getText();
		System.out.println(title);
		
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("jyoti");
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Agarkar");
		driver.findElement(By.xpath("//input[@id='inlineRadioFemale']")).click();
		//input[@id='inlineRadioFemale']
		
		WebElement hobby=driver.findElement(By.xpath("//select[@id=\"exampleFormControlSelect2\"]"));
		Select s=new Select(hobby);
		s.selectByVisibleText("Swimming");
		Thread.sleep(1000);
		
		List<WebElement> l=s.getOptions();
		 for(WebElement e:l)
		 {
			 System.out.println(e.getText());
		 }
		Thread.sleep(1000);
		WebElement office= driver.findElement(By.xpath("//select[@name='department']"));
		Select s1=new Select(office);
		Thread.sleep(1000);
		s1.selectByVisibleText("Department of Engineering");
		Thread.sleep(2000);
		//driver.close();
		
		List<WebElement> options=s1.getOptions();
		for(WebElement e:options)
		{
			System.out.println(e.getText());
		}
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("jyoti@456");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("jyoti123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='confirm_password']")).sendKeys("jyoti123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("jyoti@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='contact_no']")).sendKeys("(415)2248147");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@id='exampleFormControlTextarea1']")).sendKeys("Additional Info");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
