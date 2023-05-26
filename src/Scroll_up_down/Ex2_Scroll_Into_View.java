package Scroll_up_down;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2_Scroll_Into_View 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		WebElement about = driver.findElement(By.xpath("//a[text()='About']"));
		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", about);
		
	}

}
