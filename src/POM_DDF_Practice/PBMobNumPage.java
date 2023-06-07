package POM_DDF_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMobNumPage 
{
	@FindBy(xpath="(//input[@id='central-login-module-sign-mobile'])[2]") private WebElement MobNum;
	@FindBy(xpath="(//a[@id='central-loggin-with-pwd'])[2]") private WebElement SinInWithPwd;
	
	
	public PBMobNumPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);

	}
	
	public void inpPBMobNumPageMobNum(String MobileNum) 
	{
		MobNum.sendKeys(MobileNum);
	}
	
	public void clickPBMobNumPageSignInWithPwd() 
	{
		SinInWithPwd.click();
	}
	

}
