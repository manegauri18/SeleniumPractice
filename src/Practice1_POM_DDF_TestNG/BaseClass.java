package Practice1_POM_DDF_TestNG;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass 
{
	WebDriver driver;
	public void InitializeBrowser() throws IOException 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(UtilityClass.getDataFromPF("URL"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
	}

}
