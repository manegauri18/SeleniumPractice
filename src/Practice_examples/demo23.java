package Practice_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demo23
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement SelectAnimals = driver.findElement(By.xpath("//select[@name='animals']"));
		
		Select s = new Select(SelectAnimals);
		
		//s.selectByIndex(0);
		s.selectByValue("avatar");
		
		
	}

}
