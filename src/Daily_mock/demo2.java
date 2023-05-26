package Daily_mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		//enter UN
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc");
		Thread.sleep(2000);
		
		//enter password
		driver.findElement(By.xpath("//input[contains(@class,'_55r1 _6luy _9npi')]")).sendKeys("8877445566");
		
		//click on login button
		driver.findElement(By.xpath("//button[contains(text(),'Log')]")).click();
	}

}
