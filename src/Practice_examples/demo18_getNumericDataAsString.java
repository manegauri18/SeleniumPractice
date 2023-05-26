package Practice_examples;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class demo18_getNumericDataAsString 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\91738\\Desktop\\Selenium software\\Excel sheet\\28th Jan.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
		
		int lastCellIndex = sh.getRow(0).getLastCellNum()-1;
		
		for(int i=0; i<=lastCellIndex; i++)
		{
			String value = sh.getRow(0).getCell(i).getStringCellValue();
			System.out.print(value+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
//		String value = WorkbookFactory.create(file).getSheet("Sheet3").getRow(0).getCell(1).getStringCellValue();
//		System.out.println(value);
		
	}

}
