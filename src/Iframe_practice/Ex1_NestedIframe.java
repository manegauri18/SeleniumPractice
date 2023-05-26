package Iframe_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_NestedIframe 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		
		//switch to outer frame
		driver.switchTo().frame("iframeResult");
		
		//get text from outer frame
		String text = driver.findElement(By.xpath("//p[text()='You can use the height and width attributes to specify the size of the iframe:']")).getText();
		System.out.println("Outer frame text is: "+text);
		
		//switch to inner frame
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Iframe Example']")));
		
		//get text from inner frame
		String text1 = driver.findElement(By.xpath("//h1[text()='This page is displayed in an iframe']")).getText();
		System.out.println("Inner frame text is: "+text1);
		
		//switch to main frame
		//driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		
		//click on 'Open Menu' button present on main page
		driver.findElement(By.xpath("//a[@title='Open Menu']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
