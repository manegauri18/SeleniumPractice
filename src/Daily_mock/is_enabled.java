package Daily_mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class is_enabled
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
		String text = driver.findElement(By.xpath("//button[@id='enable-button']")).getText();
		System.out.println(text);
		
		
//		 boolean result = driver.findElement(By.xpath("//button[@id='disable']")).isEnabled();
//		 System.out.println(result);
//		 
//		 if(result)
//		 {
//			System.out.println("Button is enabled"); 
//		 }
//		 else
//		 {
//			 System.out.println("Button is disabled");
//		 }
		
	}

}
