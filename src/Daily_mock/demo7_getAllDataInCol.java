package Daily_mock;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class demo7_getAllDataInCol 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
FileInputStream file = new FileInputStream("C:\\Users\\91738\\Desktop\\Selenium software\\Excel sheet\\28th Jan.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
		
		int RowIndex = sh.getLastRowNum();
		
		for(int i=0; i<=RowIndex; i++)
		{
			String value = sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println(value);
		}
		
		
	}

}
