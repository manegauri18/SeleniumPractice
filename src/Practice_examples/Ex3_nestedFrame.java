package Practice_examples;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Ex3_nestedFrame
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");  // --->switch to outer frame
		
		//get the text inside outer frame
		String text = driver.findElement(By.xpath("//p[contains(text(),'You can use the height and width')]")).getText();
		System.out.println("Text present inside outer frame is:"+text);
		
		//switch to inner frame
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Iframe Example']")));
		
		//get the text inside inner frame
		String text1 = driver.findElement(By.xpath("//h1[text()='This page is displayed in an iframe']")).getText();
		System.out.println("Text present inside inner frame is: "+text1);
		
		driver.switchTo().defaultContent();
	}

}
