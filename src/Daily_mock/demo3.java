package Daily_mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo3 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		//click on create new act
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(3000);
		
		//name locator type--enter firstname
		driver.findElement(By.name("firstname")).sendKeys("lmn");
		
	//	driver.findElement(By.linkText("Forgotten password?")).click();
		
		//driver.findElement(By.partialLinkText("word?")).click();
		
		
		
	}

}
