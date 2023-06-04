package Autosuggestions_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("kia");
		Thread.sleep(2000);
		
		List<WebElement> allOptions = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
		String ExpText = "kia carnival";
		
		for(WebElement s1 : allOptions)
		{
			String ActText = s1.getText();
			
			if (ActText.equals(ExpText)) 
			{
				s1.click();
				break;
			} 
			
		}
		
		
	}

}
