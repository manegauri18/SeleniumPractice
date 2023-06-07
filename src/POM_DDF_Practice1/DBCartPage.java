package POM_DDF_Practice1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DBCartPage 
{ 
	@FindBy(xpath="//a[text()='Add to cart']") private WebElement addToCart;
	WebDriver driver1;
	

	public DBCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		driver1=driver;
	}
	
	
	public void SwitchToAlertPopup() throws InterruptedException 
	{
		Alert alt = driver1.switchTo().alert();
		alt.accept();
		Thread.sleep(5000);
	}
	
	public void clickDBCartPageaddToCart() throws InterruptedException 
	{
		addToCart.click();	
		Thread.sleep(5000);
	}
}
