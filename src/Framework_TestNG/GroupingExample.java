package Framework_TestNG;

import org.testng.annotations.Test;

public class GroupingExample {

	@Test(groups= {"sanity"})
	void tc1()
	{
		System.out.println("This is test case 1");
	}
	
	@Test(groups= {"sanity"})
	void tc2()
	{
		System.out.println("This is test case 2");
	}
	@Test(groups= {"regression"})
	void tc3()
	{
		System.out.println("This is test case 3");
	}
	@Test(groups= {"regression"})
	void tc4()
	{
		System.out.println("This is test case 4");
	}
	
	@Test(groups= {"sanity","regression"})
	void tc5()
	{
		System.out.println("This is test case 5");
	}
	@Test
	void tc6()
	{
		System.out.println("This is test case 6");
	}
	
}
