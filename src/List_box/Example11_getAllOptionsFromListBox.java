package List_box;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example11_getAllOptionsFromListBox 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		  driver.get("https://www.facebook.com/");
		  
		  driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		  Thread.sleep(4000);
		  
		  WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		  
		  Select s= new Select(month);
		  
		  List<WebElement> alloptions = s.getOptions();
		  System.out.println(alloptions.size());  //12
		  
		  for(WebElement s1 : alloptions)
		  {
			  System.out.println(s1.getText());
		  }
		
	}

}
