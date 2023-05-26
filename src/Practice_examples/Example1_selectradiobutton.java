package Practice_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_selectradiobutton
{
   public static void main(String[] args) throws InterruptedException 
   {
	   WebDriver driver = new ChromeDriver();
	   driver.get("https://www.facebook.com/");
	   
	   driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	   Thread.sleep(3000);
	   
	  WebElement femaleradioButton = driver.findElement(By.xpath("(//input[@name='sex'])[1]"));
	  
	  femaleradioButton.click();
	  
	 boolean result = femaleradioButton.isSelected();
	 System.out.println(result);
	 
	 if(result)
	 {
		 System.out.println("Radio button is selected");
	 }
	 else
	 {
		 System.out.println("Radio button is not selected");
	 }
}
}
