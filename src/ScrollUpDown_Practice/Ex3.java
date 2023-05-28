package ScrollUpDown_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex3 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement flipkart = driver.findElement(By.xpath("//h2[text()='Flipkart Plus']"));
		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)", flipkart);
		Thread.sleep(2000);
		
		WebElement homeFurniture = driver.findElement(By.xpath("//h2[text()='Small Home Appliances']"));
		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)", homeFurniture);
		
		
		
		
		
		
		
		
		
	}

}
