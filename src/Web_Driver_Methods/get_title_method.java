package Web_Driver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_title_method 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		
		String title = driver.getTitle();
		System.out.println(title);
		
	}

}
