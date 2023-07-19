package Iframe_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex3 
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	    
	    driver.switchTo().frame("iframeResult");
	    
	    
	    driver.findElement(By.xpath("//button[@type='button']")).click();

	    driver.switchTo().parentFrame();
	    
	    driver.findElement(By.xpath("//a[@id='menuButton']")).click();

}
}