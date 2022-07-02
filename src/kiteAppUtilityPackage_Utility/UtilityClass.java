package kiteAppUtilityPackage_Utility;

import java.io.File;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class UtilityClass
{
	// it is used for
	
	// Data Reading From Excel Sheet
  public static String readDataFromExcelSheet(int row, int cell) throws EncryptedDocumentException, IOException 
	{
	File Myfile= new File("C:\\Users\\Niranjan Shinde\\Documents\\velocity practise API.xlsx");
	Sheet MySheet = WorkbookFactory.create(Myfile).getSheet("Sheet5");
	String myValue = MySheet.getRow(row).getCell(cell).getStringCellValue();
	
	return myValue;// add Return Statement
	}
  
	// Takes Screenshot Activity
  public static void takeScreenshot(WebDriver driver) throws IOException 
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String random = RandomString.make(3);
		File dest= new File("C:\\Users\\Niranjan Shinde\\Pictures\\Utility Screenshot\\myscreenshot"+random+".png");
		FileHandler.copy(src, dest);
    }
  
    
}