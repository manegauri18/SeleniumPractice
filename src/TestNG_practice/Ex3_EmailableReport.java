package TestNG_practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex3_EmailableReport 
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

	
	@Test
	public void TC3() 
	{
		Reporter.log("Running TC3 Test case", true);
	}


}
