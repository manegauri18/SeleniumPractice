package POM_DDF_Practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PBTestLoginClass
{
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\91738\\Desktop\\Selenium software\\Excel sheet\\28th Jan.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.policybazaar.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		PBLoginPage login = new PBLoginPage(driver);
		login.clickPBLoginPageSignIn();
		Thread.sleep(2000);
		
		
		PBMobNumPage mobNum= new PBMobNumPage(driver);
		
		String mobileNumber = sh.getRow(0).getCell(0).getStringCellValue();
		mobNum.inpPBMobNumPageMobNum(mobileNumber);
		mobNum.clickPBMobNumPageSignInWithPwd();
		Thread.sleep(2000);
		
		
		PBPwdPage pwd= new PBPwdPage(driver);
		
		String Password = sh.getRow(0).getCell(1).getStringCellValue();
		pwd.inpPBPwdPagePwd(Password);
		pwd.clickPBPwdPageSignin();
		Thread.sleep(2000);
		
		
		PBHomePage home= new PBHomePage(driver);
		home.openMyAccDDPBHomePageMYaCC();
		Thread.sleep(2000);
		
		
		PBMyAccPage myAcc= new PBMyAccPage(driver);
		myAcc.clickPBMyAccPageMyProfile();
		Thread.sleep(2000);
		
		
		PBMyProfilePage myProfile= new PBMyProfilePage(driver);
		myProfile.switchToChildWindow();
		
		String FullName = sh.getRow(0).getCell(2).getStringCellValue();
		myProfile.VerifyPBMyProfilePageFullName(FullName);
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
