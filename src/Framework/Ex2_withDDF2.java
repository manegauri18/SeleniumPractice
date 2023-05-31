package Framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex2_withDDF2 
{
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\91738\\Desktop\\Selenium software\\Excel sheet\\28th Jan.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
	
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.policybazaar.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//click on 'sign in button'
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		Thread.sleep(3000);
		
		//enter mobile number
		driver.findElement(By.xpath("(//input[@id='central-login-module-sign-mobile'])[2]")).sendKeys(sh.getRow(0).getCell(0).getStringCellValue());
		
		//click on 'sign in with pwd btn'
		driver.findElement(By.xpath("(//span[text()='Sign in with Password'])[2]")).click();
		Thread.sleep(2000);
		
		//enter pwd
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(sh.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(2000);
		
		//click on 'sign in' btn
		driver.findElement(By.xpath("//a[@id='login-in-with-password']")).click();
		Thread.sleep(2000);
		
		//keep mouse over 'my account'
		WebElement myAcc = driver.findElement(By.xpath("//div[text()='My Account']"));
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		act.moveToElement(myAcc).perform();
		
		//click on 'my profile' btn
		driver.findElement(By.xpath("//span[text()=' My profile ']")).click();
		
		//get child window ID
		Set<String> allIDs = driver.getWindowHandles();
		ArrayList<String> al = new ArrayList<String>(allIDs);
		
		//switch to child window
		driver.switchTo().window(al.get(1));
		Thread.sleep(2000);
		
		//get full name
		String ActText = driver.findElement(By.xpath("//input[@name='personName']")).getAttribute("value");
		String ExpText= sh.getRow(0).getCell(2).getStringCellValue();
		
		if(ActText.equals(ExpText))
		{
			System.out.println("TC Pass");
		}
		else
		{
			System.out.println("TC Fail");
		}
		
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}
