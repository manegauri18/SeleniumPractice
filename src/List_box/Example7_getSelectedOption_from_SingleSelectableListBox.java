package List_box;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example7_getSelectedOption_from_SingleSelectableListBox
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		  driver.get("https://www.facebook.com/");
		  
		  driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		  Thread.sleep(4000);
		  
		  WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		  
		  Select s= new Select(month);
		  
		  s.selectByVisibleText("Feb");
		  
		  String text = s.getFirstSelectedOption().getText();
		  System.out.println(text);
		  
//		  WebElement firstselectedoption = s.getFirstSelectedOption();
//		  
//		 String text = firstselectedoption.getText();
//		 System.out.println(text);
		
	}

}
