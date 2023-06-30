package TestNG_Practice2;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ex2_annotations 
{
	@BeforeClass
	public void OpenBrowser() 
	{
		Reporter.log("Open browser", true);
	}
	
	@BeforeMethod
	public void LoginToApp() 
	{
		Reporter.log("login to app", true);
	}

	@Test
	public void TC1() 
	{
		Reporter.log("running TC1", true);
	}
	
	@Test
	public void TC2() 
	{
		Reporter.log("running TC2", true);
	}
	
	@AfterMethod
	public void LogoutFromApp() 
	{
		Reporter.log("Logout from app", true);
	}
	
	@AfterClass
	public void CloseBrowser() 
	{
		Reporter.log("close browser", true);
	}

}
