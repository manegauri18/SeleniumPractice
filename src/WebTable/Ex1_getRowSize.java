package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_getRowSize 
{
	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/91738/Desktop/Selenium%20software/HTML%20Files/Sample6.html");
		
//		List<WebElement> rowSize = driver.findElements(By.xpath("//table[@id='1234']//tr"));
//		
//		int size = rowSize.size();
//		System.out.println(size);
		
		int rowSize = driver.findElements(By.xpath("//table[@id='1234']//tr")).size();
		System.out.println(rowSize);
		
		
	}

}
