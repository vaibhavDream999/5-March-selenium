package kiteWithExcel;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NotificationDisable {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		// Here We can Use WorkbookFactory for reading Through Excel
		File Myfile= new File("C:\\Users\\Niranjan Shinde\\Documents\\velocity practise API.xlsx");
		Sheet MySheet = WorkbookFactory.create(Myfile).getSheet("Sheet5");
		String userName = MySheet.getRow(0).getCell(0).getStringCellValue();
		String password = MySheet.getRow(0).getCell(1).getStringCellValue();
		String kitepin = MySheet.getRow(0).getCell(2).getStringCellValue();
		
		KiteLoginPage login= new KiteLoginPage(driver);
		
		login.sendUserName(userName);
		//login.sendUserName(MySheet.getRow(0).getCell(0).getStringCellValue());
		// if we dont save reference variable ,then we also use it as like above
		login.sendPassword(password);
		login.clickOnLoginButton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		KitePinPage pin= new KitePinPage(driver);
		pin.sendPin(kitepin);
		pin.clickOnContinueButton();
	}

}
