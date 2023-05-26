package Practice_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo14 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc");
		Thread.sleep(3000);
		
		String value = driver.findElement(By.xpath("//input[@name='email']")).getAttribute("value");
		System.out.println(value);
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
		Thread.sleep(3000);
		
		boolean maleRadiobtn = driver.findElement(By.xpath("(//input[@name='sex'])[2]")).isSelected();
		System.out.println(maleRadiobtn);
		
		if (maleRadiobtn) 
		{
			System.out.println("Radio button is selected");
		} 
		else 
		{
			System.out.println("Radio button is de-selected");
		}
		
		
//		boolean link = driver.findElement(By.xpath("//a[text()='Forgotten password?']")).isEnabled();
//		System.out.println(link);
//		
//		if (link)
//		{
//			System.out.println("Link is enabled");
//		} 
//		else 
//		{
//			System.out.println("Link is disabled");
//		}
		
	}

}
