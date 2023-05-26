package Autosuggestions;

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
		driver.get("https://www.makemytrip.com/bus-tickets/");
		
		driver.findElement(By.xpath("//label[@for='fromCity']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("pune");
		Thread.sleep(2000);
		
		List<WebElement> allOptions = driver.findElements(By.xpath("//ul[@class='react-autosuggest__suggestions-list']//li"));
		String ExpText = "Uruli Kanchan(Pune),Maharashtra";
		
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
