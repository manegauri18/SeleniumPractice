package HandlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex3_SelectDeselectMultipleCheckBoxes 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/91738/Desktop/Selenium%20software/HTML%20Files/SelectMultipleCheckBoxes.html");
		
		List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
	    
		System.out.println(checkBoxes.size());
		
		for(WebElement s1 : checkBoxes)
		{
			s1.click();
			Thread.sleep(500);
		}
		
		for(int i=checkBoxes.size()-1; i>=0; i--)
		{
			checkBoxes.get(i).click();
			Thread.sleep(500);
		}

		
	}

}
