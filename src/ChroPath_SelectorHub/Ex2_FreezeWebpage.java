package ChroPath_SelectorHub;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2_FreezeWebpage 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.flipkart.com/");
	    
	    driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
	    
	    
		
	}

}
