package Web_Element_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Enabled1_Method 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		boolean result = driver.findElement(By.xpath("//button[@name='login']")).isEnabled();
		System.out.println(result);
		
		if(result)
		{
			System.out.println("Element is enabled");
		}
		else
		{
			System.out.println("Element is disabled");
		}
		
	}

}
