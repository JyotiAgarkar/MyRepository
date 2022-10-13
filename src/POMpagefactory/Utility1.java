package POMpagefactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility1 {

	
	
	public static String getStringData(String sheet,int row,int column) throws  IOException
	{
	String excelfile="C:\\Users\\PCS\\eclipse-workspace\\june_selenium\\TestData\\file4.xlsx";
	FileInputStream file=new FileInputStream(excelfile);
	Workbook wbf = WorkbookFactory.create(file);
	
	String data = wbf.getSheet(sheet).getRow(row-1).getCell(column-1).getStringCellValue();
	//System.out.println(data);
	return data;
	}
	
	public static boolean getbooleanData(String sheet,int row,int column) throws  IOException
	{
	String excelfile="C:\\Users\\PCS\\eclipse-workspace\\june_selenium\\TestData\\file4.xlsx";
	FileInputStream file=new FileInputStream(excelfile);
	Workbook wbf = WorkbookFactory.create(file);
	
	boolean data = wbf.getSheet(sheet).getRow(row-1).getCell(column-1).getBooleanCellValue();
	//System.out.println(data);
	return data;
	}
	
	public static  void screenshot(WebDriver  driver) throws IOException
	{
	  TakesScreenshot ts=(TakesScreenshot)driver;
	  File source=ts.getScreenshotAs(OutputType.FILE);
	  
	  Date d=new Date();
	  String timestamp=d.toString().replace(" ", "_").replace(":","_");
	  File desti=new File("C:\\Users\\PCS\\eclipse-workspace\\june_selenium\\screenshot\\"+timestamp+".jpg");
	  FileHandler.copy(source,desti);
	}
}
	
