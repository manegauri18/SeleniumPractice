package Autosuggestions_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_9 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("automation");
		Thread.sleep(2000);
		
		List<WebElement> allList = driver.findElements(By.xpath("//div[@class='OBMEnb']//li"));
		String ExpText="automation testing tools";
		
		for(WebElement list :allList)
		{
			String ActText = list.getText();
			
			if(ActText.equals(ExpText))
			{
				list.click();
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
