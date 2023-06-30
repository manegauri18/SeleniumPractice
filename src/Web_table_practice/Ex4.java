package Web_table_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex4 
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		int rowSize = driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
		System.out.println(rowSize);
		
		
		int colSize = driver.findElements(By.xpath("//table[@id='customers']//tr[3]//td")).size();
		System.out.println(colSize);
		
		System.out.println("---get index of data---");
		
		for(int i=1; i<rowSize; i++)
		{
			for(int j=1; j<=colSize; j++)
			{
				String actValue = driver.findElement(By.xpath("//table[@id='customers']//tr["+(i+1)+"]//td["+j+"]")).getText();
				
				if(actValue.equals("Mexico"))
				{
					System.out.println(i +":"+ j);
					break;
				}
			}
		}
	}

}
