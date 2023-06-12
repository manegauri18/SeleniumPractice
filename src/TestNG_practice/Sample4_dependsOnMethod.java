package TestNG_practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample4_dependsOnMethod
{
	@Test
	public void login() 
	{
		Reporter.log("Running login TC", true);
		
	}
	
	
	@Test
	public void login1() 
	{
		Reporter.log("Running login1 TC", true);
		
	}
	
	@Test(dependsOnMethods = {"login", "login1"})
	public void logout() 
	{
		Reporter.log("Running logout TC", true);
		
	}

}
