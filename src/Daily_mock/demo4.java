package Daily_mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo4 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(3000);
		
		//click on login
		driver.findElement(By.xpath("//p[text()='Login or Create Account']")).click();
		Thread.sleep(3000);
		
		//click on mybiz act
		driver.findElement(By.xpath("//li[text()='MyBiz Account']")).click();
		Thread.sleep(4000);
		
		WebElement email = driver.findElement(By.xpath("//input[@placeholder='Enter your work email id']"));
		email.sendKeys("abc@123");
		Thread.sleep(4000);
		email.clear();
		Thread.sleep(4000);
		email.sendKeys("xyz@456");
		

		
		//	 WebElement UN = driver.findElement(By.xpath("//input[@placeholder='Enter email or mobile number']"));
//	 UN.sendKeys("7744556688");
//	 Thread.sleep(5000);
//	 UN.clear();
//	 Thread.sleep(4000);
//	 UN.sendKeys("9955446611");
		
	}

}
