package selenium_study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_intro {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/");
		
		//driver.close();
		
		//driver.quit();
		
		driver.manage().window().maximize();
		
		//driver.manage().window().minimize();
		
		driver.navigate().to("https://www.flipkart.com/");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		Thread.sleep(100);
		
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getTitle());
		
		String Title= driver.getTitle();
		System.out.println("Title is "+Title);
	}

}
