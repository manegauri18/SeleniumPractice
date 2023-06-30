package TestNG_Practice2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Ex11_crossBrowserTesting 
{
	@Parameters("browserName")
	@Test
	public void TC1(String browserName) throws InterruptedException
	{
		WebDriver driver = null;
		
		if (browserName.equals("chrome")) 
		{
			driver = new ChromeDriver();
		} 
		else if(browserName.equals("edge"))
		{
            driver = new EdgeDriver();
		}
		
		
		
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		driver.quit();
	}

}
