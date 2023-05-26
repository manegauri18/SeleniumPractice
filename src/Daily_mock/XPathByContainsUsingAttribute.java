package Daily_mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XPathByContainsUsingAttribute 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		//Enter UN
		driver.findElement(By.xpath("//input[contains(@placeholder,'Email address')]")).sendKeys("abc");
		Thread.sleep(2000);
		
		//Enter password
		driver.findElement(By.xpath("//input[contains(@class,'6luy _9npi')]")).sendKeys("xyz");
		Thread.sleep(2000);
		
		//click on login button
		driver.findElement(By.xpath("//button[contains(@class,'4jy1 selected _51sy')]")).click();
		
		
		
	}

}
