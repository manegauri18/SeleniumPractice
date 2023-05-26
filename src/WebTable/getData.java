package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getData 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/91738/Desktop/Selenium%20software/HTML%20Files/Sample6.html");
		
		String text = driver.findElement(By.xpath("//table[@id='1234']//tr[3]/td[3]")).getText();
		System.out.println(text);
		
		
		//for header
		String text1 = driver.findElement(By.xpath("//table[@id='1234']//tr[1]/th[2]")).getText();
		System.out.println(text1);
		
	}

}
