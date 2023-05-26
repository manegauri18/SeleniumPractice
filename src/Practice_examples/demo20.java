package Practice_examples;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class demo20 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\91738\\Desktop\\Selenium software\\Excel sheet\\28th Jan.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		int lastColIndex = sh.getRow(0).getLastCellNum()-1;
		
		int rowSize = sh.getLastRowNum()+ 1;
		
		System.out.println(rowSize);
		
		for(int i=0; i<=lastColIndex; i++)
		{
			Cell cellInfo = sh.getRow(0).getCell(i);
			CellType s1 = cellInfo.getCellType();
			
			if(s1==CellType.STRING)
			{
				String value = cellInfo.getStringCellValue();
				System.out.print(value+" ");
			}
			else if (s1==CellType.NUMERIC) 
			{
				double value = cellInfo.getNumericCellValue();
				System.out.print(value+" ");
			}
			else if (s1==CellType.BOOLEAN)
			{
				boolean value = cellInfo.getBooleanCellValue();
				System.out.print(value);
			}
		}
		
	}

}
