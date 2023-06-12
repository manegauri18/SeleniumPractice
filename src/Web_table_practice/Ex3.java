package Web_table_practice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex3
{
	public static void main(String[] args) throws InterruptedException 
	{
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  
	  ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,600)");
	  Thread.sleep(2000);
	  
	  String text = driver.findElement(By.xpath("(//table[@id='product'])[1]//tr[6]/td[2]")).getText();
	  System.out.println(text);
	  
	  int rowSize = driver.findElements(By.xpath("(//table[@id='product'])[1]//tr")).size();
	  System.out.println(rowSize);
	  
	  int ColSize = driver.findElements(By.xpath("(//table[@id='product'])[1]//tr[3]/td")).size();
	  System.out.println(ColSize);
	  
	  int dataSize = driver.findElements(By.xpath("(//table[@id='product'])[1]//td")).size();
	  
	  System.out.println("---Print all data in table---");
	  
//	  for(int i=1; i<=rowSize; i++)
//	  {
//		  for(int j=1; j<=ColSize; j++)
//		  {
//			  List<WebElement> data = driver.findElements(By.xpath("(//table[@id='product'])[1]//tr["+(i+1)+"]/td["+j+"]"));
//			   
//			  for(WebElement s1 : data)
//			  {
//				  System.out.print(s1.getText()+" ");
//			  }
//		  }
//		  System.out.println();
	  
	  
	  
	  
	  
	    for(int i=1; i<rowSize; i++)
	    {
		  for(int j=1; j<=ColSize; j++)
		  {
			  String text1 =driver.findElement(By.xpath("(//table[@id='product'])[1]//tr["+(i+1)+"]/td["+j+"]")).getText();
			   if(text1.equals("Master Selenium Automation in simple Python Language"))
			   {
				 System.out.print(i+" : "+j);
				 break;
			   }
		  }
			  
	  }
	  
	 
	
	}

}
