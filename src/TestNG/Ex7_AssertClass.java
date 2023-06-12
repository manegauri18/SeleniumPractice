package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Ex7_AssertClass 
{
	//Limitation of assert class
	@Test
	public void TC1() 
	{
		String ActResult = "hi";
		String ExpResult = "hello";
		
		Assert.assertEquals(ActResult, ExpResult, "Failed1: both results are same");
		
		
		boolean ActResult1 = false;
		
		Assert.assertTrue(ActResult1,"Failed2: Actual result is false");
	}

}
