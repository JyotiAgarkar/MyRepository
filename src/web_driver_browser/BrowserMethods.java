package web_driver_browser;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      String key="webdriver.chrome.driver";
      String value="C:\\Users\\PCS\\eclipse-workspace\\june_selenium\\driver\\chromedriver.exe";
      String url="https://www.facebook.com/login/";
      
      System.setProperty(key,value);
      
      WebDriver driver=new ChromeDriver();
      driver.navigate().to(url);
      
      System.out.println(driver.manage().window().getSize());
      Dimension dim=driver.manage().window().getSize();
      System.out.println(dim);
      
      Thread.sleep(3000);
      
      driver.manage().window().maximize();
//System.out.println(driver.manage().window().getSize()); 

Thread.sleep(2000);
//driver.manage().window().minimize();
Dimension d1=new Dimension(600,400);
driver.manage().window().setSize(d1);
System.out.println(driver.manage().window().getSize());
Thread.sleep(3000);
System.out.println("************position***");
Point p=driver.manage().window().getPosition();
System.out.println(p);

Point p1=new Point(799,566);
driver.manage().window().setPosition(p1);
System.out.println(driver.manage().window().getPosition());
Thread.sleep(3000);
      
      driver.close();      
      
		
		
	}

}
