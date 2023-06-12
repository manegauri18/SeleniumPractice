package Action_class_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample11 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	    
	    WebElement ele = driver.findElement(By.xpath("//span[text()='right click me']"));
	    
	    
	    Actions act= new Actions(driver);
	   // act.moveToElement(ele).contextClick().perform();
        act.contextClick(ele).perform();
	    Thread.sleep(2000);
	    
	    WebElement ele2 = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	    
	    act.doubleClick(ele2).perform();
	}

}
