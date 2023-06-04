package POM_WithPageFactory_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMobNumberPage 
{
	@FindBy(xpath="(//input[@id='central-login-module-sign-mobile'])[2]") private WebElement MobNumber;
	@FindBy(xpath="(//span[text()='Sign in with Password'])[2]") private WebElement SignInWithPwd;

	
	public PBMobNumberPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterMobNumber() 
	{
		MobNumber.sendKeys("7387100353");
	}
	
	public void clickOnSignInBtn() 
	{
		SignInWithPwd.click();	
	}
	
}
