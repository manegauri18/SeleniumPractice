package Popup_Practice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex9_Childbropopup 
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		
		Set<String> allIDs = driver.getWindowHandles();
		ArrayList<String> al = new ArrayList<String>(allIDs);
		
		driver.switchTo().window(al.get(1));
		
		driver.findElement(By.xpath("(//button[text()='Book a Free Demo'])[2]")).click();
		
		driver.switchTo().window(al.get(0));
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		
	}

}
