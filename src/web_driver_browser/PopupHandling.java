package web_driver_browser;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String key="webdriver.chrome.driver";
		String value="C:\\Users\\PCS\\eclipse-workspace\\june_selenium\\driver\\chromedriver.exe";
		String url="https://chandanachaitanya.github.io/selenium-practice-site/?vehicle5=Sedan&languages=Java&enterText=";
		System.setProperty(key, value);
		
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		
		driver.findElement(By.xpath("//button[@id='alertBox']")).click();
		
		Thread.sleep(2000);
		
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		
		//confirm button
		
		driver.findElement(By.xpath("//button[@id='confirmBox']")).click();
		Thread.sleep(2000);
		
		Alert cnf=driver.switchTo().alert();
		
		System.out.println(cnf.getText());
		
cnf.accept();


//prompt box
driver.findElement(By.xpath("//button[@id='promptBox']")).click();
Thread.sleep(2000);
Alert prompt=driver.switchTo().alert();
System.out.println(prompt.getText());
prompt.accept();
		}

}
