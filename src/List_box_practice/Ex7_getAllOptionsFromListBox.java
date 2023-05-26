package List_box_practice;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex7_getAllOptionsFromListBox 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(3000);
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select s= new Select(month);
		
		TreeSet tr = new TreeSet();
		
		List<WebElement> allOptions = s.getOptions();
		int size = allOptions.size();
		System.out.println(size);
		
		for(WebElement s1 : allOptions)
		{
			System.out.println(s1.getText());
		}
		
		
		
		
		
		
		
		
		
		
		
		
	} 
	

}
