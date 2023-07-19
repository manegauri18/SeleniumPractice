package Musafir_practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex1 
{
	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.musafir.com/Flights/Default.aspx");
	
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    driver.findElement(By.xpath("//input[@name='Origin']")).sendKeys("pune");
	    Thread.sleep(1000);
	    
	    driver.findElement(By.xpath("//input[@name='Destination']")).sendKeys("Mumbai");
	    Thread.sleep(1000);
	    
	    driver.findElement(By.xpath("//input[@name='StartDate']")).click();
	    Thread.sleep(1000);
	    
	    while(driver.findElement(By.xpath("(//div[@class='title'])[2]")).getText().contains("AUGUST 2023")==false)
	    {
	    	Thread.sleep(2000);
	    	driver.findElement(By.xpath("//a[@class='forward']")).click();
	    	Thread.sleep(1000);
	    }
	    
	    
	   List<WebElement> allDates = driver.findElements(By.xpath("//ul[@class='dates']//li"));
	    
	    for(WebElement date : allDates)
	    {
	    	if(date.getText().contains("11"))
	    	{
	    	   date.click();
	    	   break;
	    	}
	    }
	    Thread.sleep(3000);
	    
	    while(driver.findElement(By.xpath("(//div[@class='title'])[2]")).getText().contains("AUGUST 2023")==false)
	    {
	    	Thread.sleep(2000);
	    	driver.findElement(By.xpath("//a[@class='forward']")).click();
	    	Thread.sleep(1000);
	    }
	    
	    
	   List<WebElement> allDates1 = driver.findElements(By.xpath("//ul[@class='dates']//li"));
	    
	    for(WebElement date : allDates1)
	    {
	    	if(date.getText().contains("15"))
	    	{
	    	   date.click();
	    	   break;
	    	}
	    }
	    
	    WebElement ele = driver.findElement(By.xpath("//select[@name='AdultsFlight']"));
	    
	    Select s= new Select(ele);
	    s.selectByVisibleText("2 adults");
	    
	    WebElement ele1 = driver.findElement(By.xpath("//select[@name='ChildrenFlight']"));
	    
	    Select s1= new Select(ele1);
	    s1.selectByVisibleText("1 child");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@data-element='button']")).click();
	}

}
