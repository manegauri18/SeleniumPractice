package Popup_Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2_AlertPopup 
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//click on 'Click for JS Prompt'
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
		//switch to alert popupp
		Alert alt = driver.switchTo().alert();
		
		//enter text in alert popup
		alt.sendKeys("abc");
		
		//click on 'OK' button from alert popup
		//alt.accept();
		
		//click on 'Cancel' button from alert popup
		alt.dismiss();
		
		
		
//		//click on 'Click for JS Confirm' button
//		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//		
//		//switch to alert popup 
//		Alert alr =driver.switchTo().alert();
//		
//		//get text from alert popup
//		String text = alr.getText();
//		System.out.println(text);
//		
//		//click on 'OK' button from popup
//		//alr.accept();
//		
//		//click on 'Cancel' button from alert popup
//		alr.dismiss();
		
		
		
		//click on 'Click for JS Alert'
//  	driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
//		//switch to alert popup
//		Alert alt = driver.switchTo().alert();
//		
//		//get text from alert popup
//		String text = alt.getText();
//		System.out.println(text);
//		
//		//click on 'OK' button from alert popup
//		alt.accept();
		
	}

}
