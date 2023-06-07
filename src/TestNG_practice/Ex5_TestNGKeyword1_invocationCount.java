package TestNG_practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex5_TestNGKeyword1_invocationCount 
{
	@Test(invocationCount = 7)
	public void TC1() 
	{
		Reporter.log("Running TC1 Test case");
	}

}
