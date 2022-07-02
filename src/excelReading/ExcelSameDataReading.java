package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSameDataReading {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

		File Myfile= new File("C:\\Users\\Niranjan Shinde\\Documents\\velocity practise API.xlsx");
		Sheet Mysheet = WorkbookFactory.create(Myfile).getSheet("Sheet3");
		
		// read total columns by using "Static Coding"
		for(int i=0;i<=2;i++) 
		{
			for(int j=0;j<=2;j++) 
			{
				String value = Mysheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+"  ");
			}
			System.out.println();
		}
		
		// read total columns by using "Dynamic Coding"
		int LastRowNum = Mysheet.getLastRowNum();
		int TotalRowNum = LastRowNum;
		System.out.println(TotalRowNum);
		
		short LastCellNum = Mysheet.getRow(0).getLastCellNum();
		int TotalCellNum = LastCellNum-1;
		System.out.println(TotalCellNum);
		
		for(int i=0;i<=TotalRowNum;i++) 
		{
			for(int j=0;j<=TotalCellNum;j++) 
			{
				String value = Mysheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+" ");
			}
			System.out.println();
		}
	}

}
