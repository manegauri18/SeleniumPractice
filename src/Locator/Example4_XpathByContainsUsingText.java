package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Example4_XpathByContainsUsingText 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[contains(text(),'password')]")).click();
		
	}

}
