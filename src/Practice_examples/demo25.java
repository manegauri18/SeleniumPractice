package Practice_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//iframe within iframe
public class demo25 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
		
		//switch to iframe
		driver.switchTo().frame("iframeResult");
		
		WebElement fName = driver.findElement(By.xpath("//input[@name='fname']"));
		fName.clear();
		Thread.sleep(3000);
		fName.sendKeys("java");
		Thread.sleep(2000);
		
		WebElement lName = driver.findElement(By.xpath("//input[@name='lname']"));
		lName.clear();
		Thread.sleep(3000);
		lName.sendKeys("selenium");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		
		
		
		
		
	}

}
