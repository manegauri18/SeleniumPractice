package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ex4_TestNG_Annotations 
{
	@BeforeClass
	public void OpenBrowser() 
	{
		Reporter.log("--Open browser--", true);
	}
	
	@BeforeMethod
	public void LoginToApp()
	{
		Reporter.log("--Login to app--", true);
	}
	
	@Test
	public void VerifyFullName1()
	{
		Reporter.log("Running VerifyFullName1 Test case", true);
	}
	
	@Test
	public void VerifyFullName2()
	{
		Reporter.log("Running VerifyFullName2 Test case", true);
	}
	
	@AfterMethod
	public void LogoutFromApp()
	{
		Reporter.log("--Logout from app--", true);
	}

	@AfterClass
	public void CloseBrowser() 
	{
		Reporter.log("--Close browser--", true);
	}
}
