package Calender_practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2 
{
   public static void main(String[] args) throws InterruptedException 
   {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.railyatri.in/train-ticket");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
//		//source
//		driver.findElement(By.xpath("//input[@id='boarding_from']")).sendKeys("pune JN");
//		Thread.sleep(1000);
//		
//		//dest
//	    driver.findElement(By.xpath("//input[@id='boarding_to']")).sendKeys("mumbai dadar central");
//		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='doj1']")).click();
		Thread.sleep(2000);
		
		while(driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText().contains("September")==false)
		{
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']")).click();
			Thread.sleep(2000);
		}
		Thread.sleep(2000);
		
		List<WebElement> allDates = driver.findElements(By.xpath("//a[@class='ui-state-default']"));
		
		for(WebElement date : allDates)
		{
			driver.findElement(By.xpath("(//a[@class='ui-state-default'])[42]")).click();
		}
		
	
}

}
