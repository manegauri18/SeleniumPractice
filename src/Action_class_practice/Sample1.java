package Action_class_practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample1
{
     public static void main(String[] args) 
     {

 		WebDriver driver= new ChromeDriver();
 		driver.manage().window().maximize();
 		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
 		
 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 		
 		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,600)");
 		
 		WebElement ele = driver.findElement(By.xpath("//button[@id='mousehover']"));
 		
 		Actions act = new Actions(driver);
 		act.moveToElement(ele).perform();
		
	}
}
