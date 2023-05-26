package ScrollUpDown_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2_ScrollIntoView 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
    	Thread.sleep(2000);
    	
    	WebElement kenya = driver.findElement(By.xpath("//td[text()='Kenya']"));
    	
    	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", kenya);
    	Thread.sleep(3000);
    	
    	WebElement ind = driver.findElement(By.xpath("//td[text()='India']"));
    	
    	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)", ind);
        Thread.sleep(2000);
        
        WebElement mal = driver.findElement(By.xpath("//td[text()='Malaysia']"));
        
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)", mal);
		
	}

}
