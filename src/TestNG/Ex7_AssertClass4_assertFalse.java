package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Ex7_AssertClass4_assertFalse 
{
	@Test
	public void TC1() 
	{
		boolean ActResult = true;
		
		Assert.assertFalse(ActResult, "Failed: Actual result is true");
		
	}

}
