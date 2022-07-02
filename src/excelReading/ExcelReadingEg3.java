package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadingEg3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		File Myfile= new File("C:\\Users\\Niranjan Shinde\\Documents\\velocity practise API.xlsx");
		Sheet Mysheet = WorkbookFactory.create(Myfile).getSheet("Sheet2");
		
		// this is "static coding" for reading row
		// if we remove/add any column in existing table,then there will be "NullPointerException" displayed.
//		for(int i=0;i<=3;i++) // for 1st row of sheet2
//		{
//			String value = Mysheet.getRow(0).getCell(i).getStringCellValue();
//			System.out.println(value);
//		}
//		System.out.println("===========================================================");
//		
//		for(int i=0;i<=3;i++) // for 2nd row of sheet2
//		{
//			String value = Mysheet.getRow(1).getCell(i).getStringCellValue();
//			System.out.println(value);
//		}
//		System.out.println("===========================================================");
//		
//		for(int i=0;i<=3;i++) // for 3rd row of sheet2
//		{
//			String value = Mysheet.getRow(2).getCell(i).getStringCellValue();
//			System.out.println(value);
//		}
		int LastRowNum = Mysheet.getLastRowNum();
		int TotalRowCount = LastRowNum;
		System.out.println(TotalRowCount);
		
		int LastCellNum = Mysheet.getRow(0).getLastCellNum();
		int TotalCellCount = LastCellNum-1;
		System.out.println(TotalCellCount);
		
		for(int i=0;i<=TotalCellCount;i++) // "Dynamic Coding"
		{
			String value = Mysheet.getRow(0).getCell(i).getStringCellValue();
			System.out.println(value);
		}
	}

}
