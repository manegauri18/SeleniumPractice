package Calender_practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Ex1 
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		Thread.sleep(2000);
		
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//source
		driver.findElement(By.xpath("//input[@class='sc-bxivhb hrsLPT']")).sendKeys("pune");
		Thread.sleep(1000);
				
		//destination
		driver.findElement(By.xpath("(//input[@class='sc-bxivhb hrsLPT'])[2]")).sendKeys("mumbai");
				
		//click on date menu
		driver.findElement(By.xpath("//text[contains(text(),'Date')]")).click();
		Thread.sleep(2000);
		
	    //navigate through month
		while(driver.findElement(By.xpath("(//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'])[2]")).getText().contains("Sep")==false)
		{
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'])[3]")).click();
			Thread.sleep(2000);
		}
		
		Thread.sleep(2000);
		
		List<WebElement> allDates = driver.findElements(By.xpath("//div[@class='DayTiles__CalendarDaysBlock-sc-1xum02u-0 isgDNj']"));
	
		
		for(WebElement date : allDates)
		{
			if(date.getText().contains("15"))
			{
				date.click();
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
