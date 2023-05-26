package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example8_ID 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/91738/Desktop/Selenium%20software/HTML%20Files/Id.html");
		
		driver.findElement(By.id("1234")).sendKeys("abc");
		Thread.sleep(2000);
		
		driver.findElement(By.id("5678")).sendKeys("xyz");
		
	}

}
