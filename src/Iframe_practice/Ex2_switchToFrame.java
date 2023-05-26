package Iframe_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2_switchToFrame 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		
		driver.switchTo().frame("iframeResult");
		
		String text = driver.findElement(By.xpath("//p[text()='You can use the height and width attributes to specify the size of the iframe:']")).getText();
		System.out.println("Outer frame text: "+text);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Iframe Example']")));
		
		String text1 = driver.findElement(By.xpath("//h1[text()='This page is displayed in an iframe']")).getText();
		System.out.println(text1);
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[@id='menuButton']")).click();

		
	}

}
