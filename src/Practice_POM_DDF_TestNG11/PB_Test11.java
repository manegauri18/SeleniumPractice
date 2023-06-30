package Practice_POM_DDF_TestNG11;

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

public class PB_Test11 
{
	WebDriver driver;
	PBLoginPage login;
	PBMobNumberPage mobNumber;
	PBPwdPage pwd;
	PBHomePage home;
	PBMyAccPage myAcc;
	PBMyProfilePage profile;
	Sheet sh;
    
	@BeforeClass
	public void OpenBrowser() throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\91738\\Desktop\\Selenium software\\Excel sheet\\28th Jan.xlsx");
		sh = WorkbookFactory.create(file).getSheet("DDF");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.policybazaar.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
	    login = new PBLoginPage(driver);
	    mobNumber= new PBMobNumberPage(driver);
	    pwd= new PBPwdPage(driver);
		home= new PBHomePage(driver);
	    myAcc= new PBMyAccPage(driver);
		profile= new PBMyProfilePage(driver);
		
	}
	
	@BeforeMethod
	public void LoginToApp() 
	{
		login.ClickPBLoginPageSignIn();
		mobNumber.inpPBMobNumberPageMobNumber(sh.getRow(0).getCell(0).getStringCellValue());
		mobNumber.clickPBMobNumberPageSignInWithPwdButton();
		pwd.inpPBPwdPagePwd(sh.getRow(0).getCell(1).getStringCellValue());
		pwd.clickPBPwdPageSignInBtn();
		
		
	}
	
	@Test
	public void VerifyFullName() throws InterruptedException
	{
		home.openMyAccDDPBHomePagemyAcc();
		Thread.sleep(2000);
		myAcc.clickPBMyAccPageMyProfile();
		profile.switchToChildWindow();
		
		String ActFullName= profile.getPBFullName();
		String ExpFullName=(sh.getRow(0).getCell(2).getStringCellValue());
		
		Assert.assertEquals(ActFullName, ExpFullName);
		
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
