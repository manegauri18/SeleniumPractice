package POM_DDF_Practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DBHomePage 
{
	@FindBy(xpath="//a[text()='Laptops']") private WebElement Laptops;
	
	
	public DBHomePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickDBHomePagelaptops() 
	{
		Laptops.click();
	}
	

}
