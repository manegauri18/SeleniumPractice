package Customized_List_box_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex2_UsingHomeKey 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
	
		WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
		
		Actions act= new Actions(driver);
		
		act.click(month).perform();
		
		act.sendKeys(Keys.HOME).perform();
		Thread.sleep(2000);
		
		//select nov month using home key
		for(int i=1; i<=10; i++)
		{
			act.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(2000);
		}
		
		act.sendKeys(Keys.ENTER).perform();
		
		
		
		
		
		
		
		
		
		
	}

}
