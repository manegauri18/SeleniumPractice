package Practice_examples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox3 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(4000);
		
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		
		Select s = new Select(month);
		
		System.out.println("---first selected option---");
		WebElement selectedoption = s.getFirstSelectedOption();
		
		String text = selectedoption.getText();
		System.out.println(text);
		
		System.out.println("---get all options present in list box---");
		List<WebElement> alloptions = s.getOptions();
		
		int size = alloptions.size();
		System.out.println(size);
		
		//System.out.println(alloptions.size());
		
		for(WebElement s1 : alloptions)
		{
			System.out.println(s1.getText());
		}
		
		
		
		
		
		
	}

}
