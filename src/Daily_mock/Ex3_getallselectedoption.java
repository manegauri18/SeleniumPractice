package Daily_mock;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex3_getallselectedoption
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/91738/Desktop/Selenium%20software/HTML%20Files/Sample4.html");
		
		WebElement Selectcountry = driver.findElement(By.xpath("//select[@id='1234']"));
		Thread.sleep(3000);
		
		Select s= new Select(Selectcountry);
		
		s.selectByIndex(1);
		s.selectByIndex(2);
		s.selectByIndex(0);
		
		List<WebElement> allselectedoption = s.getAllSelectedOptions();
		System.out.println(allselectedoption.size());
		
		for(WebElement s1: allselectedoption)
		{
			System.out.println(s1.getText());
		}
		
		
	}

}
