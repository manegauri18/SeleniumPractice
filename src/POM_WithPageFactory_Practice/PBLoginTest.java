package POM_WithPageFactory_Practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PBLoginTest 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.policybazaar.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		PBLoginPage login= new PBLoginPage(driver);
		login.clickOnSignInBtn();
		
		PBMobNumberPage mobNum= new PBMobNumberPage(driver);
		mobNum.enterMobNumber();
		mobNum.clickOnSignInBtn();
		Thread.sleep(2000);
		
		PBPwdPage pwd= new PBPwdPage(driver);
		pwd.enterPwd();
		pwd.clickOnSignInBtn();
		Thread.sleep(2000);
		
		PBHomePage home= new PBHomePage(driver);
		home.openMyAccOptionDropdown();
		Thread.sleep(2000);
		
		PBMyAccPage myAcc= new PBMyAccPage(driver);
		myAcc.ClickOnMyProfileBtn();
		Thread.sleep(2000);
		
		PBMyProfilePage myProfile= new PBMyProfilePage(driver);
		myProfile.switchToChildWindow();
		myProfile.verifyFullName();
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
