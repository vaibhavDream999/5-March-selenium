package scorlling;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://in.bookmyshow.com/explore/home/mumbai");
		driver.manage().window().maximize();
		
		// To set Position--> use Point class and create object of Point class
		System.out.println(driver.manage().window().getPosition());
		// regular postion of browser=(10, 10)
		
		Point sr= new Point(6, 20);
		Thread.sleep(200);
		driver.manage().window().setPosition(sr);

	}

}
