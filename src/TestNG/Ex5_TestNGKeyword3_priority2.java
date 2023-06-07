package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex5_TestNGKeyword3_priority2 
{
	@Test         //default priority=0
	public void TC2()   
	{
	    Reporter.log("Running TC2 Test case", true);	
	}
	
	@Test(priority = -2)    //negative priority=-2
	public void TC1() 
	{
	    Reporter.log("Running TC1 Test case", true);	
	}
	
	
	@Test(priority = 1)    //duplicate priority=1
	public void TC3() 
	{
	    Reporter.log("Running TC3 Test case", true);	
	}
	
	
	@Test(priority = 1)   //duplicate priority=1
	public void TC4() 
	{
	    Reporter.log("Running TC4 Test case", true);	
	}
	
	
	
	
	
	
	
	
	

}
