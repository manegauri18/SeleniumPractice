package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2_SwitchToMainPageFromFrame
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		//switch to frame
		driver.switchTo().frame("iframeResult");
		
		//click on 'click me to display date & time'
		driver.findElement(By.xpath("//button[contains(text(),'Click me to')]")).click();
		
		//switch to main page
		//driver.switchTo().parentFrame();  //--->approach1--we can navigate from child to immediate parent using this approach
		driver.switchTo().defaultContent();  //--->approach2--we can navigate from child to main page directly using this approach
		
		Thread.sleep(3000);
		
		//click on open menu option from main page
		driver.findElement(By.xpath("//a[@title='Open Menu']")).click();
		
		
		
	}

}
