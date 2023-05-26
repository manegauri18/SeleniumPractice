package Daily_mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_left_click 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.browserstack.com/guide/action-class-in-selenium");
		Thread.sleep(2000);
		
		WebElement ele = driver.findElement(By.xpath("(//a[text()='Live for Teams'])[1]"));
		
		Actions act = new Actions(driver);
		
		act.click(ele).perform();

		
	}

}
