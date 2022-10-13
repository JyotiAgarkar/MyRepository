package web_driver_browser;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String key="webdriver.chrome.driver";
		String value="C:\\Users\\PCS\\eclipse-workspace\\june_selenium\\driver\\chromedriver.exe";
		String url="https://www.google.com/";
		System.setProperty(key, value);
		String expoption="flipkart big billion days";
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("flipkart");
		Thread.sleep(2000);
		
	 List<WebElement> auto = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		System.out.println("size is "+auto.size());
		System.out.println("Lst of auto option");
		for(WebElement option:auto)
		{
			System.out.println(option.getText());
			
		}
			
		TreeSet<String> tr=new TreeSet<String>();
		for(WebElement option:auto)
		{
			tr.add(option.getText());
		}
		System.out.println(tr);
		
		for(WebElement option:auto)
		{
			String actoption=option.getText();
			if(expoption.equals(actoption))
			{
				option.click();
				Thread.sleep(2000);
				break;
			}
		}
	}

}
