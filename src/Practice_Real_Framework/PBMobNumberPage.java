package Practice_Real_Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMobNumberPage 
{
	@FindBy(xpath="(//input[@id='central-login-module-sign-mobile'])[2]") private WebElement MobNumber;
	@FindBy(xpath="(//span[text()='Sign in with Password'])[2]") private WebElement SignInWithPwd;
	 @FindBy(xpath="(//span[@id='error-sign-in'])[2]") private WebElement ErrorMsg;

	
	public PBMobNumberPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void inpPBMobNumberPageMobNumber(String mobileNum) 
	{
		MobNumber.sendKeys(mobileNum);
	}
	
	public void clickPBMobNumberPageSignInWithPwdButton() 
	{
		SignInWithPwd.click();
	}
	
	public String getErrorMesg() 
	{
		String ActText = ErrorMsg.getText();
		return ActText;
	}
	
}
