package Daily_mock;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Vector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToChildWindow 
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//click on 'Orange HRM link' from main page
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		
		//get child window ID
		Set<String> allIds = driver.getWindowHandles();
		//ArrayList<String> al= new ArrayList<String>(allIds);
		List<String> ref= new ArrayList<String>(allIds);
		//Vector< String> V = new Vector<String>(allIds);
		
		//switch to child window
		driver.switchTo().window(ref.get(1));
		
		//click on 'book a free demo' btn from child window
		driver.findElement(By.xpath("(//button[text()='Book a Free Demo'])[2]")).click();
		
		//switch to main page
		driver.switchTo().window(ref.get(0));
		
		//enter UN
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		
		//enter PWD
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		
		
		
	}

}
