package TestNG_Practice2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex7_keyword5_timeouts 
{
	@Test(timeOut = 3000)
	public void TC1() throws InterruptedException 
	{
		Thread.sleep(4000);
		Reporter.log("running TC1", true);
		
	}

}
