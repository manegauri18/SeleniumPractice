package Broken_Links;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1
{
	 private static WebDriver driver = null;

	    public static void main(String[] args) 
	    {
	        String homePage = "http://www.zlti.com";
	        String url = "";
	        HttpURLConnection huc = null;
	        int respCode = 200;
	        
	        driver = new ChromeDriver();
	        
	        driver.manage().window().maximize();
	        
	        driver.get(homePage);
	        
	        List<WebElement> links = driver.findElements(By.tagName("a"));
	        
	       for(WebElement link :links)
	        {
	            link.getAttribute("href");
	            
	            System.out.println(url);
	        
	            if(url == null || url.isEmpty())
	            {
	            System.out.println("URL is blank or it is empty");
	                continue;
	            }
	            
	            if(!url.startsWith(homePage))
	            {
	                System.out.println("URL belongs to another domain, skipping it.");
	                continue;
	            }
	            
	            try 
	            {
	                huc = (HttpURLConnection)(new URL(url).openConnection());
	                
	                huc.setRequestMethod("HEAD");
	                
	                huc.connect();
	                
	                respCode = huc.getResponseCode();
	                
	                if(respCode >= 400)
	                {
	                    System.out.println(url+" is a broken link");
	                }
	                else
	                {
	                    System.out.println(url+" is a valid link");
	                }
	             } 
	            catch (MalformedURLException e) 
	            {
	                e.printStackTrace();
	            } 
	            catch (IOException e) 
	            {
	                e.printStackTrace();
	            }
	        }
	        
	        driver.quit();

	    }
}



