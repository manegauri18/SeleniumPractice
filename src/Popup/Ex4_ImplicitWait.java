package Popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex4_ImplicitWait 
{
	public static void main(String[] args) 
	{
	   WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.facebook.com/");
	   
	   //implicit wait
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   
	   driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
	   driver.findElement(By.xpath("(//input[@class='_8esa'])[1]")).click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
