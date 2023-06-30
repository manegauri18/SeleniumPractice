package ChroPath_SelectorHub;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ex1
{
	public static void main(String[] args)
	{
		
        WebDriver driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc");
	    
	    driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123");
	    
	    //driver.findElement(By.xpath("//button[@id='u_0_5_dC']")).click();
	    
	    
		
	
		
	}

}
