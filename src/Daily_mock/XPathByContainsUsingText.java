package Daily_mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XPathByContainsUsingText 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		//click on forgotten password link
		driver.findElement(By.xpath("//a[contains(text(),'password?')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='identify_email']")).sendKeys("manegauri18@gmail.com");
		
		driver.findElement(By.xpath("//button[@value='1']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		Thread.sleep(60000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}

}
