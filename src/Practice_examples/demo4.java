package Practice_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo4 
{
	//Instagram act login
	public static void main(String[] args) throws InterruptedException 
	{ 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(6000);
		
		
		
		//enter UN
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("9999999999");
		Thread.sleep(6000);
		
		//enter password
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("xyz@123");
		Thread.sleep(20000);
		
		//click on login button
		driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).click();
			
	}

}
