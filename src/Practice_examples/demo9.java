package Practice_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo9 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
//		String url = driver.getCurrentUrl();
//		System.out.println(url);
//		
//		String title = driver.getTitle();
//		System.out.println(title);
		
		WebElement s1 = driver.findElement(By.xpath("//a[text()='Search']"));
		s1.click();
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//li[@data-cy='account']")).click();
		Thread.sleep(3000);
		
		 WebElement UN = driver.findElement(By.xpath("//input[@name='username']"));
		 UN.sendKeys("9988776644");
		 Thread.sleep(3000);
		
		 driver.findElement(By.xpath("//input[@name='username']")).clear();
		 Thread.sleep(8000);
		 
		 UN.sendKeys("8744112233");
		 
		
		
		
		
//		String text = driver.findElement(By.xpath("//input[@name='username']")).getAttribute("value");
//		System.out.println(text);
		
		
		
		
		
		
	}

}
