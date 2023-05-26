package Autosuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex3_bing 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bing.com/");
		
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("selenium");
		Thread.sleep(2000);
		
		List<WebElement> allOptions = driver.findElements(By.xpath("//ul[@id='sa_ul']//li"));
		System.out.println("Size of all options is: "+(allOptions.size()));
		
		String ExpText = "selenium interview questions";
		
		for(WebElement s1 : allOptions)
		{
			String ActText = s1.getText();
			
			if(ActText.equals(ExpText))
			{
				s1.click();
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
