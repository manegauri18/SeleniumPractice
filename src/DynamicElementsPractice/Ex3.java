package DynamicElementsPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex3 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("readme 11 pro");
		
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		String reviews = driver.findElement(By.xpath("(//div[@cel_widget_id='MAIN-SEARCH_RESULTS-3']//span)[6]")).getText();
		System.out.println("reviews: "+reviews);
	}

}
