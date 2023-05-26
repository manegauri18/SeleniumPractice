package List_box_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample3_isMultiple3 
{
	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		WebElement hobbies = driver.findElement(By.xpath("(//div[@class='col-md-4 col-xs-4 col-sm-4'])[6]"));
		
		Select s = new Select(hobbies);
		
		boolean result = s.isMultiple();
		System.out.println(result);
		
		if (result) 
		{
			System.out.println("Check box is of multi-selectable");
		}
		else 
		{
            System.out.println("Check box is of single selectable");
		}
		
	}

}
