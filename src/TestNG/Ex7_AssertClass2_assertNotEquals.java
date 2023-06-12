package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Ex7_AssertClass2_assertNotEquals 
{
	
	@Test
	public void TC1() 
	{
	   	String ActResult = "hi";
		String ExpResult = "hi";
		
		Assert.assertNotEquals(ActResult, ExpResult, "Failed: Both results are same");
	}

}
