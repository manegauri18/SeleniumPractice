package TestNG_Practice2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex3_keyword1_invocationCount 
{

	@Test
	public void TC1() 
	{
		Reporter.log("running TC1", true);
	}
	
	@Test
	public void TC2() 
	{
		Reporter.log("running TC2", true);
	}

	@Test(invocationCount = 5)
	public void TC3() 
	{
		Reporter.log("running TC3", true);
	}

}
