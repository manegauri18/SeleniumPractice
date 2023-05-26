package Practice_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo8 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(3000);
		
	   // boolean result = driver.findElement(By.xpath("//img[@alt='Make My Trip']")).isDisplayed();

		boolean result = driver.findElement(By.xpath("(//span[@class='tabsCircle appendRight5'])[2]")).isSelected();
		
		System.out.println(result);
		
		if (result) 
		{
			System.out.println("radio button is selected");
		}
		else
		{
            System.out.println("radio button is not selected");
		}
		 
	}

}
