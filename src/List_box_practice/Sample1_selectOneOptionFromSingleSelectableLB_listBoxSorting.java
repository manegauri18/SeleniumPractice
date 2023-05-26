package List_box_practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample1_selectOneOptionFromSingleSelectableLB_listBoxSorting 
{
	public static void main(String[] args)
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		WebElement skills = driver.findElement(By.xpath("//select[@id='Skills']"));
		
	    Select s = new Select(skills);
		//s.selectByIndex(1);
		//s.selectByValue("APIs");
		s.selectByVisibleText("C++");
		
		String firstOption = s.getFirstSelectedOption().getText();
		System.out.println(firstOption);
		
		int size = s.getOptions().size();
		System.out.println(size);
		System.out.println("-----------------------");
		
		ArrayList<String> al= new ArrayList<String>();
		List<WebElement> allOptions = s.getOptions();
		
		for(WebElement L : allOptions)
		{
			String text = L.getText();
			al.add(text);
		}
		
		Collections.sort(al);
		
		for(String s1 : al)
		{
			System.out.println(s1);
		}
		
		
		
		
		
		
		
		
	}

}
