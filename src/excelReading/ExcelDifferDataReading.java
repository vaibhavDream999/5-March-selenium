package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDifferDataReading {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

		File Myfile= new File("C:\\Users\\Niranjan Shinde\\Documents\\velocity practise API.xlsx");
		Sheet Mysheet = WorkbookFactory.create(Myfile).getSheet("Sheet4");
		
//		This is one of the method to find type
//		CellType type = Mysheet.getRow(0).getCell(0).getCellType();
//		System.out.println(type);
		
//		This is 2nd method to find type
//		Cell cell = Mysheet.getRow(2).getCell(0);
//		CellType type = cell.getCellType();
		
		
		int LastRowNum = Mysheet.getLastRowNum();
		int TotalRowNum = LastRowNum;     					   ////To Find TotalNumber Of Rows
		
		short LastCellNum = Mysheet.getRow(TotalRowNum).getLastCellNum();
		int TotalCellNum = LastCellNum-1;                      //To Find TotalNumber Of Cell/Columns
		
		for(int i=0;i<=TotalRowNum;i++) 
		{
			for(int j=0;j<=TotalCellNum;j++) 
			{
				Cell cell = Mysheet.getRow(i).getCell(j);
				CellType type = cell.getCellType();
		//cell.setBlank();// if we have blank space in table
				if(type==CellType.STRING) 
				{
					System.out.println(cell.getStringCellValue()+" ");
				}
				else if(type==CellType.BOOLEAN) 
				{
					System.out.println(cell.getBooleanCellValue()+" ");
				}
				else if(type==CellType.NUMERIC) 
				{
					System.out.println(cell.getNumericCellValue()+" ");
				}
			}
			System.out.println();
		}
	}
}
