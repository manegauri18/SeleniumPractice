package List_box_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex4_isMultiple2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/91738/Desktop/Selenium%20software/HTML%20Files/Sample4.html");
		
		WebElement SelectCountry = driver.findElement(By.xpath("//select[@id='1234']"));
		Thread.sleep(3000);
		
		Select s = new Select(SelectCountry);
		
		boolean result = s.isMultiple();
		System.out.println(result);
		
		if (result) 
		{
		   System.out.println("List box is of multi-selectable");	
		} 
		else
		{
           System.out.println("List box is of single-selectable");
		}
		
	}

}
