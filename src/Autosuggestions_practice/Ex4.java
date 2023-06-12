package Autosuggestions_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex4 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("testing");
		Thread.sleep(3000);
		
		List<WebElement> AllList = driver.findElements(By.xpath("//div[@class='UUbT9']//li"));
		String ExpText="testing life cycle";
		
		for(WebElement s1 : AllList)
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
