package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example6_XPathByIndex 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		//click on create new account button
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("abc");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("xyz");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("9988776655");
		
		driver.findElement(By.xpath("(//input[contains(@class,'58mg _5dba _2ph-')])[5]")).sendKeys("1234");
		
		
	}

}
