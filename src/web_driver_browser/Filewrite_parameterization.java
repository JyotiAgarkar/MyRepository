package web_driver_browser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Filewrite_parameterization {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PCS\\eclipse-workspace\\june_selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://dypatil.edu/application-form/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		String house=driver.findElement(By.xpath("//*[text()='House No./Street']")).getText();
		System.out.println(house);
		
		String country=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/form/div[2]/div[4]/div[2]/div[1]/label")).getText();
		System.out.println(country);
		
		String village=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/form/div[2]/div[4]/div[1]/div[2]/label")).getText();
		System.out.println(village);
		
		String state=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/form/div[2]/div[4]/div[2]/div[2]/label")).getText();
		System.out.println(state);
		
		String city=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/form/div[2]/div[4]/div[1]/div[3]/label")).getText();
		System.out.println(city);
		
		String district=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/form/div[2]/div[4]/div[2]/div[3]/label")).getText();
		System.out.println(district);
		
		String pincode=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/form/div[2]/div[4]/div[1]/div[4]/label")).getText();
		System.out.println(pincode);
		
		String hostel=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/form/div[2]/div[4]/div[2]/div[4]/label[1]")).getText();
		System.out.println(hostel);
		
		
		//UI tofile
		
		String excelfile="C:\\Users\\PCS\\eclipse-workspace\\june_selenium\\TestData\\file1.xlsx";
		FileInputStream file=new FileInputStream(excelfile);
		Workbook wbf = WorkbookFactory.create(file);
		
		wbf.getSheet("Sheet2-W").createRow(0).createCell(1).setCellValue(house);
		//wbf.getSheet("Sheet2-W").createRow(1).createCell(1).setCellValue(country);
		//wbf.getSheet("Sheet2-W").createRow(2).createCell(1).setCellValue(village);
//		wbf.getSheet("Sheet2-W").createRow(4).createCell(0).setCellValue(state);
//		wbf.getSheet("Sheet2-W").createRow(5).createCell(0).setCellValue(city);
//		wbf.getSheet("Sheet2-W").createRow(6).createCell(0).setCellValue(district);
//		wbf.getSheet("Sheet2-W").createRow(7).createCell(0).setCellValue(pincode);
//		wbf.getSheet("Sheet2-W").createRow(8).createCell(0).setCellValue(hostel);
	
      FileOutputStream outfile=new FileOutputStream(excelfile);
		wbf.write(outfile);
		
		//wbf.close();
		System.out.println("writing done");	
		
		
	}
		

}
