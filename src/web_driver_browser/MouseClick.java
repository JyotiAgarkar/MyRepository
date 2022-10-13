package web_driver_browser;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseClick {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
String key="webdriver.chrome.driver";
String value="C:\\Users\\PCS\\eclipse-workspace\\june_selenium\\driver\\chromedriver.exe";
String url="https://demo.guru99.com/test/simple_context_menu.html";
System.setProperty(key, value);
WebDriver driver=new ChromeDriver();
driver.get(url);

//double click on button


WebElement doubleClickonButton = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
Thread.sleep(2000);
Actions act=new Actions(driver);
act.moveToElement(doubleClickonButton).doubleClick().build().perform();

     Alert alt =driver.switchTo().alert();
     alt.accept();
     
     
     //context click----right click
     Thread.sleep(2000);
     WebElement contextClickonButton = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
    Thread.sleep(2000);
     act.moveToElement(contextClickonButton).contextClick().build().perform();
     // act.contextClick().perform();
    // act.contextClick(contextClickonButton).perform();
	}

}
