package Customized_List_box_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex5
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.linkText("Create new account")).click();
		
		Thread.sleep(4000);
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		Actions act = new Actions(driver);
		
		act.click(month).perform();
		
		act.sendKeys(Keys.HOME).perform();
		
		for(int i=1; i<=6; i++)
		{
			act.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(500);
		}
		
		act.sendKeys(Keys.ENTER).perform();
		
//		act.sendKeys(Keys.ARROW_UP).perform();
//		Thread.sleep(1000);
//		act.sendKeys(Keys.ARROW_UP).perform();
//		Thread.sleep(1000);
//		act.sendKeys(Keys.ARROW_DOWN).perform();
//		
//		act.sendKeys(Keys.ENTER).perform();
		
		
		
		
		
		
		
		
		
	}

}
