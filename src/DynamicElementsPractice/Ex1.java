package DynamicElementsPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("iphone 14 pro max case");

		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(2000);
		
		String reviews = driver.findElement(By.xpath("((//div[@class='sg-row'])[1]//span)[15]")).getText();
		System.out.println(reviews);
		
		
		
		
		
		
		
		
	}

}
