package Excel_sheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex8_getAllDataInCol 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
FileInputStream file = new FileInputStream("C:\\Users\\91738\\Desktop\\Selenium software\\Excel sheet\\28th Jan.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
		
		int lastRowIndex = sh.getLastRowNum();
		
		for(int i=0; i<=lastRowIndex; i++)
		{
			String value = sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println(value);
		}

		
	}

}
