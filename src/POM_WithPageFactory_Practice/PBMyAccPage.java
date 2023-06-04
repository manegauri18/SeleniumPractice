package POM_WithPageFactory_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMyAccPage 
{
	@FindBy(xpath="//span[text()=' My profile ']") private WebElement myProfile;
	@FindBy(xpath="//span[text()='Sign out']") private WebElement SignOut;
	
	
	public PBMyAccPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnMyProfileBtn() 
	{
		myProfile.click();
	}
	
	public void clickOnSignOut() 
	{
		SignOut.click();
	}
	

}
