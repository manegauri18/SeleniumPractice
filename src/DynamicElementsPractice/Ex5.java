package DynamicElementsPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex5 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("samsunggalaxy s23 ultra");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		String reviews = driver.findElement(By.xpath("((//div[@class='sg-row'])[1]//span)[6]")).getText();
		
		System.out.println(reviews);
		
		
		
		
		
		
		
	}

}
