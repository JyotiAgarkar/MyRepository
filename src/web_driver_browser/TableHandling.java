package web_driver_browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String key="webdriver.chrome.driver";
		String value="C:\\Users\\PCS\\eclipse-workspace\\june_selenium\\driver\\chromedriver.exe";
		String url="https://en.wikipedia.org/wiki/List_of_states_and_union_territories_of_India_by_population";
		
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		
		//1--print a cell
	String cell=	driver.findElement(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/tbody/tr[3]/td[2]")).getText();
	System.out.println("Cell value="+cell);
	
	//2---print column value
	System.out.println("***printing density column****");
	
	   List<WebElement> column = driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/tbody/tr/td[10]"));
	   int rowSize=column.size();
	   System.out.println("number of row "+rowSize);
	   
	   for(WebElement temp:column)
	   {
		   System.out.println(temp.getText());
	   }
	   
	   //print header
	   System.out.println("******printing header*************");
	  List<WebElement> header = driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/thead/tr[2]/th"));
	  for(WebElement temp:header)
	  {
		  System.out.print(temp.getText()+" | ");
	  
	  }
	  //System.out.println();
	  
	   //3----print row from table 6th row
	   
	  List<WebElement> row = driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/tbody/tr[6]/td"));
	  int columnSize=row.size();
	  System.out.println("number of column  "+columnSize);
	  
	  System.out.println("*********printing 6th row*********");
	  for(WebElement temp:row)
	  {
		  System.out.print(temp.getText()+" | ");
	  }
	  
	  //----Printing of fulltable
	  System.out.println("********printing full table**************");
	  for(int i=1;i<=rowSize;i++)
	  {
		  for(int j=1;j<=columnSize;j++)
		  {
		 String element=driver.findElement(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/tbody/tr["+i+"]/td["+j+"]")).getText();  
	
		  System.out.print(element+" | ");
		  }System.out.println();
	  }
	   
	}

}
