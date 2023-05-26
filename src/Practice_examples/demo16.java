package Practice_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo16 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		
		//click on close button
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(3000);
	
		//click on electronics button
		driver.findElement(By.xpath("//div[text()='Electronics']")).click();
		Thread.sleep(3000);
		
		//click on inner electronics button
		driver.findElement(By.xpath("//span[text()='Electronics']")).click();
		
		//copy the mobiles section link in navigate.to as input
		driver.navigate().to("https://www.flipkart.com/mobile-phones-store?otracker=nmenu_sub_Electronics_0_Mobiles");
		
		
	}

}
