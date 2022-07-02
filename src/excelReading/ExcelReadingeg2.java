package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadingeg2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

		File Myfile= new File("C:\\Users\\Niranjan Shinde\\Documents\\velocity practise API.xlsx");
		
		// we can spread up the method like this
		Workbook book = WorkbookFactory.create(Myfile);
		Sheet excelsheet = book.getSheet("Sheet2");
		Row row = excelsheet.getRow(0);
		Cell cell = row.getCell(0);
		CellType type = cell.getCellType();
		System.out.println(type);
		String value = cell.getStringCellValue();
		System.out.println(value);
	}
}
