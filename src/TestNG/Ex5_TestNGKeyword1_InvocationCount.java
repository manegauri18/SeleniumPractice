package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex5_TestNGKeyword1_InvocationCount 
{
	@Test(invocationCount = 5)
	public void VerifyFullName()
	{
		Reporter.log("Verify full name TC test case", true);
	}

}
