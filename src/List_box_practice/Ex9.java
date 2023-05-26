package List_box_practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex9 
{
   public static void main(String[] args) throws InterruptedException 
	{
	   WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/91738/Desktop/Selenium%20software/HTML%20Files/Sample4.html");
		
		WebElement selectCountry = driver.findElement(By.xpath("//select[@id='1234']"));
		
		Select s = new Select(selectCountry);
		s.selectByIndex(1);
		s.selectByVisibleText("PAK");
		s.selectByIndex(0);
		Thread.sleep(3000);
		
		String firstopt = s.getFirstSelectedOption().getText();
		System.out.println(firstopt);
		System.out.println("---get all options---");
		
		ArrayList<String> al = new ArrayList<String>();
		List<WebElement> allOptions = s.getOptions();
		
		
		for(WebElement s1 : allOptions)
		{
			String text = s1.getText();
			al.add(text);
		}
		
		Collections.sort(al);
		
		for(String s2 : al)
		{
			System.out.println(s2);
		}
		
		
		
		
		
//		List<WebElement> allselecopt = s.getAllSelectedOptions();
//		
//		for(WebElement s1 : allselecopt)
//		{
//			String text = s1.getText();
//			System.out.println(text);
//		}
		
		

	}

}
