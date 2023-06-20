package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Ex13_MultiBrowserTesting 
{
	@Parameters("browserName")
	@Test
	public void TC1(String browserName) throws InterruptedException 
	{
		WebDriver driver= null;
		
		if (browserName.equals("chrome")) 
		{
			driver= new ChromeDriver();
		} 
		else if(browserName.equals("firefox"))
		{
            driver= new EdgeDriver();
		}
		
		
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(6000);
		
		driver.quit();
	}

}
