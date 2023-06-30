package Practice1_POM_DDF_TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass 
{
	
	public static String GetDataFromExcel(int RowIndex, int ColIndex) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\91738\\Desktop\\Selenium software\\Excel sheet\\28th Jan.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		
		String value = sh.getRow(RowIndex).getCell(ColIndex).getStringCellValue();
		return value;	
	}
	
	public  static void CaptureSS(WebDriver driver, int TCID) throws IOException 
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File des = new File("C:\\Users\\91738\\Desktop\\Selenium software\\Screenshot\\TestCase" +TCID+ ".jpg");
		
		FileHandler.copy(src, des);	
	}
	
	public static String getDataFromPF(String key) throws IOException
	{
		FileInputStream file = new FileInputStream("D:\\Eclipse\\workspace\\SeleniumPractice\\PropertyFile.properties");
		
		Properties p= new Properties();
		p.load(file);
		
		String value = p.getProperty(key);
		
		return value;	
	}

}
