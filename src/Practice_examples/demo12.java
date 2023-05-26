package Practice_examples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demo12 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(3000);
		
		WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
		
		Select s = new Select(month);
		
		ArrayList<String> al = new ArrayList<String>();
		List<WebElement> alloptions = s.getOptions();
		
	   for(WebElement s1 : alloptions)
		{
			String S = s1.getText();
			al.add(S);
		}
	   
	   Collections.sort(al);
	   
	   for(String s2 : al)
	   {
		   System.out.println(s2);
	   }
	   
	   
	   
	   
		
	}

}
