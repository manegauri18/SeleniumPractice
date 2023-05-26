package HandlingOfDynamicElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2_getRatingsFromFlipkart 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//click on close button
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		
		//Enter text in input field
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("godrej ac 5 stars");
		
		//click on search icon
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		//find target element
		 String acRatings = driver.findElement(By.xpath("((//div[@class='_2kHMtA'])[2]//span)[6]")).getText();
		 
		 System.out.println(acRatings);
		
	}

}
