package POM_DDF_TestNG_BaseClass_UtilityClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PBLoginTest1 extends BaseClass
{
	PBLoginPage login;
	PBMobNumberPage mobNumber;
	PBPwdPage pwd;
	PBHomePage home;
	PBMyAccPage myAcc;
	PBMyProfilePage profile;
	
	
	
	
	@BeforeClass
	public void OpenBrowser() throws EncryptedDocumentException, IOException, InterruptedException 
	{
        InitializeBrowser();
		
		login = new PBLoginPage(driver);
		mobNumber= new PBMobNumberPage(driver);
		pwd= new PBPwdPage(driver);
		home= new PBHomePage(driver);
		myAcc= new PBMyAccPage(driver);
		profile= new PBMyProfilePage(driver);
	}
	
	@BeforeMethod
	public void LoginToApp() throws InterruptedException, EncryptedDocumentException, IOException 
	{
		login.ClickPBLoginPageSignIn();
		mobNumber.inpPBMobNumberPageMobNumber(UtilityClass.getTestData(0, 0));
		mobNumber.clickPBMobNumberPageSignInWithPwdButton();
		pwd.inpPBPwdPagePwd(UtilityClass.getTestData(0, 1));
		pwd.clickPBPwdPageSignInBtn();
		Thread.sleep(2000);	
	}
	
	@Test
	public void VerifyFullName() throws InterruptedException, EncryptedDocumentException, IOException 
	{
		home.openMyAccDDPBHomePagemyAcc();
		Thread.sleep(2000);
		myAcc.clickPBMyAccPageMyProfile();
		profile.switchToChildWindow();
		
		String ActFullName = profile.getPBMyProfilePagefullName();
		String ExpFullName= UtilityClass.getTestData(0, 2);
		
		Assert.assertEquals(ActFullName, ExpFullName, "Failed: both results are diff.");
	}
	
	@AfterMethod
	public void LogoutFromApp() 
	{
		
	}
	
	@AfterClass
	public void CloseBrowser() throws InterruptedException 
	{
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}
