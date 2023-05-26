package Practice_examples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2_Selecting_Multiple_check_boxes
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/91738/Desktop/Selenium%20software/HTML%20Files/SelectMultipleCheckBoxes.html");
		
		List<WebElement> allCheckBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		System.out.println(allCheckBoxes.size());
		
		for(WebElement s1 : allCheckBoxes)
		{
			s1.click();
			Thread.sleep(500);
		}
		
		for(int i=allCheckBoxes.size()-1; i>=0; i--)
		{
			allCheckBoxes.get(i).click();
		}
		
	}

}
