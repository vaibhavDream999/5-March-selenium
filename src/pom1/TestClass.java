package pom1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		KiteLoginPage login= new KiteLoginPage(driver);
		
		login.sendUserName();
		login.sendPassword();
		login.clickOnLoginButton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		KitePinPage pin= new KitePinPage(driver);
		
		pin.sendPin();
		pin.clickOnContinueButton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		KiteHomePage home= new KiteHomePage(driver);
		home.ValidateUserID();
		home.ClickOnLogOutButton();
		
		Thread.sleep(600);
		driver.close();
	}

}
