package Daily_mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(7000);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		Thread.sleep(7000);
		
		driver.findElement(By.xpath("//span[text()='Enter Email/Mobile number']")).sendKeys("9988776655");
		Thread.sleep(3000);
		
		
		
	}

}
