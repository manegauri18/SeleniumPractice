package Handling_of_calender;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Ex1_SelectDateInRedBusApp 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		
		Thread.sleep(4000);
		
		//source
		driver.findElement(By.xpath("//input[@class='sc-bxivhb hrsLPT']")).sendKeys("pune");
		Thread.sleep(1000);
		
		//destination
		driver.findElement(By.xpath("(//input[@class='sc-bxivhb hrsLPT'])[2]")).sendKeys("mumbai");
		
		//open date menu
		driver.findElement(By.xpath("//div[@class='sc-kAzzGY llxTcS']")).click();
		Thread.sleep(2000);
		
		//navigate to expected month--->august
		while(driver.findElement(By.xpath("(//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'])[2]")).getText().contains("Aug")==false)
		{
			Thread.sleep(1000);
			//click on next arrow(>)
			driver.findElement(By.xpath("(//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'])[3]")).click();
			Thread.sleep(3000);
		}
		
		Thread.sleep(1000);
		//get all dates
		List<WebElement> allDates = driver.findElements(By.xpath("//div[@class='DayTiles__CalendarDaysBlock-sc-1xum02u-0 isgDNj']"));
		
		for(WebElement date : allDates)
		{
			if(date.getText().contains("4"))
			{
				date.click();
				break;
			}
		}	
		
		
		//click on search buses button
		//driver.findElement(By.xpath("//button[@class='sc-dxgOiQ eQQkuo']")).click();
		
		
	}

}
