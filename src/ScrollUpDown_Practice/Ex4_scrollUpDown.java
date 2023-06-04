package ScrollUpDown_Practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Ex4_scrollUpDown 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mdbootstrap.com/docs/b4/jquery/tables/scroll/");
		
		//scroll down
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,1150)");
		Thread.sleep(2000);
		
//		//scroll up
//		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-400)");
//		Thread.sleep(2000);
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Thread.sleep(2000);
		
		File des= new File("C:\\Users\\91738\\Desktop\\Selenium software\\Screenshot\\scroll.jpg");
		
		FileHandler.copy(src, des);
		
		
		
		

		
	}

}
