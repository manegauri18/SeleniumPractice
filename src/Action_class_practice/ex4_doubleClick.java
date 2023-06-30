package Action_class_practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ex4_doubleClick 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);
		
		WebElement ele = driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me To See Alert')]"));
		
		Actions act = new Actions(driver);
		
		act.doubleClick(ele).perform();
		
		Thread.sleep(2000);
		
		Alert alt = driver.switchTo().alert();
		
		alt.accept();
		
		
		
		
		
		
	}

}
