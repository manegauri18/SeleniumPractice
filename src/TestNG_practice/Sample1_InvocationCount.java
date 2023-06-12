package TestNG_practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample1_InvocationCount 
{
	
	@Test  //0
	public void TC1() 
	{
		Reporter.log("Running TC1", true);
	}
	
	@Test(priority = 2)
	public void TC2() 
	{
		Reporter.log("Running TC2", true);
	}
	
	@Test(priority = -1)
	public void TC3() 
	{
		Reporter.log("Running TC3", true);
	}
	
	@Test(priority = 2)
	public void TC4() 
	{
		Reporter.log("Running TC4", true);
	}

}
