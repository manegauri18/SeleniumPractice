package Action_class_practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
 		driver.manage().window().maximize();
 		driver.get("https://www.flipkart.com/");
 		
 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 		
 		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
 		Thread.sleep(2000);
 		
 		driver.findElement(By.xpath("//div[text()='Electronics']")).click();
 		Thread.sleep(2000);
 		
 		WebElement electronics = driver.findElement(By.xpath("//span[text()='Electronics']"));
 		
 		Actions act=new Actions(driver);
 		act.moveToElement(electronics).perform();
 		Thread.sleep(2000);
 		
 		driver.findElement(By.xpath("//a[@title='OPPO']")).click();
 		Thread.sleep(2000);
 		
 		driver.findElement(By.xpath("//a[text()='OPPO A17k (Blue, 64 GB)']")).click();
 		
	}

}
