package HandlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeEx1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
    	Thread.sleep(2000);
    	
    	List<WebElement> allCountries = driver.findElements(By.xpath("//tr"));
    	
    	System.out.println(allCountries.size());
    	
    	for(WebElement s1 : allCountries)
    	{
    		String text = s1.getText();
    		System.out.println(text);
    		
    	}
		
	}

}
