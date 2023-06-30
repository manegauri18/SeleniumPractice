package TestNG_Practice2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex4_keyword2_dependsOnMethods
{
	@Test
	public void login() 
	{
		Reporter.log("Login to app", true);
	}
	
	@Test
	public void TC() 
	{
		Reporter.log("running TC", true);
	}

	@Test(dependsOnMethods = "login")
	public void logout() 
	{
		Reporter.log("logoutFromApp", true);
	}

}
