package Practice_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demo10 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[text()='Buses']")).click();
		Thread.sleep(2000);
		
     	driver.findElement(By.xpath("//label[@class='lbl_input makeFlex column latoBold']")).click();
		Thread.sleep(3000);
	
		WebElement from = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		
		Select s = new Select(from);
		//s.selectByVisibleText("")
		
	
	}

}
