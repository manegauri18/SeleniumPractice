package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Ex14_PracticeParameterWithTestNGXML 
{
	@Test
	@Parameters({"author","searchKey"})
	public void testParameterWithXML(String author, String searchKey) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement SearchText = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
		SearchText.sendKeys(searchKey);
		
	    System.out.println("Welcome ->"+author+" Your search key is->"+searchKey);
	    Thread.sleep(3000);
	    System.out.println("Value in Google Search Box = "+SearchText.getAttribute("value") +" ::: Value given by input = "+searchKey);
		
	    Assert.assertTrue(SearchText.getAttribute("value").equalsIgnoreCase(searchKey));
	    
	}

}

