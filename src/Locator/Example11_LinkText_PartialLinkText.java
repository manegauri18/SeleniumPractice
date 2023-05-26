package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example11_LinkText_PartialLinkText 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/91738/Desktop/Selenium%20software/HTML%20Files/LinkText_PartialLinkText.html");
		Thread.sleep(2000);
		
		//link text approach
		//driver.findElement(By.linkText("Facebook")).click();
		
		//partial link text approach
		driver.findElement(By.partialLinkText("Face")).click();
		
	}

}
