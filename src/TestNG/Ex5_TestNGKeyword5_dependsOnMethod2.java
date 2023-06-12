package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex5_TestNGKeyword5_dependsOnMethod2 
{
	@Test
	public void Login1() 
	{
		Reporter.log("Running login1 TC", true);
	}
	
	
	@Test
	public void Login2() 
	{
		Reporter.log("Running login2 TC", true);
	}
	
	
	@Test(dependsOnMethods = {"Login1","Login2"})
	public void Logout() 
	{
		Reporter.log("Running logout TC", true);
	}

}
