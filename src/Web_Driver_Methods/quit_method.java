package Web_Driver_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class quit_method 
{
	public static void main(String[] args)
	{
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.quit();
		
		
	}

}
