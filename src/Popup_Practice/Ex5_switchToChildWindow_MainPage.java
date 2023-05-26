package Popup_Practice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex5_switchToChildWindow_MainPage 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.salesforce.com/au/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//click on 'start free trial' button from main page
		driver.findElement(By.xpath("(//pbc-button[@class='cta_button'])[1]")).click();
		
		//get child window ID
	Set<String> AllIDs = driver.getWindowHandles();
	ArrayList<String> al = new ArrayList<String>(AllIDs);
		
		//switch to child window 
		driver.switchTo().window(al.get(1));
		
		//enter 'FN' from child window
		driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("abc");
		
		//enter 'LN' from child window
		driver.findElement(By.xpath("//input[@name='UserLastName']")).sendKeys("xyz");
		
		//switch to main page
		driver.switchTo().window(al.get(0));
		Thread.sleep(2000);
		
		//click on 'watch demo' btn from main page
		driver.findElement(By.xpath("(//pbc-button[@class='cta_button'])[2]")).click();
		
		
		
		
		
		
		
	}

}
