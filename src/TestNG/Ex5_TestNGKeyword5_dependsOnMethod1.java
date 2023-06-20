package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex5_TestNGKeyword5_dependsOnMethod1 
{
	@Test(timeOut = 5000)
	public void Login() throws InterruptedException 
	{
		Thread.sleep(7000);
		Reporter.log("Running login TC", true);
	}
	
	
	
//	@Test(dependsOnMethods = "Login")
//	public void Logout() 
//	{
//		Reporter.log("Running logout TC", true);
//	}

}
