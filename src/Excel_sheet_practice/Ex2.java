package Excel_sheet_practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex2 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file =new FileInputStream("C:\\Users\\91738\\Desktop\\Selenium software\\Excel sheet\\28th Jan.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
		
		int lastCloIndex = sh.getRow(0).getLastCellNum()-1;
		int lastRowIndex = sh.getLastRowNum();
						
		for(int i=0; i<=lastRowIndex; i++)
		{
			for(int j=0; j<=lastCloIndex; j++)
			{
				String value = sh.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
	}

}
