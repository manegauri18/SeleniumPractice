package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2_getColSizeInRow 
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/91738/Desktop/Selenium%20software/HTML%20Files/Sample6.html");
		
//		List<WebElement> colSize = driver.findElements(By.xpath("//table[@id='1234']//tr[4]/td"));
//		
//		int size = colSize.size();
//		System.out.println(size);
		
		int colSize = driver.findElements(By.xpath("//table[@id='1234']//tr[4]/td")).size();
		System.out.println(colSize);
		
		
		//for header
		int size1 = driver.findElements(By.xpath("//table[@id='1234']//tr[1]/th")).size();
		System.out.println(size1);
	}

}
