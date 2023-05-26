package List_box_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample2_isMultiple1 
{
	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		WebElement Skills = driver.findElement(By.xpath("//select[@id='Skills']"));
		
		Select s= new Select(Skills);
		boolean result = s.isMultiple();
		System.out.println(result);
		
		if (result)
		{
			System.out.println("List box is of multi-selectable");
		} 
		else 
		{
            System.out.println("List box is of single selectable");
		}
		
		
	}

}
