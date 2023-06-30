package Autosuggestions_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex7 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bing.com/");
		
		driver.findElement(By.xpath("//textarea[@id='sb_form_q']")).sendKeys("agile");
		Thread.sleep(2000);
		
		List<WebElement> allList = driver.findElements(By.xpath("//div[@id='sw_as']//li"));
		String ExpText="agile principles";
		
		for(WebElement s1 :allList)
		{
			String ActText = s1.getText();
			
			if(ActText.equals(ExpText))
			{
				s1.click();
				break;
			}
			
		}
		
	}

}
