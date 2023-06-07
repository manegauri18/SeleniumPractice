package POM_DDF_Practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DBProductPage 
{
	@FindBy(xpath="//a[text()='Add to cart']") private WebElement AddToCart;

	
	public DBProductPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	
	}
	
	
	public void clickDBProductPageAddToCart() 
	{
		AddToCart.click();
	}
	
	

}
