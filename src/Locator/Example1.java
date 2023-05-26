package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		//Enter UN/email ID
		//driver.findElement("Locator type")
		//driver.findElement(By.xpath("xpathExpression"))
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc");
		
		Thread.sleep(2000);
		
		//Enter password
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("xyz");
		
		//login button click
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
	}

}
