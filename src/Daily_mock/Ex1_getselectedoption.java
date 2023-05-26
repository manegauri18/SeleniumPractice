package Daily_mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex1_getselectedoption 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(3000);
		
		WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
		
		Select s = new Select(month);
		
		s.selectByVisibleText("Feb");
		
		String text = s.getFirstSelectedOption().getText();
		System.out.println(text);
		
//		WebElement firstselectedoption = s.getFirstSelectedOption();
//		
//		String text = firstselectedoption.getText();
//		System.out.println(text);
		
	}

}
