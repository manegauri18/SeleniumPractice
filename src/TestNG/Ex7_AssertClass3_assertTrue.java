package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Ex7_AssertClass3_assertTrue 
{
	
	@Test
	public void TC1()
	{
		boolean ActResult = false;
		
		
		Assert.assertTrue(ActResult, "Failed: Expected result is true");
	}

}
