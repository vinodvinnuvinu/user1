package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcelFile {

	public static void main(String[] args) throws IOException 
	{
		//step 1:Convert physical File into java into java Readable Object
		
		FileInputStream fis = new FileInputStream("./Test Data Resources/text data.xlsx");
		
		
		//step 2:open workbook
		//workbookfactory, sheet , row,cell should be imported from apache.poi.ss.usermodel
		//encrypteddocumentException and IOexception
		
		Workbook wb = WorkbookFactory.create(fis);
		
		//step 3:get Control over particular sheet
		Sheet sh = wb.getSheet("Sheet1");
		
		//step 4:get Control particular row
		Row r = sh.getRow(1);
		
		
		//step 5:get Control over particular cell
		Cell c = r.getCell(1);
	
		//step 6:Red data from the cell
		System.out.println(c.getStringCellValue());
		
		//step 7:close workbook
		//IO Exception
		wb.close();
		
		
		

	}

}
