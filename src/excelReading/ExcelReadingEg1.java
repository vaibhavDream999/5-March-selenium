package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadingEg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		File Mylife= new File("C:\\Users\\Niranjan Shinde\\Documents\\velocity practise API.xlsx");
		
		String name = WorkbookFactory.create(Mylife).getSheet("Sheet1").getRow(0).getCell(3).getStringCellValue();
		System.out.println(name);
		
		String name1 = WorkbookFactory.create(Mylife).getSheet("Sheet1").getRow(2).getCell(3).getStringCellValue();
		System.out.println(name1);
		
		double num = WorkbookFactory.create(Mylife).getSheet("Sheet1").getRow(3).getCell(2).getNumericCellValue();
		System.out.println(num);
	
		double num2 = WorkbookFactory.create(Mylife).getSheet("sheet1").getRow(3).getCell(1).getNumericCellValue();
		System.out.println(num2);
		
		boolean condition = WorkbookFactory.create(Mylife).getSheet("sheet1").getRow(4).getCell(0).getBooleanCellValue();
		System.out.println(condition);
		
		boolean condition2 = WorkbookFactory.create(Mylife).getSheet("sheet1").getRow(4).getCell(1).getBooleanCellValue();
		System.out.println(condition2);
	}

}
