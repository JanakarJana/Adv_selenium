package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ExcelFileDataDriven {
	@Test
	public void testcase() throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\janakaar\\Documents\\datadriven.xlsx");
		Workbook w = WorkbookFactory.create(fis);
		Sheet s = w.getSheet("Sheet1");
		Row r = s.getRow(0);
		Cell c = r.getCell(0);
		String res = c.getStringCellValue();		//Fetching the data of the 1st cell
		Reporter.log(res,true);
		System.out.println();
	}
	@Test			// to fetch all the data from the excel sheet
	public void testcase1() throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("C:\\\\Users\\\\janakaar\\\\Documents\\\\datadriven.xlsx");
		Workbook w = WorkbookFactory.create(fis);
		Sheet s = w.getSheet("Sheet1");
		
		int rowsize = s.getPhysicalNumberOfRows();		//To get the number of rows
		int cellsize = s.getRow(0).getPhysicalNumberOfCells();	// To get the number of columns
		
		for(int i=0;i<rowsize;i++) {
			for(int j=-0;j<cellsize;j++) {
				String res = s.getRow(i).getCell(j).getStringCellValue();
				System.out.print(res +" ");
			}
			System.out.println();
		}
	}
	
}
