package Popup_Practice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex4_SwitchToChildWindow 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//click on link 'OrangeHRM,Inc' from main page
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		
		//get child window ID 
		Set<String> AllIDs = driver.getWindowHandles();
		ArrayList<String> al = new ArrayList<String>(AllIDs);
		
		String url = driver.switchTo().window(al.get(1)).getCurrentUrl();
		System.out.println(url);
		
		//switch to child window
		driver.switchTo().window(al.get(1));
		
		//click on '' from child window
		driver.findElement(By.xpath("(//button[text()='Book a Free Demo'])[2]")).click();
		
		//switch to main page
		driver.switchTo().window(al.get(0));
		Thread.sleep(2000);
		
		//enter 'UN' from main page
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		
		//enter 'PWD' from main page
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		
	}

}
