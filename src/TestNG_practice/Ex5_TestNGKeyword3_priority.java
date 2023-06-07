package TestNG_practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class Ex5_TestNGKeyword3_priority 
{
	@Test
	public void TC1()   //0
	{
		Reporter.log("Running TC1 Test case", true);
	}

	@Test(priority = -2)
	public void TC4() 
	{
		Reporter.log("Running TC4 Test case", true);
	}



	
	@Test(priority = 2)
	public void TC3() 
	{
		Reporter.log("Running TC3 Test case", true);
	}


}
