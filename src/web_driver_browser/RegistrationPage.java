package web_driver_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationPage {
	
	  public static void registartion()
	  {
		  
	  }
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String key="webdriver.chrome.driver";
		String value="C:\\Users\\PCS\\eclipse-workspace\\june_selenium\\driver\\chromedriver.exe";
		String url="http://dypatil.edu/application-form/";
		
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		//check logo is displayed
		boolean logo=driver.findElement(By.xpath("//img[@class='logo']")).isDisplayed();
		System.out.println("logo is displayed"+logo);
		
		//print text on console
		String schoolname=driver.findElement(By.xpath("//h1[text()='School of Admission']")).getText();
		
		System.out.println(schoolname);
		
		//personal details
		driver.findElement(By.xpath("//input[@name=\"first_name\"]")).sendKeys("Jyoti");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name=\"middle_name\"]")).sendKeys("Yogesh");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='surname']")).sendKeys("Agarkar");
		Thread.sleep(1000);
		//fatherName
		driver.findElement(By.xpath("//input[@name='father_name']")).sendKeys("Satish");
		Thread.sleep(1000);
		//motherName
		driver.findElement(By.xpath("//input[@name=\'mother_name\']")).sendKeys("Rohini");
		Thread.sleep(1000);
		//mothertounge
		driver.findElement(By.xpath("//input[@name=\'mother_tongue\']")).sendKeys("Marathi");
		Thread.sleep(1000);
	//gender	
	driver.findElement(By.xpath("(//input[@name='gender'])[2]")).click();
	Thread.sleep(1000);
	//driver.findElement(By.xpath("//input[@name=\"dob\"]")).click();

	//nationality
	driver.findElement(By.xpath("//input[@name='nationality']")).sendKeys("Indian");
	//religion
	driver.findElement(By.xpath("//input[@name=\"religion\"]")).sendKeys("Hindu");
	Thread.sleep(2000);
	
	//category
	driver.findElement(By.xpath("//input[@value=\"Open\"]")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@name=\"blood_group\"]")).sendKeys("B+");
	
	//house number
	driver.findElement(By.xpath("//input[@name=\"address_line_one\"]")).sendKeys("B/1903");
	//country
	//driver.findElement(By.xpath("")).sendKeys("India");
	//society
	driver.findElement(By.xpath("//input[@name=\"address_line_two\"]")).sendKeys("Crystal Arms");
	//state
	driver.findElement(By.xpath("//input[@name=\"address_state\"]")).sendKeys("Maharashtra");
	//city
	driver.findElement(By.xpath("//input[@name=\"address_city\"]")).sendKeys("Mumbai");
	//district
	
	driver.findElement(By.xpath("//input[@name=\"address_district\"]")).sendKeys("pune");
	//puncode
	driver.findElement(By.xpath("//input[@name=\"address_pincode\"]")).sendKeys("400088");
	//radio -hostel required
	driver.findElement(By.xpath("(//input[@name=\"hostel_required\"])[2]")).click();
	
	//subject 
	driver.findElement(By.xpath("(//input[@name=\"class_x_subject[]\"])[1]")).sendKeys("marathi");
	driver.findElement(By.xpath("(//input[@name=\"class_x_subject[]\"])[2]")).sendKeys("English");
	driver.findElement(By.xpath("(//input[@name=\"class_x_subject[]\"])[3]")).sendKeys("Maths");
	driver.findElement(By.xpath("(//input[@name=\"class_x_subject[]\"])[4]")).sendKeys("Histry");
	driver.findElement(By.xpath("(//input[@name=\"class_x_subject[]\"])[5]")).sendKeys("Science");
	driver.findElement(By.xpath("(//input[@name=\"class_x_subject[]\"])[6]")).sendKeys("Geography");
	driver.findElement(By.xpath("(//input[@name=\"class_x_subject[]\"])[7]")).sendKeys("Geography");
	driver.findElement(By.xpath("(//input[@name=\"class_x_subject[]\"])[8]")).sendKeys("EVS");
	driver.findElement(By.xpath("(//input[@name=\"class_x_subject[]\"])[9]")).sendKeys("General Knowledge");
	driver.findElement(By.xpath("(//input[@name=\"class_x_subject[]\"])[10]")).sendKeys("Unix");
	driver.findElement(By.xpath("(//input[@name=\"class_x_subject[]\"])[11]")).sendKeys("testing");
	
	
		
	

	}

}
