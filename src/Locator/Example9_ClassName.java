package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example9_ClassName 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/91738/Desktop/Selenium%20software/HTML%20Files/ClassName.html");
		Thread.sleep(2000);
		
		driver.findElement(By.className("abc123")).sendKeys("abcd");
		Thread.sleep(2000);
		
		driver.findElement(By.className("xyz123")).sendKeys("xyz");
		
	}

}
