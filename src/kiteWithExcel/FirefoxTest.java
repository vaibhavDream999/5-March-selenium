package kiteWithExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		WebDriver  driver= new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.get("https://kite.zerodha.com/");
	}

}
