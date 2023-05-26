package Excel_sheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex9_Assignment_getAllDataInSheet 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\91738\\Desktop\\Selenium software\\Excel sheet\\28th Jan.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet4");
		
		int lastRowIndex = sh.getLastRowNum();
		int lastColIndex = sh.getRow(0).getLastCellNum()- 1;
		
		for(int i=0; i<=lastRowIndex; i++)
		{
			
			for(int j=0; j<=lastColIndex; j++)
			{
				  String value = sh.getRow(i).getCell(j).getStringCellValue();
				  System.out.print(value+" ");
			}
			System.out.println();
			
			
		}
		

	}

}
