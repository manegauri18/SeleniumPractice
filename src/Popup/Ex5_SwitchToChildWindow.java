package Popup;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex5_SwitchToChildWindow {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//click on 'New Tab' from main page
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		//get child window ID
		Set<String> AllIDs = driver.getWindowHandles();       // (mainPageID, ChildWindowID)
		ArrayList<String> al = new ArrayList<String>(AllIDs);  // {mainPageID(0), ChildWindowID(1)}
		
		String childWindowID = al.get(1);
		
		//switch to child Window
		driver.switchTo().window(childWindowID);   //String child windowID
		
		//click on 'Training' tab from child window
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();


	}

}
