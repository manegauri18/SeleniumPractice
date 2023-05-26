package Popup_Practice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex3_SwitchToChildWindow 
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//click on 'New Tab' from main page
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		//get child window ID
		Set<String> AllIDs = driver.getWindowHandles();  // {mainPageId, ChildWindowId}
		ArrayList<String> al = new ArrayList<String>(AllIDs);
		
		
		//switch to child window 
		driver.switchTo().window(al.get(1));
		
		//click on 'Selenium' tab from Child window
		driver.findElement(By.xpath("(//span[text()='Selenium'])[1]")).click();
		
		//switch to main page
		driver.switchTo().window(al.get(0));
		
		//click on 'Download' btn from main page
		driver.findElement(By.xpath("//input[@value='Download']")).click();
		
		
		
		
		
		
		
		
		
		
		
	}

}
