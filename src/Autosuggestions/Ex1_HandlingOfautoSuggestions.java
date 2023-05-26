package Autosuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_HandlingOfautoSuggestions 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		//enter input in google search box
		driver.findElement(By.xpath("//textarea[@type='search']")).sendKeys("kia");
		Thread.sleep(2000);
		
		List<WebElement> allOptions = driver.findElements(By.xpath("//div[@class='OBMEnb']//li"));
		
		String expText = "kia sonet";
		
		for(WebElement s1 : allOptions)
		{
			String actText = s1.getText();
			if(actText.equals(expText))
			{
				s1.click();
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
