package HandlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeEx2
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    
	    Thread.sleep(2000);
	    
	    List<WebElement> allLinks = driver.findElements(By.xpath("//li"));
	    System.out.println(allLinks.size());
	    
	    for(WebElement s1 : allLinks)
	    {
	    	System.out.println(s1.getText());
	    }

	
	
	
	
	}
}
