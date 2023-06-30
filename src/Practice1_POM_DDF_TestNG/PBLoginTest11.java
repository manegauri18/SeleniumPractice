package Practice1_POM_DDF_TestNG;

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

public class PBLoginTest11 extends BaseClass
{
	PBLoginPage login;
	PBMobNumberPage mobNumber;
	PBPwdPage pwd;
	PBHomePage home;
	PBMyAccPage myAcc;
	PBMyProfilePage profile;
	int TCID;
	
	
	@BeforeClass
	public void OpenBrowser() throws EncryptedDocumentException, IOException 
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
       mobNumber.inpPBMobNumberPageMobNumber(UtilityClass.getDataFromPF("MobNum"));
       mobNumber.clickPBMobNumberPageSignInWithPwdButton();
       pwd.inpPBPwdPagePwd(UtilityClass.getDataFromPF("PWD"));
       pwd.clickPBPwdPageSignInBtn();
       Thread.sleep(2000);
	}
	
	@Test
	public void verifyFullName() throws InterruptedException, EncryptedDocumentException, IOException 
	{
		TCID=103;
		
		home.openMyAccDDPBHomePagemyAcc();
		Thread.sleep(2000);
		myAcc.clickPBMyAccPageMyProfile();
		profile.switchToChildWindow();
		
		//profile.verifyPBMyProfilePageFullName(null);
		
		String ActFullName= profile.getPBPrifilePageFullName();
		String ExpFullName=UtilityClass.GetDataFromExcel(0, 2);	
		
		Assert.assertEquals(ActFullName, ExpFullName);
		
	}

	@AfterMethod
	public void LogoutFromApp(ITestResult s1) throws IOException 
	{
		if(s1.getStatus()==ITestResult.FAILURE)
		{
	        UtilityClass.CaptureSS(driver, TCID);
		}
	}
    
	@AfterClass
	public void CloseBrowser() throws InterruptedException 
	{
		Thread.sleep(2000);
		driver.quit();
	}



}
