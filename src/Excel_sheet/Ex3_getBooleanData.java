package Excel_sheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex3_getBooleanData 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
        FileInputStream file = new FileInputStream("C:\\Users\\91738\\Desktop\\Selenium software\\Excel sheet\\28th Jan.xlsx");
		
		boolean value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(2).getBooleanCellValue();
		
		System.out.println(value);
		
	}

}
