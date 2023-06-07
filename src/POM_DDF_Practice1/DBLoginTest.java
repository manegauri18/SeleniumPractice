package POM_DDF_Practice1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DBLoginTest 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.demoblaze.com");
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    
	    DBLoginPage login= new DBLoginPage(driver);
	    login.clickDBLoginPageLogIn();
	    Thread.sleep(2000);
	    
	    
	    DBUserNamePage userName= new DBUserNamePage(driver);
	    userName.inpDBUserNamePageUserName();
	    userName.inpDBUserNamePagePwd();
	    userName.clickDBUserNamePageLogin();
	    Thread.sleep(2000);
	    
	    DBHomePage home= new DBHomePage(driver);
	    home.clickDBHomePagelaptops();
	    Thread.sleep(2000);
	    
	    DBLaptopPage lappy= new DBLaptopPage(driver);
	    lappy.clickDBLaptopPagelaptop();
	    Thread.sleep(2000);
	    
	    
	    DBProductPage product = new DBProductPage(driver);
	    product.clickDBProductPageAddToCart();
	    Thread.sleep(2000);
	    
	    
	    DBCartPage cart = new DBCartPage(driver);
	    cart.SwitchToAlertPopup();
	    cart.clickDBCartPageaddToCart();
	    Thread.sleep(9000);
	    
	    
	    DBOrderPage order = new DBOrderPage(driver);
	    order.clickDBOrderPagecart();
	    order.getTitleDBOrderPagetitle();
	    Thread.sleep(2000);
	    
	    
	    driver.quit();
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
