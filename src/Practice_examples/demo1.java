package Practice_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abcd");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("9988776655");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
	}

}
