package Practice_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox5 
{
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	Thread.sleep(4000);
	
	WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
	
	Select s = new Select(month);
	
	boolean result = s.isMultiple();
	System.out.println(result);
	
	if (result) 
	{
		System.out.println("List box is of multi-selectable");
	} 
	else 
	{
        System.out.println("List box is of single-selectable");
	}
	
	
}

}
