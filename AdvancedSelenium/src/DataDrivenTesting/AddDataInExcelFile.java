package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class AddDataInExcelFile {
	@Test
	public void testcase() throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\janakaar\\Documents\\datadriven.xlsx");
		 Workbook w = WorkbookFactory.create(fis);
		 Sheet s =  w.createSheet("sheet2");
		 Row r = s.createRow(0);
		 Cell c = r.createCell(0);
		 c.setCellValue("Selenium");
		 
		 FileOutputStream fos = new FileOutputStream("C:\\Users\\janakaar\\Documents\\datadriven.xlsx");
		 
		 w.write(fos);
		 
		 w.close();
		 
	}
	
}
