package web_driver_browser;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parametrization {
	static  Workbook wbf;
	public static String getExcelStringData(String sheetName,int rowNumber,int columnNumber) 
	{
		
		 String data=wbf.getSheet(sheetName).getRow(rowNumber-1).getCell(columnNumber-1).getStringCellValue();
		 return data;
	}
	
	

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

		//excel to cosol
		
		String excelFile="C:\\Users\\PCS\\eclipse-workspace\\june_selenium\\TestData\\file1.xlsx";
		FileInputStream file = new FileInputStream(excelFile);
	   wbf = WorkbookFactory.create(file);
	   String name=getExcelStringData("Sheet1-R",2,1);
	   System.out.println(name);
	 
	   String mname=getExcelStringData("Sheet1-R",2,2);
	   System.out.println(mname);
	  
	   String sname=getExcelStringData("Sheet1-R",2,3);
	   System.out.println(sname);
	   
	   String fatherName=getExcelStringData("Sheet1-R",2,4);
	   System.out.println(fatherName);
	   
	   String motherName=getExcelStringData("Sheet1-R",2,5);
	   System.out.println(motherName);
	   
	   String motherTounge=getExcelStringData("Sheet1-R",2,6);
	   System.out.println(motherTounge);
	   
	   String gender=getExcelStringData("Sheet1-R",2,7);
	   System.out.println(gender);
	   
	   String birthdate=getExcelStringData("Sheet1-R",2,8);
	   System.out.println(birthdate);
	   
	   String nationality=getExcelStringData("Sheet1-R",2,9);
	   System.out.println(nationality);
	   
	   String religion=getExcelStringData("Sheet1-R",2,10);
	   System.out.println(religion);
	   
	   String category=getExcelStringData("Sheet1-R",2,11);
	   System.out.println(category);
	   
	   String blood=getExcelStringData("Sheet1-R",2,12);
	   System.out.println(blood);
	   
	   
	   //consol to UI
	  
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PCS\\eclipse-workspace\\june_selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://dypatil.edu/application-form/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys(name);
		driver.findElement(By.xpath("//input[@name=\'middle_name']")).sendKeys(mname);
	   
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/form/div[2]/div[1]/div[3]/div/input")).sendKeys(sname);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/form/div[2]/div[1]/div[4]/div/input")).sendKeys(fatherName);
		
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/form/div[2]/div[1]/div[5]/div/input")).sendKeys(motherName);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/form/div[2]/div[1]/div[6]/div/input")).sendKeys(motherTounge);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/form/div[2]/div[2]/div[1]/div/label[3]/input")).click();
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/form/div[2]/div[2]/div[2]/div/input")).sendKeys(birthdate);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/form/div[2]/div[2]/div[3]/div/input")).sendKeys(nationality);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/form/div[2]/div[3]/div[1]/div/input")).sendKeys(religion);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/form/div[2]/div[3]/div[2]/label[2]/input")).click();
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/form/div[2]/div[3]/div[3]/div/input")).sendKeys(blood);
		
		
		
		
	}
	   
	
	}


