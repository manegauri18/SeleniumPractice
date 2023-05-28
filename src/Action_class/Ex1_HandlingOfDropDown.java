package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex1_HandlingOfDropDown
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		//click on close btn
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
		
		//create obj of action class
		Actions act= new Actions(driver);
		
		act.moveToElement(login).perform();
		Thread.sleep(2000);
		
		//click on gift card element
		driver.findElement(By.xpath("//div[text()='Gift Cards']")).click();
		
		
	}

}
