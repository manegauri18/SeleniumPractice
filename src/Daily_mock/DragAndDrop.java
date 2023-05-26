package Daily_mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		Thread.sleep(2000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		
		WebElement src = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
		
		WebElement des = driver.findElement(By.xpath("//div[contains(@class,'ui-widget-content')]"));
		
		Actions act= new Actions(driver);
		
		act.dragAndDrop(src, des).perform();
	}

}
