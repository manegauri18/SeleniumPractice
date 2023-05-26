package Daily_mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_double_click 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		Thread.sleep(2000);
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//input[@value='Hello World!']")).clear();
		
		driver.findElement(By.xpath("//input[@value='Hello World!']")).sendKeys("Welcome to Selenium");
		
		WebElement button = driver.findElement(By.xpath("//button[text()='Copy Text']"));
		
		Actions act = new Actions(driver);
		
		act.doubleClick(button).perform();
		
		

		
	}

}
