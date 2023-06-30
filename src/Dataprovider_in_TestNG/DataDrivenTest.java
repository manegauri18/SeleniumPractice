package Dataprovider_in_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTest 
{
	WebDriver driver;
	@BeforeClass
	public void OpenBrowser() 
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@Test(dataProvider = "LoginData")
	public void LoginTest(String user, String pwd, String exp) throws InterruptedException 
	{
		driver.get("https://admin-demo.nopcommerce.com/login");
		
		WebElement EmailTextBox = driver.findElement(By.id("Email"));
		EmailTextBox.clear();
		Thread.sleep(2000);
		EmailTextBox.sendKeys(user);
		
		WebElement PwdTextBox = driver.findElement(By.id("Password"));
		PwdTextBox.clear();
		Thread.sleep(2000);
		PwdTextBox.sendKeys(pwd);
		
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
		String ActTitle=driver.getTitle();
		String ExpTitle="Dashboard / nopcommerce administration";
		
		if (exp.equals("Valid")) 
		{
			if (ExpTitle.equals(ActTitle)) 
			{
				driver.findElement(By.linkText("Logout")).click();
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
			}
		}
		else if (exp.equals("Invalid")) 
		{
			if (ExpTitle.equals(ActTitle)) 
			{
				driver.findElement(By.xpath("//a[text()='Logout']")).click();
				Assert.assertTrue(false);
			}
			else
			{
				Assert.assertTrue(true);
			}
		}
		
		
	}
	
	@DataProvider(name = "LoginData")
	public String[][] getData()
	{
		String [][] data = {{"admin@yourstore.com", "admin", "Valid"},
				{"admin@yourstore.com", "adm", "Invalid"},
				{"adm@yourstore.com", "admin", "Invalid"},
				{"adm@yourstore.com", "adm", "Invalid"}
				};
		
		return data;
	}
	
	public void CloseBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}

}
