package POM_DDF_Practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DBLoginPage 
{
	@FindBy(xpath="//a[text()='Log in']") private WebElement LogIn;
	
	
	public DBLoginPage(WebDriver driver) 
	{
        PageFactory.initElements(driver, this);
	}
	
	
	public void clickDBLoginPageLogIn() 
	{
		LogIn.click();
	}

}
