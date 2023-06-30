package Practice_Real_Framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
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
	int TCID;
	
	
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
	
//	@BeforeMethod
//	public void LoginToApp() throws InterruptedException, EncryptedDocumentException, IOException 
//	{
//		login.ClickPBLoginPageSignIn();
//		mobNumber.inpPBMobNumberPageMobNumber(UtilityClass.getPFData("MobNum"));
//		mobNumber.clickPBMobNumberPageSignInWithPwdButton();
//		pwd.inpPBPwdPagePwd(UtilityClass.getPFData("PWD"));
//		pwd.clickPBPwdPageSignInBtn();
//		Thread.sleep(2000);	
//	}
	
//	@Test
//	public void TC1_verifyFullName() throws InterruptedException, EncryptedDocumentException, IOException 
//	{
//		TCID=101;
//		home.openMyAccDDPBHomePagemyAcc();
//		Thread.sleep(2000);
//		myAcc.clickPBMyAccPageMyProfile();
//		profile.switchToChildWindow();
//		
//		String ActFullName = profile.getPBMyProfilePagefullName();
//		String ExpFullName= UtilityClass.getTestData(0, 2);
//		
//		Assert.assertEquals(ActFullName, ExpFullName, "Failed: both results are diff.");
//		
//		
//	}
	
	@Test
	public void TC2_VerifyErrorMsg() throws EncryptedDocumentException, IOException, InterruptedException 
	{
		TCID=105;
		
		login.ClickPBLoginPageSignIn();
		mobNumber.inpPBMobNumberPageMobNumber(UtilityClass.getTestData(0, 4));
		mobNumber.clickPBMobNumberPageSignInWithPwdButton();
		Thread.sleep(2000);
		
		String ActText= mobNumber.getErrorMesg();
		String ExpText= UtilityClass.getTestData(0, 5);
		
		Assert.assertEquals(ActText, ExpText, "Failed: both error msgs are differ.");
	}
	
	@AfterMethod
	public void LogoutFromApp(ITestResult s1) throws IOException, InterruptedException 
	{
		if(s1.getStatus()==ITestResult.FAILURE)
		{
			UtilityClass.CaptureSS(driver, TCID);
		}
		
		profile.switchToMainWindow();
		home.openMyAccDDPBHomePagemyAcc();
		Thread.sleep(2000);
		myAcc.clickPBHomePagesignOut();	
	}
	
	@AfterClass
	public void CloseBrowser() throws InterruptedException 
	{
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}
