package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex3_EmailableReport 
{
	@Test
	public void TC1()    //test case or test method
	{
		//System.out.println("Running TC1 Test case");
		Reporter.log("Running TC1 Test case", true);
	}
	
	
	@Test
	public void TC2()     //test case or test method
	{
		//System.out.println("Running TC2 Test case");
		Reporter.log("Running TC2 Test case", true);
	}
	
	
	@Test
	public void TC3()    //test case or test method
	{
		//System.out.println("Running TC3 Test case");
		Reporter.log("Running TC3 Test case", true);
	}

}
