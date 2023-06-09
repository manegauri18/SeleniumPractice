package POM_with_PageFactory;

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
		
		PBLoginPage login = new PBLoginPage(driver);
		login.ClickPBLoginPageSignIn();
		
		PBMobNumberPage mobNumber= new PBMobNumberPage(driver);
		mobNumber.inpPBMobNumberPageMobNumber();
		mobNumber.clickPBMobNumberPageSignInWithPwdButton();
		Thread.sleep(2000);
		
		PBPwdPage pwd= new PBPwdPage(driver);
		pwd.inpPBPwdPagePwd();
		pwd.clickPBPwdPageSignInBtn();
		Thread.sleep(2000);
		
		PBHomePage home= new PBHomePage(driver);
		home.openMyAccDDPBHomePagemyAcc();
		Thread.sleep(2000);
		
		PBMyAccPage myAcc= new PBMyAccPage(driver);
		myAcc.clickPBMyAccPageMyProfile();
		Thread.sleep(2000);
		
		PBMyProfilePage profile= new PBMyProfilePage(driver);
		profile.switchToChildWindow();
		profile.verifyPBMyProfilePageFullName();
		Thread.sleep(2000);
		
		driver.quit();
		
		
	}

}
