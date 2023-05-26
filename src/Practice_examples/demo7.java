package Practice_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo7 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		boolean result = driver.findElement(By.xpath("//button[text()='Log in']")).isEnabled();
		System.out.println(result);
		
		if(result)
		{
			System.out.println("Element is enabled");
		}
		else
		{
			System.out.println("Element is not enabled");
		}
	}

}
