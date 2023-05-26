package List_box;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example1_SelectOption_from_singleSelectableListBox 
{
	public static void main(String[] args) throws InterruptedException 
	{
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  
	  driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	  Thread.sleep(4000);
	  
	  WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	  
	  Select s = new Select(month);
	  
	  s.selectByVisibleText("Jun");  // --->approach1- select by visible text using string input
	  
	//  s.selectByValue("2");         // --->approach2- select by value attribute present in html code using string value
	  
	 // s.selectByIndex(7);          // --->approach3- select by int index(start element has always 0 index)
	  
	  
	
	
	
	}

}
