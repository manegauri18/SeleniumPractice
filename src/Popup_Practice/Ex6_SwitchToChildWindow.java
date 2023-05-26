package Popup_Practice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex6_SwitchToChildWindow 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		
		//get child window id
		Set<String> allIDs = driver.getWindowHandles();
		ArrayList<String> al = new ArrayList<String>(allIDs);
		
		//switch to child window
		driver.switchTo().window(al.get(1));
		
		driver.findElement(By.xpath("(//button[text()='Book a Free Demo'])[2]")).click();
		
		//switch to main page
		driver.switchTo().window(al.get(0));
		
		//enter UN
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		
		//enter pwd
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		
		
		
		

		
	}

}
