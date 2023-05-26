package Practice_examples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo30 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		
		System.out.println(allLinks.size());
		
		for(WebElement s1 : allLinks)
		{
			String text = s1.getText();
			System.out.println(text);
		}
	

	}

}
