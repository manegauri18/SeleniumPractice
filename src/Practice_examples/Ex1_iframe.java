package Practice_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_iframe 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//switch to frame
		driver.switchTo().frame("frame-one1434677811");
		
		//enter first name
		driver.findElement(By.xpath("(//input[@class='text_field'])[1]")).sendKeys("abc");
		
		Thread.sleep(3000);
		
		//switch to main page
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//input[@class='wikipedia-search-input']")).sendKeys("amazonshopping");
		
		driver.findElement(By.xpath("//input[@class='wikipedia-search-button']")).click();
		
		
		
	}

}
