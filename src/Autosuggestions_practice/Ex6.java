package Autosuggestions_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex6 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("testng");
		Thread.sleep(2000);
		
		List<WebElement> allList = driver.findElements(By.xpath("//div[@id='Alh6id']//li"));
		String ExpText = "testng in selenium";
		
		for(WebElement s1 :allList)
		{
			String actText = s1.getText();
			
			if(actText.equals(ExpText))
			{
				s1.click();
				break;
			}
		}
		
	}

}
