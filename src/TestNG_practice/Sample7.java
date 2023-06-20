package TestNG_practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample7 
{
//	@Test
//	public void TC1()
//	{
//	String ActResult = "hi";
//	String ExpResult = "hi";
//	
//	Assert.assertNotEquals(ActResult, ExpResult, "Failed: both results are same");
//	
//	}
	
	@Test
	public void TC1()
	{
	  boolean ActResult = false;
	
	
	Assert.assertFalse(ActResult, "Failed: actual result is false");
	
	}

}
