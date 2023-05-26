package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_HiddenDivisionPopup 
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("7387100353");
		
		driver.findElement(By.xpath("//button[text()='Request OTP']")).click();
		
		//driver.findElement(By.xpath("//div[@class='HSKgdN']")).sendKeys("8 4 7 6 5 8");
		
	}

}
