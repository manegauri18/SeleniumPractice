package Practice_examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo6 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	    Thread.sleep(3000);
	    
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    
	    driver.navigate().to("https://www.facebook.com/");
	    Thread.sleep(2000);
	    
//	    String url = driver.getCurrentUrl();
//	    System.out.println(url);
	    
	    String title = driver.getTitle();
	    System.out.println(title);
	  
	    
	    driver.close();
	    
	    
	    
		

	}

}
