package Practice_POM_DDF_TestNG_BaseUtilityClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass1
{
	WebDriver driver;
	
	public void InitializeBrowser() throws IOException 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(UtilityClass1.getPFdata("URL"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		
	}

}
