package ScrollUpDown_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex5_scrollIntoView 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mdbootstrap.com/docs/b4/jquery/tables/scroll/");
		
		WebElement ele = driver.findElement(By.xpath("(//h2[@class='section-heading mb-4'])[6]"));
		Thread.sleep(2000);
		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", ele);
		
	}

}
