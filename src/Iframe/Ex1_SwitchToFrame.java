package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_SwitchToFrame 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		//switch to frame
		//driver.switchTo().frame("iframeResult");  //---->approach1- string frameID
		
		//driver.switchTo().frame("iframeResult");   //---->approach2- string frameName
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']"))); //---->approach3- frame webElement
		
		//driver.switchTo().frame();         //---->approach4- int frameIndex-----not mostly used
		
		
		//click on 'click me to display date & time'
		driver.findElement(By.xpath("//button[contains(text(),'Click me to')]")).click();
		
	}

}
