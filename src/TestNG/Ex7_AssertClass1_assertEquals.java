package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Ex7_AssertClass1_assertEquals
{
	
	@Test
	public void TC1() 
	{
	   	String ActResult = "hi";
		String ExpResult = "hello";
		
		Assert.assertEquals(ActResult, ExpResult, "Failed: Act Result & expected result are differ.");
	}

}
