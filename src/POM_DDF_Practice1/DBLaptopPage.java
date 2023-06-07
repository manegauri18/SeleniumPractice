package POM_DDF_Practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DBLaptopPage 
{
	@FindBy(xpath="//a[text()='MacBook air']")private WebElement laptop;
	
	public DBLaptopPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickDBLaptopPagelaptop() 
	{
		laptop.click();
	}

}
