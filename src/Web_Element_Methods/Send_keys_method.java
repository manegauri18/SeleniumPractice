package Web_Element_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Send_keys_method 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("abc");
		
		WebElement UN = driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']"));
		UN.sendKeys("abcd");
		
	
		
		
		
		
	}

}
