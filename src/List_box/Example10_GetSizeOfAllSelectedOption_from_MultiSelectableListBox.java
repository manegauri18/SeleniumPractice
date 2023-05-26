package List_box;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example10_GetSizeOfAllSelectedOption_from_MultiSelectableListBox 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/91738/Desktop/Selenium%20software/HTML%20Files/Sample4.html");
		
		WebElement Selectcountry = driver.findElement(By.xpath("//select[@id='1234']"));
		
		Select s = new Select(Selectcountry);
		
		s.selectByVisibleText("PAK");
		s.selectByVisibleText("USA");
		s.selectByVisibleText("IND");
		
		List<WebElement> getallselectedoption = s.getAllSelectedOptions();
		
//		int size = s.getAllSelectedOptions().size();
//		System.out.println(size);
		
		List<WebElement> getallselectedoptions = s.getAllSelectedOptions();
		int size = getallselectedoptions.size();
		System.out.println(size);
		
	}

}
