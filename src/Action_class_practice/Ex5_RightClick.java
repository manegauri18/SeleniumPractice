package Action_class_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex5_RightClick 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		Thread.sleep(2000);
		
		WebElement ele = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions act= new Actions(driver);
		
		act.moveToElement(ele).contextClick().perform();
		
		
	}

}
