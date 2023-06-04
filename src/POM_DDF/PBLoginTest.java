package POM_DDF;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PBLoginTest 
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
		login.ClickPBLoginPageSignIn();
		
		PBMobNumberPage mobNumber= new PBMobNumberPage(driver);
		
		String mobileNumber = sh.getRow(0).getCell(0).getStringCellValue();
		mobNumber.inpPBMobNumberPageMobNumber(mobileNumber);
		mobNumber.clickPBMobNumberPageSignInWithPwdButton();
		Thread.sleep(2000);
		
		PBPwdPage pwd= new PBPwdPage(driver);
		
		String password = sh.getRow(0).getCell(1).getStringCellValue();
		pwd.inpPBPwdPagePwd(password);
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
		
		String fullName = sh.getRow(0).getCell(2).getStringCellValue();
		profile.verifyPBMyProfilePageFullName(fullName);
		Thread.sleep(2000);
		
		driver.quit();
		
		
	}

}
