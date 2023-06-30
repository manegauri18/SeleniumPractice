package Scrrenshot;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex3 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
    	Thread.sleep(2000);
    	
    	
    	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	
    	File des= new File("C:\\Users\\91738\\Desktop\\Selenium software\\Screenshot\\countries.jpg");
    	
    	org.openqa.selenium.io.FileHandler.copy(src, des);
    	
    	
		
	}

}
