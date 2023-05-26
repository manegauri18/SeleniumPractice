package List_box_practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex8 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(3000);
		
		WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
		
		Select s = new Select(month);
	    s.selectByValue("7");
	    
	     String option = s.getFirstSelectedOption().getText();
	     System.out.println(option);
	     
	     boolean result = s.isMultiple();
	     System.out.println(result);
	     
	     if (result) 
	     {
	    	 System.out.println("List box is of multi-selectable");
			
		 } 
	     else
	     {
            System.out.println("List box is of single selectable");
		 }
	     
	     
	     
	     
//	    System.out.println("---get all options from list---");
//	    
//	    ArrayList<String> al = new ArrayList<String>();
//	    List<WebElement> allOptions = s.getOptions();
//	   
//	    for(WebElement s1 : allOptions)
//	    {
//	    	String text = s1.getText();
//	    	al.add(text);
//	    }
//	  
//        Collections.sort(al);
//	    
//	    for(String s2 : al)
//	    {
//	    	System.out.println(s2);
//	    }
//	    
	    
	    
	    
	    
	    
	     

	}

}
