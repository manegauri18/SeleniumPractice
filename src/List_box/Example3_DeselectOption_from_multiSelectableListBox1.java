package List_box;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example3_DeselectOption_from_multiSelectableListBox1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/91738/Desktop/Selenium%20software/HTML%20Files/Sample4.html");
		
		WebElement selectcountry = driver.findElement(By.xpath("//select[@id='1234']"));
		
		Select s = new Select(selectcountry);
		
		s.selectByIndex(0);
		s.selectByIndex(1);
		s.selectByIndex(2);
		
		Thread.sleep(3000);
		
		s.deselectByIndex(1);
		
		//s.deselectByValue(null)
		
		s.deselectByVisibleText("IND");
		
		
	}

}
