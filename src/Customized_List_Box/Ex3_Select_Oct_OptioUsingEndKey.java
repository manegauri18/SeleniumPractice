package Customized_List_Box;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex3_Select_Oct_OptioUsingEndKey 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		//step1:
		WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
		
		Actions act= new Actions(driver);
		
		act.click(month).perform();
		Thread.sleep(2000);
		
		act.sendKeys(Keys.END).perform();
		
		for(int i=1; i<=2; i++)
		{
			act.sendKeys(Keys.ARROW_UP).perform();
			Thread.sleep(1000);
		}
		
		act.sendKeys(Keys.ENTER).perform();
		
	}

}