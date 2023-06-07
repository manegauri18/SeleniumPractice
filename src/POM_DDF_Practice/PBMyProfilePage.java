package POM_DDF_Practice;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMyProfilePage 
{
	@FindBy(xpath="//input[@name='personName']") WebElement FullName;
	WebDriver driver1;

	
	public PBMyProfilePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		driver1=driver;
	}
	
	public void switchToChildWindow()
	{
		Set<String> allIDs = driver1.getWindowHandles();
		ArrayList<String> al = new ArrayList<String>(allIDs);
		driver1.switchTo().window(al.get(1));
	}
	
	public void VerifyPBMyProfilePageFullName(String ExpName) 
	{
		
		String ActName = FullName.getAttribute("value");
		
		
		if (ActName.equals(ExpName)) 
		{
		    System.out.println("TC Pass");	
		} 
		else
		{
            System.out.println("TC Fail");
		}
	}
}
