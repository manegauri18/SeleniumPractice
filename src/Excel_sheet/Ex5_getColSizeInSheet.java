package Excel_sheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex5_getColSizeInSheet 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\91738\\Desktop\\Selenium software\\Excel sheet\\28th Jan.xlsx");
		
		short ColSize = WorkbookFactory.create(file).getSheet("Sheet2").getRow(0).getLastCellNum();
		System.out.println(ColSize);
		
	}

}
