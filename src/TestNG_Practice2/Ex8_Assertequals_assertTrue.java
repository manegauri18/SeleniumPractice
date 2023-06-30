package TestNG_Practice2;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Ex8_Assertequals_assertTrue 
{
	@Test
	public void name()
	{
		SoftAssert soft= new SoftAssert();
		
		String ActText="hi";
		String ExpText="hello";
		
		soft.assertEquals(ActText, ExpText, "Failed: both results are same");
		
		
		boolean ActResult = true;
		
		soft.assertTrue(ActResult, "Failed: As actual result is false");
		soft.assertAll();
	}
	
		
	

}
