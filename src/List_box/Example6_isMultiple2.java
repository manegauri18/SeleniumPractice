package List_box;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example6_isMultiple2
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/91738/Desktop/Selenium%20software/HTML%20Files/Sample4.html");
		
		WebElement selectcountry = driver.findElement(By.xpath("//select[@id='1234']"));
		
		Select s = new Select(selectcountry);
		
		boolean result = s.isMultiple();
		System.out.println(result);
		
		if(result)
		{
			System.out.println("List box is of multi_selectable");
		}
		else
		{
			System.out.println("List box is of single-selectable");
		}
	}

}
