package web_driver_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_drop_scroll_mouse {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String key="webdriver.chrome.driver";
		String value="C:\\Users\\PCS\\eclipse-workspace\\june_selenium\\driver\\chromedriver.exe";
		String url="https://demoqa.com/droppable";
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='droppableExample-tab-preventPropogation']")).click();
		Thread.sleep(2000);
		WebElement dragItem = driver.findElement(By.xpath("//div[@id='dragBox']"));
Thread.sleep(2000);
		WebElement dropItem = driver.findElement(By.xpath("//div[@id='notGreedyInnerDropBox']"));
	Actions act=new Actions(driver);
	act.dragAndDrop(dragItem, dropItem).perform();
   // act.moveToElement(dragItem).clickAndHold().moveToElement(dropItem).release().build().perform();
	}

}
