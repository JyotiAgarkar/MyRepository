package web_driver_browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CkeckListOption {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String key="webdriver.chrome.driver";
		String value="C:\\Users\\PCS\\eclipse-workspace\\june_selenium\\driver\\chromedriver.exe";
		String url="https://chercher.tech/practice/practice-dropdowns-selenium-webdriver";
		System.setProperty(key, value);
		
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		
		 WebElement productlist = driver.findElement(By.xpath("//select[@id='first']"));
		 
		Select s=new Select(productlist);
		Thread.sleep(2000);
		s.selectByValue("Apple");
		System.out.println(s.getFirstSelectedOption().getText());
		System.out.println("All product list");
		List<WebElement> alloption = s.getOptions();
		for(WebElement options:alloption)
		{
			System.out.println(options.getText());
		}
	//select multiple value
		
		 WebElement fooditem=driver.findElement(By.xpath("//select[@id='second']"));
		 Select sf= new Select(fooditem);
		 sf.selectByIndex(0);
Thread.sleep(2000);
sf.selectByValue("donut");
Thread.sleep(2000);
sf.selectByValue("bonda");
Thread.sleep(2000);
sf.deselectByValue("bonda");


		System.out.println("Selected food item"); 
		 List<WebElement> selected_food = sf.getAllSelectedOptions();
		 for(WebElement f:selected_food)
		 {
			 System.out.println(f.getText());
		 }
		 System.out.println("All food Item");
		List<WebElement> allfood = sf.getOptions(); 
		for(WebElement food:allfood)
		{
			System.out.println(food.getText());
		}
		
	}

}
