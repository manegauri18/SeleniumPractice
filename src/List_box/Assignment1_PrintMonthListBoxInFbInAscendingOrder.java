package List_box;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1_PrintMonthListBoxInFbInAscendingOrder 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(4000);
		
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		
		Select s = new Select(month);
		
		//for sorting data in month listbox, use arraylist
		ArrayList<String> al = new ArrayList<String>();
		List<WebElement> allOptions = s.getOptions();
		
		for(WebElement s1:allOptions)
		{
		  String S = s1.getText();
		  al.add(S);
		}
		
		Collections.sort(al);
		
		for(String s2 :al )
		{
			System.out.println(s2);
		}
		
	}

}
