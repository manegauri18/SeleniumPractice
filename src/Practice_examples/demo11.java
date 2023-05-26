package Practice_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demo11 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(3000);
		
		WebElement day = driver.findElement(By.xpath("//select[@title='Day']"));
		
		Select s = new Select(day);
		
		s.selectByIndex(17);
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select s1 = new Select(month);
		s1.selectByIndex(2);
		
		WebElement year = driver.findElement(By.xpath("//select[@title='Year']"));
		
		Select s2 = new Select(year);
		s2.selectByIndex(31);
		
		
		
		
		
	}

}
