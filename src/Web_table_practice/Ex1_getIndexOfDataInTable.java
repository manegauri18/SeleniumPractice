package Web_table_practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_getIndexOfDataInTable
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		int r = driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
		System.out.println("Row size: "+r);
		
		
		int c = driver.findElements(By.xpath("//table[@id='customers']//tbody/tr/th")).size();
		System.out.println("Col size: "+c);
		
		System.out.println("----get all data from table----");
		
//		for(int i=1; i<=r; i++)
//		{
//			for(int j=1; j<=c; j++)
//			{
//				 String data = driver.findElement(By.xpath("//table[@id='customers']//tbody/tr["+i+"]/td["+j+"]")).getText();
//				 System.out.print(data+" ");
//			}
//			System.out.println();
//		}
		
		for(int i=1; i<r; i++)
		{
			for(int j=1; j<=c; j++)
			{
				String actValue = driver.findElement(By.xpath("//table[@id='customers']//tbody/tr["+(i+1)+"]/td["+j+"]")).getText();
				
				if(actValue.equals("Italy"))
				{
					System.out.println(i+" : "+j);
					break;
				}
				
				
			}
		}

	}

}
