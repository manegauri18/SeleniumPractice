package POM_DDF_Practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DBUserNamePage 
{
	@FindBy(xpath="//input[@id='loginusername']") private WebElement UserName;
	@FindBy(xpath="//input[@id='loginpassword']") private WebElement Pwd;
	@FindBy(xpath="//button[text()='Log in']")private WebElement Login;
	
	public DBUserNamePage(WebDriver driver)
	{
	   PageFactory.initElements(driver, this);
	}
	
	public void inpDBUserNamePageUserName() 
	{
		UserName.sendKeys("rupajamble");
	}
	
	public void inpDBUserNamePagePwd()
	{
		Pwd.sendKeys("rupa@12345");
	}
	
	public void clickDBUserNamePageLogin() 
	{
		Login.click();
	}

}
