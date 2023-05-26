package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Example5_XpathByContainsUsingAttribute 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		
		//enter UN
		driver.findElement(By.xpath("//input[contains(@placeholder,'phone number')]")).sendKeys("abc");
		Thread.sleep(2000);
		
		//Enter password
		driver.findElement(By.xpath("//input[contains(@class,'6luy _9npi')]")).sendKeys("xyz");
		Thread.sleep(2000);
		
		//Click on login button
		driver.findElement(By.xpath("//button[contains(@class,'4jy1 selected _51sy')]")).click();
		
	}

}
