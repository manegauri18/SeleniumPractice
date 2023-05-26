package Autosuggestions_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("java");
		Thread.sleep(2000);
		String ExpText = "java interview questions";
		
		List<WebElement> allOptions = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		
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
