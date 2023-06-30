package ScrollUpDown_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex8 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		Thread.sleep(2000);
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0, 1000);");
		
		WebElement ele = driver.findElement(By.xpath("//td[text()='India']"));
		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)", ele);
		
		
		
		
	}

}
