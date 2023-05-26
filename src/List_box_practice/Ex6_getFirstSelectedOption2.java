package List_box_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex6_getFirstSelectedOption2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/91738/Desktop/Selenium%20software/HTML%20Files/Sample4.html");
		
		WebElement SelectCountry = driver.findElement(By.xpath("//select[@id='1234']"));
		Thread.sleep(3000);
		
		Select s = new Select(SelectCountry);
		s.selectByIndex(2);
		s.selectByIndex(3);
		s.selectByIndex(0);
		Thread.sleep(4000);
		
		String text = s.getFirstSelectedOption().getText();
		System.out.println(text);
		System.out.println("---------------------------------------------");
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		int size = allSelectedOptions.size();
		System.out.println(size);
		System.out.println("--------------------------------------------");
		
		for(WebElement s1 : allSelectedOptions)
		{
			System.out.println(s1.getText());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
