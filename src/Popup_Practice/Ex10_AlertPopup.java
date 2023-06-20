package Popup_Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex10_AlertPopup 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("111");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Alert alt = driver.switchTo().alert();
		String text = alt.getText();
		System.out.println(text);
		alt.accept();
		alt.accept();
		
		
	}

}
