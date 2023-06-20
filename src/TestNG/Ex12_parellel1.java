package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ex12_parellel1 
{
	@Test
	public void OpenFacebookApp() throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(4000);
		
		driver.close();
		
		
	}

}
