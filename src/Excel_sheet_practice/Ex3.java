package Excel_sheet_practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex3
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file =new FileInputStream("C:\\Users\\91738\\Desktop\\Selenium software\\Excel sheet\\28th Jan.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet5");
		
		int lastColIndex = sh.getRow(0).getLastCellNum()-1;
		
		for(int i=0; i<=lastColIndex; i++)
		{
			Cell cellInfo = sh.getRow(0).getCell(i);
			CellType s1 = cellInfo.getCellType();
			
			if(s1==CellType.STRING)
			{
				String value = cellInfo.getStringCellValue();
				System.out.print(value+" ");
			}
			
			else if(s1==CellType.NUMERIC)
			{
				double value1 = cellInfo.getNumericCellValue();
				System.out.print(value1+" ");
			}
			else if(s1==CellType.BOOLEAN)
			{
				boolean value2 = cellInfo.getBooleanCellValue();
				System.out.print(value2+" ");
			}
		}

		
	}

}
