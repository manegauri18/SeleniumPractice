package Daily_mock;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sample1_getString_numeric_booleanData 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\91738\\Desktop\\Selenium software\\Excel sheet\\28th Jan.xlsx");
		
		String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(value);
		
		
//		double value1 =WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(1).getNumericCellValue();
//		System.out.println(value1);
		
		
//		 boolean value2 = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(2).getBooleanCellValue();
//		System.out.println(value2);
//		
		
		
		
		
		
		
		
		
	}

}
