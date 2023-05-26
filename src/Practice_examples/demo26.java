package Practice_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//iframe
public class demo26 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_links_w3schools");
		
		//switch to iframe
		driver.switchTo().frame("iframeResult");
		
		//click on link
		driver.findElement(By.xpath("//a[text()='Visit W3Schools.com!']")).click();
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[@title='Open Menu']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='Privacy policy']")).click();
		
	}

}
