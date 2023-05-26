package Web_Element_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class is_selected_method1
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		//click on create new act button
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
		
		//check whether radio button is selected or not
		boolean result = driver.findElement(By.xpath("(//input[@type='radio'])[1]")).isSelected();
		System.out.println(result);
		
		if (result) 
		{
			System.out.println("Radio button is selected");
		} 
		else 
		{
			System.out.println("Radio button is not selected");
		}
	}

}
