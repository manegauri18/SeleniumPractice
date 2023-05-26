package Web_Element_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_text_method
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		 String text = driver.findElement(By.xpath("//a[text()='Forgotten password?']")).getText();
		System.out.println(text);
		
		//System.out.println(driver.findElement(By.xpath("//a[text()='Forgotten password?']")).getText());
		
		
	}

}
