package Daily_mock;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class close_method 
{
	public static void main(String[] args) 
	{
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.close();
		
	}

}
