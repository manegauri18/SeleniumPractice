package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example7_TagName 
{
	public static void main(String[] args) throws InterruptedException 
	{ 
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/91738/Desktop/Selenium%20software/HTML%20Files/TagName.html");
		Thread.sleep(3000);
		
		driver.findElement(By.tagName("input")).sendKeys("abc");
		Thread.sleep(2000);
		
		driver.findElement(By.tagName("input")).sendKeys("xyz");
		
	}

}
