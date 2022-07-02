package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadingEg4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		File Myfile= new File("C:\\Users\\Niranjan Shinde\\Documents\\velocity practise API.xlsx");
		Sheet book = WorkbookFactory.create(Myfile).getSheet("Sheet2");
		
		// to read one column
		// static coding
		for(int i=0;i<=4;i++) 
		{
			String value = book.getRow(i).getCell(0).getStringCellValue();
			System.out.println(value);
		}
		for(int i=0;i<=3;i++) 
		{
			String value = book.getRow(i).getCell(1).getStringCellValue();
			System.out.println(value);
		}
		for(int i=0;i<=3;i++) 
		{
			String value = book.getRow(i).getCell(2).getStringCellValue();
			System.out.println(value);
		}
		for(int i=0;i<=3;i++) 
		{
			String value = book.getRow(i).getCell(3).getStringCellValue();
			System.out.println(value);
		}
		
		// Dynamic Testing
		int LastRowNum = book.getLastRowNum();
		int TotalRowNum = LastRowNum;
		System.out.println(TotalRowNum);
		
		for(int i=0;i<=TotalRowNum;i++) 
		{
			String value = book.getRow(i).getCell(0).getStringCellValue();
			System.out.println(value);
		}
		for(int i=0;i<=TotalRowNum;i++) 
		{
			String value = book.getRow(i).getCell(1).getStringCellValue();
			System.out.println(value);
		}
	}

}
