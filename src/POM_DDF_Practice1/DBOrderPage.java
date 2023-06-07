package POM_DDF_Practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DBOrderPage 
{
	@FindBy(xpath="//a[text()='Home ']")private WebElement home;
	@FindBy(xpath="//a[@id='cartur']")private WebElement cart;
	@FindBy(xpath="//*[@id=\'tbodyid\']/tr/td[2]") private WebElement title;

	
	public DBOrderPage(WebDriver driver) 
	{
       PageFactory.initElements(driver, this);
	}
	
	
	public void clickDBOrderPagecart() 
	{
		cart.click();
	}
	
	
	public void getTitleDBOrderPagetitle() 
	{
		String actText = title.getText();
		String ExpText="MacBook air";
		
		if (actText.equals(ExpText)) 
		{
			System.out.println("TC Pass");
		}
		else
		{
            System.out.println("TC Fail");
		}
		
		
	}
}
