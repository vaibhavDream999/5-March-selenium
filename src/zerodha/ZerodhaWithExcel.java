package zerodha;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZerodhaWithExcel {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(300);
		driver.get("https://kite.zerodha.com/");
		
		// Solve  Zerodha with Excel sheet
		File Myfile= new File("C:\\Users\\Niranjan Shinde\\Documents\\velocity practise API.xlsx");
		Sheet MySheet = WorkbookFactory.create(Myfile).getSheet("Sheet5");
		
		String UN = MySheet.getRow(0).getCell(0).getStringCellValue();
		String PWD = MySheet.getRow(0).getCell(1).getStringCellValue();
		String PIN = MySheet.getRow(0).getCell(2).getStringCellValue();// use"'" apostropy symbol for convert numeric to String value
		System.out.println(PIN);
		WebElement username = driver.findElement(By.id("userid"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		username.sendKeys(UN);
		password.sendKeys(PWD);
		loginButton.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		WebElement pin = driver.findElement(By.id("pin"));
		WebElement continueButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		pin.sendKeys(PIN);
		continueButton.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		WebElement userId = driver.findElement(By.xpath("//span[@class='user-id']"));
		String actualuserId = userId.getText();
		String expecteduserId = UN;
		
		if(actualuserId.equals(expecteduserId)) 
		{
			System.out.println("UserId is matching and TC is passed");
		}
		else 
		{
			System.out.println("UserId is not matchng and TC is failed");
		}
		
		Thread.sleep(2000);
		userId.click();
		Thread.sleep(2000);
		WebElement logoutButton = driver.findElement(By.xpath("//a[@target='_self']"));
		logoutButton.click();
		Thread.sleep(1000);
		driver.close();
	  }
   }


