package Excel_sheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex13_getDataByVerifyingTypeOfCell
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		 FileInputStream file = new FileInputStream("C:\\Users\\91738\\Desktop\\Selenium software\\Excel sheet\\28th Jan.xlsx");
		 
		 Sheet sh = WorkbookFactory.create(file).getSheet("Sheet5");
		
		 Cell cellInfo = sh.getRow(0).getCell(1);
		 CellType s1 = cellInfo.getCellType();
		 
		 if(s1==CellType.STRING)
		 {
			 String value = cellInfo.getStringCellValue();
			 System.out.println(value);
		 }
		 else if (s1==CellType.NUMERIC) 
		 {
			double value = cellInfo.getNumericCellValue();
			System.out.println(value);
		}
		 else if (s1==CellType.BOOLEAN) 
		 {
			boolean value = cellInfo.getBooleanCellValue();
			System.out.println(value);
		}
	}

}
