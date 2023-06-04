package Web_table_practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2 
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
	//	System.out.println(allRows);

		List<WebElement> allCol = driver.findElements(By.xpath("//table[@id='customers']//td"));
		//System.out.println(allCol);
		
		String text = driver.findElement(By.xpath("//table[@id='customers']//tr[2]/td[3]")).getText();
		System.out.println(text);
		
		System.out.println("---Get all data from webTable---");
		for(WebElement cells: allCol)
		{
			String actData = cells.getText();
			System.out.println(actData+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
