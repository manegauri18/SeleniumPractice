package POM_DDF_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBPwdPage 
{
	@FindBy(xpath="//input[@name='password']") WebElement Pwd;
	@FindBy(xpath="//a[@id='login-in-with-password']") WebElement Signin;
	
	public PBPwdPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);

	}
	
	
	public void inpPBPwdPagePwd(String pwd) 
	{
		Pwd.sendKeys(pwd);
	}
	
	
	public void clickPBPwdPageSignin() 
	{
		Signin.click();
	}

}
