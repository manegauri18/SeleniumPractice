package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex5_TestNGKeyword4_timeouts 
{
	
	@Test(timeOut = 5000)
	public void TC1() throws InterruptedException
	{
		Thread.sleep(7000);
		Reporter.log("Running TC1 Test cae", true);
	}

}
