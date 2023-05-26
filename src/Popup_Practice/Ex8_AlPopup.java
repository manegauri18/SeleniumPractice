package Popup_Practice;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex8_AlPopup 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("555");
		
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		//switch to alert popup
		Alert alt = driver.switchTo().alert();
		
		String text = alt.getText();
		System.out.println(text);
		
		//alt.dismiss();
		
		alt.accept();
		alt.accept();
		
		driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]")).click();
		
		List<WebElement> allOptions = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li"));
		String ExpText= "Yahoo";
		
		for(WebElement s1 : allOptions)
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
