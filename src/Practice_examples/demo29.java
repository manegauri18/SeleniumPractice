package Practice_examples;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class demo29 
{
	public static void main(String[] args) throws IOException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		
		File src = driver.getScreenshotAs(OutputType.FILE);
		
		File Des = new File("C:\\Users\\91738\\Desktop\\Selenium software\\Screenshot\\Insta.jpg");
		
		FileHandler.copy(src, Des);
		
		
	}

}
