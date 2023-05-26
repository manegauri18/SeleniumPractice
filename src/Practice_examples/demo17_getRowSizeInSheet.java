package Practice_examples;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class demo17_getRowSizeInSheet
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\91738\\Desktop\\Selenium software\\Excel sheet\\28th Jan.xlsx");
		
//		int RowSize = WorkbookFactory.create(file).getSheet("Sheet2").getLastRowNum()+ 1;
//		System.out.println(RowSize);
		
		short ColSize = WorkbookFactory.create(file).getSheet("Sheet2").getRow(1).getLastCellNum();
		System.out.println(ColSize);
	}

}
