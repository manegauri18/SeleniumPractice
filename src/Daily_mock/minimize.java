package Daily_mock;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class minimize
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/");
		
		Thread.sleep(4000);
		
		driver.manage().window().minimize();
		
	}

}
