package Screenshot_practice;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Ex1 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yatra.com/");
		Thread.sleep(2000);
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File des=new File("C:\\Users\\91738\\Desktop\\Selenium software\\Screenshot\\yatra.jpg");
		
		FileHandler.copy(src, des);
		
		
		
	}

}
