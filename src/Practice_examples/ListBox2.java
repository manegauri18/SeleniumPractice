package Practice_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox2 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/91738/Desktop/Selenium%20software/HTML%20Files/Sample4.html");
		
		WebElement SelectCountry = driver.findElement(By.xpath("//select[@id='1234']"));
		
		
		Select s = new Select(SelectCountry);
		s.selectByIndex(0);
		s.selectByIndex(2);
		s.selectByVisibleText("PAK");
		
		s.deselectByIndex(3);
		s.deselectAll();
		
		
	}

}
