package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex5_TestNGKeyword2_EnableFalse
{
	@Test
	public void TC1() 
	{
	    Reporter.log("Running TC1 Test case", true);	
	}
	
	@Test
	public void TC2() 
	{
	    Reporter.log("Running TC2 Test case", true);	
	}
	
	
	@Test(enabled = false)
	public void TC3() 
	{
	    Reporter.log("Running TC3 Test case", true);	
	}

}
