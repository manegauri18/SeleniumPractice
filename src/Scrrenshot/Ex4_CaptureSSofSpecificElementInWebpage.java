package Scrrenshot;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex4_CaptureSSofSpecificElementInWebpage
{
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement ele = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
		
		File src = ele.getScreenshotAs(OutputType.FILE);
		
		File des = new File("C:\\Users\\91738\\Desktop\\Selenium software\\Screenshot\\fblogo.jpg");
		
		org.openqa.selenium.io.FileHandler.copy(src, des);
		
	}

}
