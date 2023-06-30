package TestNG_Practice2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex10_grouping2 
{
	@Test(groups = "login")
	public void TC1() 
	{
		Reporter.log("Runninhg TC1", true);
	}
	
	@Test(groups = "settings")
	public void TC2() 
	{
		Reporter.log("Runninhg TC2", true);
	}
	
	@Test(groups = "settings")
	public void TC3() 
	{
		Reporter.log("Runninhg TC3", true);
	}

	
	@Test(groups = "profile")
	public void TC4() 
	{
		Reporter.log("Runninhg TC4", true);
	}

}
