package scorlling;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setposition {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		
		// To set Position--> use Point class and create object of Point class
		System.out.println(driver.manage().window().getPosition());
		// regular position of browser=(-8, -8)
		
		Point per= new Point(13, 10);
		Thread.sleep(200);
		driver.manage().window().setPosition(per);
		
		Point per1= new Point(142, 120);// Extra worked by me
		Thread.sleep(200);
		driver.manage().window().setPosition(per1);// Extra worked by me
	}

}
