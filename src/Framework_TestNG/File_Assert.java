package Framework_TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class File_Assert {
	
	Workbook wbf;
	FileInputStream file;
	String name;
	@Test
	public void readfile() throws EncryptedDocumentException, IOException
	{
		file=new FileInputStream("C:\\Users\\PCS\\eclipse-workspace\\june_selenium\\TestData\\file3.xlsx");
        wbf=WorkbookFactory.create(file);
      name = wbf.getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();
	 if(name.equals(null))
		 System.out.println("no name avilable");
	 else System.out.println(name);
	  wbf.close();
	}
	
	@Test
public void writefile() throws IOException
{
	String name1="Agarkar";
	FileOutputStream file=new FileOutputStream("C:\\Users\\PCS\\eclipse-workspace\\june_selenium\\TestData\\file3.xlsx");
wbf.getSheetAt(0).createRow(3).createCell(1).setCellValue(name1);	
wbf.write(file);
wbf.close();
}	
}
	
	

