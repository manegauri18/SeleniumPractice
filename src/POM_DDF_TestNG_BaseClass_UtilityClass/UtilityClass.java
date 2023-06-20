package POM_DDF_TestNG_BaseClass_UtilityClass;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtilityClass 
{
	
	//@AuthorName: Gauri
	//This method is used to test get data from excel
	//need to pass 2 inputs: 1-RowIndex, 2-CellIndex
	public static String getTestData(int RowIndex, int ColIndex) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\91738\\Desktop\\Selenium software\\Excel sheet\\28th Jan.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		
		String value = sh.getRow(RowIndex).getCell(ColIndex).getStringCellValue();
		return value;
	}

}
