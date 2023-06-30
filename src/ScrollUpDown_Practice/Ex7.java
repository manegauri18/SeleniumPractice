package ScrollUpDown_Practice;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex7 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		
		WebElement ele = driver.findElement(By.xpath("//a[text()='Return Policy']"));
		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntiView(true);", ele);
		Thread.sleep(2000);
		
	}
	

}
