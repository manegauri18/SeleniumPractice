package Practice_POM_DDF_TestNG_BaseUtilityClass;

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

public class UtilityClass1 
{
	Sheet sh;
	public static String getDataFromExcel(int RowIndex, int ColIndex) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\91738\\Desktop\\Selenium software\\Excel sheet\\28th Jan.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		
		String value = sh.getRow(RowIndex).getCell(ColIndex).getStringCellValue();
		return value;	
	}
	
	public static void CaptureSS(WebDriver driver, int TCID) throws IOException 
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File des = new File("C:\\Users\\91738\\Desktop\\Selenium software\\Screenshot");
		
		FileHandler.copy(src, des);
	}
	
	public static String getPFdata(String key) throws IOException 
	{
		FileInputStream file= new FileInputStream("C:\\Users\\91738\\Desktop\\Selenium software\\workspacefor 28th jan 23\\PropertyFile.properties");
		
		Properties p= new Properties();
		p.load(file);
		
		String value = p.getProperty(key);
		return value;
		
		
		
	}

}
