package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2_alertPopup 
{
	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("222");
		
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		//switch to alert popup
		Alert alt = driver.switchTo().alert();
		
		//get text from alert popup
		String text = alt.getText();
		System.out.println(text);
		
		//click on cancel btn from popup
		//alt.dismiss();
		
		//click on 'OK' button from 1st popup
		alt.accept();
		
		//click on 'OK' button from 2nd popup
		alt.accept();
		
		
		
		
		
		
	}

}
