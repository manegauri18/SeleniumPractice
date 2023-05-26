package List_box;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex13_SelectOptionWithoutUsingSelectMethods 
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		
		Select s = new Select(month);
		
		s.selectByIndex(1);
		
//		List<WebElement> allOptions = s.getOptions();
//		
//		for(WebElement s1 : allOptions)
//		{
//			if(s1.getText().equals("Apr"))
//			{
//				s1.click();
//				break;
//			}
//		}
		
	}

}
