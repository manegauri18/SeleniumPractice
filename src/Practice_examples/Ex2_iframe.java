package Practice_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2_iframe 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
		
		//switch to frame
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\'Multiple\']/iframe")));
		
		driver.switchTo().frame(driver.findElement(By.xpath("/html/body/section/div/div/iframe")));
		
		Thread.sleep(3000);
	
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("abc");
		
	}

}
