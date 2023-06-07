
package TestNG_practice;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ex4_TestNGAnnotations 
{ 
	@BeforeClass
	public void name() 
	{
		Reporter.log("Open browser", true);
	}
	
	@BeforeMethod
	public void LoginToApp() 
	{
	   Reporter.log("Login to app", true);	
	}
	
	@Test
	public void VerifyFullName1() 
	{
	   Reporter.log("Running TC1 test case", true);	
	}
	
	@Test
	public void VerifyFullName2() 
	{
	   Reporter.log("Running TC2 test case", true);	
	}
	
	@AfterMethod
	public void LogoutFromApp() 
	{
	   Reporter.log("Logout from app", true);	
	}


	@AfterClass
	public void CloseBrowser() 
	{
		Reporter.log("Close browser", true);
	}

}
