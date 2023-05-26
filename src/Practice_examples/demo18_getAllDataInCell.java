package Practice_examples;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class demo18_getAllDataInCell
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\91738\\Desktop\\Selenium software\\Excel sheet\\28th Jan.xlsx");
		
		 Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
		 
		 int LastRowIndex = sh.getLastRowNum();
		 
		 for(int i=0; i<=LastRowIndex; i++)
		 {
			 String value = sh.getRow(i).getCell(0).getStringCellValue();
			 System.out.println(value);
		 }
		
	}

}
