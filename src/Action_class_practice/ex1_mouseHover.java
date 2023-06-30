package Action_class_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ex1_mouseHover 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
		
		WebElement login = driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
		
		Actions act= new Actions(driver);
		act.moveToElement(login).perform();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//div[contains(text(),'Gift Cards')]")).click();
		
	}

}
