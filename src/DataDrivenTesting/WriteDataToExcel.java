package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataToExcel {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis = new FileInputStream("./Test Data Resources/text data.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sh = wb.getSheet("Sheet 1");
		Row r = sh.createRow(2);
		//Row r = sh.getRow(2);
		Cell c = r.createCell(0);
		
		c.setCellValue("text");
		
		FileOutputStream fos = new FileOutputStream("./Test Data Resources/text data.xlsx");
		wb.write(fos);
		wb.close();
		
		
	}

}
