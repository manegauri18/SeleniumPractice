package Practice_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demo13 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		
		driver.manage().window().maximize();
		
	    String title = driver.getTitle();
	    System.out.println(title);
		
	    String url = driver.getCurrentUrl();
	    System.out.println(url);
	    
//	    WebElement from = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
//	    from.sendKeys("pune");
//	    Thread.sleep(3000);
//	    from.clear();
//	    Thread.sleep(3000);
//	    from.sendKeys("Mumbai");
//	    
//	    driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Hydrabad");
//	    Thread.sleep(3000);
	    
	   boolean result = driver.findElement(By.xpath("//img[@class='rb_logo']")).isDisplayed();
	   System.out.println(result);
	    
	    if (result) 
	    {
			System.out.println("Logo is present");
		} 
	    else  
	    {
            System.out.println("Logo is not present");
		}
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
