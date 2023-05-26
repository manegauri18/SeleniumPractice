package Practice_examples;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class demo24 {

	public static void main(String[] args) throws IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.sugarcosmetics.com/");
		driver.manage().window().maximize();
		
		String RS= RandomString.make(2);
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File des= new File("C:\\Users\\91738\\Desktop\\Selenium software\\Screenshot\\Scosme"+RS+".jpg");
		
		FileHandler.copy(src, des);
		
		
	}

}
