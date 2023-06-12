package Autosuggestions_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex3
{
	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    
	    Thread.sleep(2000);
	    
	  driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("India");
	  
	  driver.findElements(By.xpath(""));
		
	}

}
