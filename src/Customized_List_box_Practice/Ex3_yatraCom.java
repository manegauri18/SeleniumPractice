package Customized_List_box_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex3_yatraCom 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yatra.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ele = driver.findElement(By.xpath("(//input[@name='flight_origin'])[1]"));
		
		Actions act= new Actions(driver);
		
		act.click(ele).perform();
		
		act.sendKeys(Keys.HOME).perform();
		
		for(int i=1; i<=8; i++)
		{
			act.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(500);
		}
		
		act.sendKeys(Keys.ENTER).perform();
		
		WebElement ele2 = driver.findElement(By.xpath("(//input[@name='flight_destination'])[1]"));
		
		act.click(ele2).perform();
		
		act.sendKeys(Keys.HOME).perform();
		
		for(int i=1; i<=9; i++)
		{
			act.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(500);
		}
		
		act.sendKeys(Keys.ENTER).perform();
		
		
		
		
		
	}

}
