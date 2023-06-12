package TestNG;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Ex7_softAssertClass1
{
    @Test
	public void TC1() 
	{
	   SoftAssert soft= new SoftAssert();
	   
		
	   String ActResult = "hi";
	   String ExpResult = "hello";
	   
	  soft.assertEquals(ActResult, ExpResult, "Failed1: both results are same");
	   
	  
	   
	   boolean ActResult1 = false;
	   
	   soft.assertTrue(ActResult1, "Failed2: actual result is false");
	   
	   soft.assertAll();
	   
	}
}
