package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex5_TestNGKeyword5_dependsOnMethod1 
{
	@Test
	public void Login() 
	{
		Reporter.log("Running login TC", true);
	}
	
	
	@Test(dependsOnMethods = "Login")
	public void Logout() 
	{
		Reporter.log("Running logout TC", true);
	}

}
