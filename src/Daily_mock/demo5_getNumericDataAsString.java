package Daily_mock;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class demo5_getNumericDataAsString 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\91738\\Desktop\\Selenium software\\Excel sheet\\28th Jan.xlsx");
		
		String value = WorkbookFactory.create(file).getSheet("Sheet3").getRow(0).getCell(1).getStringCellValue();
		System.out.println(value);
		
	}

}
