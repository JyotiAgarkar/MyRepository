package Framework_TestNG;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class sample1 {
	
	@Test
	public void method1()
	{
		System.out.println("method1");
		
	}

	@Test
	public void method2()
	{
		System.out.println("method2");
	}
	@BeforeMethod
	public void method3()
	{
		System.out.println("method3");
	}
	@BeforeSuite
	public void method4()
	{
		System.out.println("method4");
	}
	@BeforeClass
	public void method5()
	{
		System.out.println("method5");
	}
	@BeforeTest
	public void method6()
	{
		System.out.println("method6");
	}
	@BeforeGroups
	public void method7()
	{
		System.out.println("method7");
	}
	
	






}
