package Scroll_up_down;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_ScrollUpDown 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		//scroll down: 1st parameter: 0 , 2nd parameter: +ve
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,350)");
		Thread.sleep(2000);
		
		//scroll up: 1st parameter: 0 , 2nd parameter: -ve
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-100)");
		Thread.sleep(2000);

//		//scroll right: 1st parameter: +ve , 2nd parameter: 0
//		((JavascriptExecutor)driver).executeScript("window.scrollBy(100,0)");
//		Thread.sleep(2000);
//		
//		//scroll left: 1st parameter: -ve , 2nd parameter: 0
//		((JavascriptExecutor)driver).executeScript("window.scrollBy(-50,0)");
		
	}

}
